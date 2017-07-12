package com.haley.sample.dao;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDaoImpl implements MemberDao {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public Map<String, Object> idCheck(String id) {

		return sqlSession.selectOne("member.idCheck", id);
	}

	@Override
	public int insertMember(Map<String, Object> map) {

		return sqlSession.insert("member.insertMember", map);
	}

}
