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
	// -> <>는 열을 전부 저장할 수 있는 데이터 타입
	public List<Board> boardList();
	// select * from userboard
	
	// 글 번호를 가지고 하나의 데이터를 조회하는 메소드 -> select
	public Board getBoard(int num);
	// select * from userboard where num = ?
	
	// 상세보기를 하면 조회수를 1 증가 시켜주는 메소드 -> update
	public int updateReadcnt(int num);
	//update userboard set readcnt = readcnt + 1 where num = #{num}
	
	
	// 가장 큰 글번호 찾아오는 sql
	public int maxNum();
	// select max(num) from userboard;

	// 실제 데이터를 삽입하는 sql
	public int saveBoard(Board board);
	// insert into userboard values(#{num},#{title},#{content},#{writer}, sysdate, 0)
	
	// 게시글 삭제 sql
	public int deleteBoard(int num);
	// delete from userboard where num = ?
	
}
