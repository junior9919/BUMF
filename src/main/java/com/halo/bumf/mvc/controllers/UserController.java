/**
 * 
 */
package com.halo.bumf.mvc.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.halo.bumf.mvc.beans.Menu;
import com.halo.bumf.mvc.beans.Role;
import com.halo.bumf.mvc.beans.User;
import com.halo.bumf.mvc.services.MenuService;
import com.halo.bumf.mvc.services.RoleService;
import com.halo.bumf.mvc.services.ServiceConstants;
import com.halo.bumf.mvc.services.UserService;
import com.halo.spring.utils.SpringUtils;

/**
 * 
 * @author zyl
 * @date 2016年7月5日 下午8:05:18
 * @version
 * @since
 */
@Controller
@RequestMapping("/user/")
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private MenuService menuService;

	@Autowired
	private RoleService roleService;

	@RequestMapping(value = "login.do", method = RequestMethod.GET)
	public String login(HttpServletRequest request) {
		if (null != SpringUtils.getFromServletContext(ServiceConstants.SESSION_ID_USER)) {
			String go = null;
			if (null != request.getParameter("go")) {
				go = request.getParameter("go");
				return "redirect:" + go;
			} else {
				return ControllerConstants.URL_REDIRECT_HOME;
			}
		}

		// String path =
		// SpringUtils.getWebApplicationContext().getServletContext().getRealPath("/");
		// System.out.println(path);
		return ControllerConstants.URL_FTL_LOGIN;
	}

	@RequestMapping(value = "login.do", method = RequestMethod.POST)
	public String login(HttpServletRequest request, ModelMap modelMap) {
		if (null != SpringUtils.getFromServletContext(ServiceConstants.SESSION_ID_USER)) {
			return ControllerConstants.URL_REDIRECT_HOME;
		}

		String userAccount = request.getParameter("userAccount");
		if (null == userAccount || userAccount.isEmpty()) {
			modelMap.addAttribute(ControllerConstants.LABEL_NAME_ERROR_MSG, SpringUtils.getMessage("user.notNull", new String[] { SpringUtils.getMessage("user.userAccount", null) }));
			return ControllerConstants.URL_FTL_LOGIN;
		}

		String passwd = request.getParameter("passwd");
		if (null == passwd || passwd.isEmpty()) {
			modelMap.addAttribute(ControllerConstants.LABEL_NAME_ERROR_MSG, SpringUtils.getMessage("user.notNull", new String[] { SpringUtils.getMessage("user.user.Passwd", null) }));
			return ControllerConstants.URL_FTL_LOGIN;
		}

		User user = new User();
		user.setUserAccount(userAccount);
		user.setPasswd(passwd);
		String rstMsg = userService.login(user);
		if (!ServiceConstants.RETURN_LOGIN_GRANTED.equals(rstMsg)) {
			modelMap.addAttribute(ControllerConstants.LABEL_NAME_ERROR_MSG, rstMsg);
			return ControllerConstants.URL_FTL_LOGIN;
		}

		User userRst = (User) SpringUtils.getFromServletContext(ServiceConstants.SESSION_ID_USER);
		menuService.getMenuByUserId(userRst.getId());

		return ControllerConstants.URL_REDIRECT_HOME;
	}

	@RequestMapping("home.do")
	public String home(HttpServletRequest request, ModelMap modelMap) {
		if (null == SpringUtils.getFromServletContext(ServiceConstants.SESSION_ID_USER)) {
			return ControllerConstants.URL_FTL_LOGIN;
		} else {
			User logonUser = (User) SpringUtils.getFromServletContext(ServiceConstants.SESSION_ID_USER);
			modelMap.addAttribute(ControllerConstants.LABEL_NAME_LOGON_USER, logonUser);

			@SuppressWarnings("unchecked")
			List<Menu> menus = (List<Menu>) SpringUtils.getFromServletContext(ServiceConstants.SESSION_ID_MENU);
			modelMap.addAttribute(ControllerConstants.LABEL_NAME_USER_MENU, menus);

			String rootUrl = request.getContextPath();
			modelMap.addAttribute(ControllerConstants.LABEL_NAME_ROOT_URL, rootUrl);

			return ControllerConstants.URL_FTL_HOME;
		}
	}

	@RequestMapping("logout.do")
	public String logout() {
		if (null != SpringUtils.getFromServletContext(ServiceConstants.SESSION_ID_USER)) {
			SpringUtils.removeFromServletContext(ServiceConstants.SESSION_ID_USER);
		}

		return ControllerConstants.URL_FTL_LOGIN;
	}

	@RequestMapping("list.do")
	public String list(HttpServletRequest request, @ModelAttribute("user") User user, ModelMap modelMap) throws ControllerException {
		String currentPage = request.getParameter("currentPage");
		if (null == currentPage || currentPage.isEmpty()) {
			currentPage = "1";
		}

		if (null == user) {
			user = new User();
		}
		user.setCurrentPage(Integer.parseInt(currentPage));

		List<User> users = userService.selectPage(user);
		modelMap.addAttribute(ControllerConstants.LABEL_NAME_USER_LIST, users);

		return ControllerConstants.URL_FTL_USER_LIST;
	}

	@RequestMapping("add.do")
	public String add() {
		return ControllerConstants.URL_FTL_USER_EDIT;
	}

	@RequestMapping("edit.do")
	public String edit(HttpServletRequest request, ModelMap modelMap) {
		int id = 0;
		if (null != request.getParameter("id")) {
			id = Integer.parseInt(request.getParameter("id"));
		}

		User userRst = userService.selectUserById(id);
		modelMap.addAttribute(ControllerConstants.LABEL_NAME_USER_SINGLE, userRst);

		List<Role> roles = roleService.selectAll();
		modelMap.addAttribute(ControllerConstants.LABEL_NAME_ROLE_LIST, roles);

		return ControllerConstants.URL_FTL_USER_EDIT;
	}

}
