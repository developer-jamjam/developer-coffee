package com.jamjam.upc.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.jamjam.upc.dao.UDAO;
import com.jamjam.upc.dto.UMember;

@Service
public class UService {
	@Autowired
	private UDAO dao;
	private ModelAndView mav = new ModelAndView();
	
	
	
	@Autowired
	HttpSession session;

	public ModelAndView ujoin(UMember umember) {
		
		int result= dao.ujoin(umember);
		
		if(result>0) {
			mav.setViewName("U_Login");
		}
		else {mav.setViewName("index");}
		
		
		return mav;
	}

	public ModelAndView ulogin(UMember umember) {
		
		// String loginId = dao.ulogin(umember);
		
		UMember mem = dao.ulogin(umember);
		
	
			System.out.println("umember.getUptype() : " + mem.getUptype());
			if(mem.getUptype().equals("User")) {
				mav.setViewName("U_User");
			}
			else if(mem.getUptype().equals("Business")) {
				mav.setViewName("U_Business");
			}
			
			else { mav.setViewName("U_Login");}
		
		return mav;
	}
	
	

}
