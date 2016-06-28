/**
 * 
 */
package com.halo.bumf.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.halo.bumf.mvc.beans.User;

/**
 * 
 * @author zyl
 * @date 2016年6月27日 下午8:32:43
 * @version
 * @since
 */
@Controller
@RequestMapping("/main/")
public class MainController {

	@RequestMapping("/hello.do")
	public String sayHello(ModelMap map) {
		User user = new User();
		user.setUserName("Junior");
		user.setSex("1");

		map.addAttribute("user", user);
		return "/main/hello";
	}

}
