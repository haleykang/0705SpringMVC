package com.haley.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haley.sample.dao.BoardDao;
import com.haley.sample.domain.Board;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDao boardDao;

	@Override
	public List<Board> boardList() {
		// 매개변수가 없으면 Dao 메소드만 호출해서 리턴
		return boardDao.boardList();
	}

	@Override
	public Board getBoard(int num) {
		// 조회수를 업데이트 하는 메소드를 실행
		boardDao.updateReadcnt(num);
		// 하나의 데이터를 가져오는 메소드를 실행
		return boardDao.getBoard(num);
	}

	@Override
	public int saveBoard(Board board) {
		// 가장 큰 글 번호 가져오는 함수 실행
		int num = boardDao.maxNum();
		// 가장 큰 글번호 + 1 해서 추가할 글 번호 만들기 ㄴ
		board.setNum(num + 1);
		return boardDao.saveBoard(board);
	}

	@Override
	public int deleteBoard(int num) {
		// TODO Auto-generated method stub
		return boardDao.deleteBoard(num);
	}

	// 서비스는 주로 DAO에 들어가야 할 값을 만드는 역할을 함!

}
