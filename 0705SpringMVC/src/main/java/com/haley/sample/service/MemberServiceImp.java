package com.haley.sample.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haley.sample.dao.MemberDao;

@Service
public class MemberServiceImp implements MemberService {

	@Autowired
	MemberDao dao;

	@Override
	public Map<String, Object> idCheck(String id) {

		return dao.idCheck(id);
	}

}
