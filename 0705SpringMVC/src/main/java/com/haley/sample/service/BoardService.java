package com.haley.sample.service;

import java.util.List;

import com.haley.sample.domain.Board;

public interface BoardService {

	// 전체 데이터를 가져오는 메소드
	public List<Board> boardList();

	// 서비스에는 하나의 작업 당 하나의 메소드 선언!
	// DAO는 SQL 단위로 메소드를 생성
	public Board getBoard(int num);

	// 서비스에는 하나의 작업 당 하나의 메소드 선언!
	// 데이터를 삽입하는 메소드
	public int saveBoard(Board board);
	
	// 데이터를 삭제하는 메소드
	public int deleteBoard(int num);

}
