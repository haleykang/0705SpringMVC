package com.haley.sample.dao;

import java.util.List;

import com.haley.sample.domain.Board;

// Board 테이블 작업을 위한 인터페이스
public interface BoardDao {

	// 1. sql 구문을 먼저 생각해보기
	// select * from board;
	// 2. 입력 받아야 하는 항목이 있으면 매개변수에 기재, 없으면 생략
	// 3. 리턴 타입은 sql의 결과가 1개 인지 0개 이상인지 따라 달라짐
	// -> 행이 0개 이상 리턴 될 때 - List<>
	// 		-> <>는 열을 전부 저장할 수 있는 데이터 타입 
	public List<Board> boardList();
}
