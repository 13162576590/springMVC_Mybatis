package com.augmentum.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.augmentum.model.User;
import com.augmentum.service.IUserService;

@Controller
@RequestMapping(value="/user")
public class UserController {
	
	@Resource
	private IUserService userService;
	
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView list() {
        ModelAndView view = new ModelAndView();

        view.setViewName("list");
 
		System.out.println("ModelAndView-list");

        return view;
    }
	
	@RequestMapping(value="/save")
	public void saveUser(User user) {
		System.out.println("==================");
//		return "sss";
//		userService.saveUser(user);
	}
	
	@RequestMapping(value="/update")
	public void updateUser(User user) {
		userService.updateUser(user);
	}
	
	@RequestMapping(value="/find")
	public void findUser(String id) {
		userService.findById(id);
	}
	
	@RequestMapping(value="/find/all")
	public Map<String, String> findAllUser() {
        Map<String, String> map = new HashMap<String, String>();
		userService.findAll();
		return map;
	}

}
