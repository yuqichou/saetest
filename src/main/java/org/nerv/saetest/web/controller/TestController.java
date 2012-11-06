package org.nerv.saetest.web.controller;

import org.nerv.saetest.persistence.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	@Autowired
	UserMapper userMapper;
	
	@RequestMapping("/hello/")
	@ResponseBody
	public Object testHello(){
		return userMapper.selectAccountListPage(new PageRequest(0, 10));
	}
	
}
