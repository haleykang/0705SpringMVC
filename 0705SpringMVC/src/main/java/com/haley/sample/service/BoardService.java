package com.haley.sample.service;

import java.util.List;

import com.haley.sample.domain.Board;

public interface BoardService {

	// 전체 데이터를 가져오는 메소드
	public List<Board> boardList();
	
	
}
