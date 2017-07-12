package com.haley.sample.dao;

import java.util.Map;

public interface MemberDao {

	// 아이디 중복 체크를 위한 메소드
	public Map<String, Object> idCheck(String id);

	// 회원 가입을 위한 메소드
	public int insertMember(Map<String, Object> map);

}
