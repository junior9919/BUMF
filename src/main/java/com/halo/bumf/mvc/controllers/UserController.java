/**
 * 
 */
package com.halo.bumf.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.halo.bumf.mvc.beans.User;
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

	@RequestMapping(value = "login.do", method = RequestMethod.GET)
	public String login() {
		if (null != SpringUtils.getFromServletContext(ServiceConstants.SESSION_ID_USER)) {
			return ControllerConstants.URL_REDIRECT_HOME;
		}

		return ControllerConstants.URL_FTL_LOGIN;
	}

	@RequestMapping(value = "login.do", method = RequestMethod.POST)
	public String login(@ModelAttribute("user") User user, ModelMap modelMap) {
		if (null != SpringUtils.getFromServletContext(ServiceConstants.SESSION_ID_USER)) {
			return ControllerConstants.URL_REDIRECT_HOME;
		}

		if (null == user || user.getUserAccount().isEmpty()) {
			modelMap.addAttribute(ControllerConstants.LABEL_NAME_ERROR_MSG, SpringUtils.getMessage("user.notNull", new String[] { SpringUtils.getMessage("user.userAccount", null) }));
			return ControllerConstants.URL_FTL_LOGIN;
		}

		if (null == user || user.getPasswd().isEmpty()) {
			modelMap.addAttribute(ControllerConstants.LABEL_NAME_ERROR_MSG, SpringUtils.getMessage("user.notNull", new String[] { SpringUtils.getMessage("user.user.Passwd", null) }));
			return ControllerConstants.URL_FTL_LOGIN;
		}

		String rstMsg = userService.login(user);
		if (!ServiceConstants.RETURN_LOGIN_GRANTED.equals(rstMsg)) {
			modelMap.addAttribute(ControllerConstants.LABEL_NAME_ERROR_MSG, rstMsg);
			return ControllerConstants.URL_FTL_LOGIN;
		}

		return ControllerConstants.URL_REDIRECT_HOME;
	}
	
}
