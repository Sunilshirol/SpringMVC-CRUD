package com.control;

import com.mysql.cj.Session;
import com.service.StudentImpl;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

//@Controller
@RestController
public class StudentController {
	
	@RequestMapping(value="login", method=RequestMethod.POST)
	//@ResponseBody
	public ModelAndView login(@RequestParam("email")  String email,@RequestParam("pass") String pass) {
		
		StudentImpl si=new StudentImpl();
		String login=si.loginStudent(email, pass);
		System.out.println("login status:");
		if(login=="null")
		{
			ModelAndView mv=new ModelAndView();
			mv.setViewName("login");
			mv.addObject("status","failed");
			return mv;
		}else {
			ModelAndView mv=new ModelAndView();
			mv.setViewName("home");
			mv.addObject("result",login);
			return mv;
		}
	}
	
	
	@RequestMapping("save")
	public ModelAndView save(@RequestParam("name")String name,@RequestParam("email")String email,@RequestParam("pass")String pass) {
		StudentImpl si=new StudentImpl();
		String login=si.save(name,email,pass);
		System.out.println("login status:");
		if(login==null)
		{
			ModelAndView mv=new ModelAndView();
			mv.setViewName("login");
			mv.addObject("status","failed");
			return mv;
		}else {
			ModelAndView mv=new ModelAndView();
			mv.setViewName("profile");
			mv.addObject("result",login);
			return mv;
		}
	}
	
	
	
	
	
	@RequestMapping("update")
	public ModelAndView update(@RequestParam("id")int id,@RequestParam("name")String name,@RequestParam("email")String email,@RequestParam("pass")String pass) {
		
		System.out.println("Inside update");
		StudentImpl si=new StudentImpl();
		String login=si.updateData(id, name,email,pass);
		System.out.println("login status:");
		if(login==null)
		{
			System.out.println("Inside update faile");
			ModelAndView mv=new ModelAndView();
			mv.setViewName("login");
			mv.addObject("status","failed");
			return mv;
		}else {
			System.out.println("Inside update success");
			ModelAndView mv=new ModelAndView();
			mv.setViewName("updateprofile");
			mv.addObject("result",login);
			return mv;
		}
	}
	
	
	@RequestMapping("delete")
	public ModelAndView dalete(@RequestParam("id")int id) {
		StudentImpl si=new StudentImpl();
		String deldata=si.deleteData(id);
		System.out.println("login status:"+deldata);
		if(deldata==null)
		{
			ModelAndView mv=new ModelAndView();
			mv.setViewName("deletefail");
			mv.addObject("status","failed");
			return mv;
		}else {
			System.out.println("Inside update success");
			ModelAndView mv=new ModelAndView();
			mv.setViewName("delete");
			mv.addObject("result",deldata);
			return mv;
		}
	}
}

