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

}
