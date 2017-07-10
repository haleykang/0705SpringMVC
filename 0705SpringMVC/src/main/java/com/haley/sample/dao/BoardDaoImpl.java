package com.haley.sample.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.haley.sample.domain.Board;

@Repository // 객체 생성을 자동으로 하도록 해주는 어노테이션
public class BoardDaoImpl implements BoardDao {

	// 마이바티스 연동을 위한 SqlSession을 주입
	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<Board> boardList() {
		// mapper 파일에서 board.boardList의 SQL을 실행해서 결과를 리턴
		return sqlSession.selectList("board.boardList");
	}

	@Override
	public Board getBoard(int num) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("board.getBoard", num);
	}

	@Override
	public int updateReadcnt(int num) {
		// TODO Auto-generated method stub
		return sqlSession.update("board.updateReadcnt", num);
	}

	@Override
	public int maxNum() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("board.maxNum");
	}

	@Override
	public int saveBoard(Board board) {
		// TODO Auto-generated method stub
		return sqlSession.insert("board.saveBoard", board);
	}

	@Override
	public int deleteBoard(int num) {
		// TODO Auto-generated method stub
		return sqlSession.delete("board.deleteBoard", num);
	}

}
