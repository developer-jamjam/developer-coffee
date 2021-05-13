package com.jamjam.upc.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jamjam.upc.dto.UMember;

@Repository
public class UDAO {

	@Autowired
	private SqlSessionTemplate sql;

	public int ujoin(UMember umember) {
		
		return sql.insert("UMember.uInsert",umember);
	}

	public UMember ulogin(UMember umember) {
		
		return sql.selectOne("UMember.uLogin",umember);
	}

	

	

	
	
}
