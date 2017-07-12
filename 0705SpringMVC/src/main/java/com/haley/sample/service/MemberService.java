package com.haley.sample.service;

import java.util.Map;

public interface MemberService {

	// 1. 아이디 중복 체크를 위한 메소드
	public Map<String, Object> idCheck(String id);
	
	// 2. 회원 가입을 위한 함수

}
