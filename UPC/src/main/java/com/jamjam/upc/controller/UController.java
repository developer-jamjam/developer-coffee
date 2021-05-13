package com.jamjam.upc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jamjam.upc.dto.UMember;
import com.jamjam.upc.service.UService;

@Controller
public class UController {
	//프로젝트 실행 시 index.jsp 실행
		@Autowired
		private UService uSvc;
		private ModelAndView mav = new ModelAndView();
		
		@Autowired
		HttpSession session;
	
		@RequestMapping(value = "/")
		public String home() {
			return "index";
		}
		
		@RequestMapping(value = "/U_Join")
		public String u_join() {
			
			return "U_Join";
		}
		
		@RequestMapping(value = "/umemberJoin")
		public ModelAndView umemberJoin(@ModelAttribute UMember umember) {
			
			mav = uSvc.ujoin(umember);
			
			return mav;
		}
		
		@RequestMapping(value = "/U_Login")
		public String u_login() {
			
			return "U_Login";
		}
		
		@RequestMapping(value = "/umemberLogin")
		public ModelAndView umemberLogin(@ModelAttribute UMember umember) {
			
			mav = uSvc.ulogin(umember);
			
			return mav;
		}
		
		
		
		
		
		
		
		
		
		
}
