package com.haley.sample.domain;

import java.sql.Date;

public class Board {
	
	// 1. 테이블에서 생성한 컬럼이름과 동일한 변수 생성
	private int num;
	private String title;
	private String content;
	private String writer;
	
	// 시간이 필요하면 java.util.Date
	// 시간이 필요없으면 java.sql.Date
	private Date regdate;
	private int readcnt;
	
	
	// 2. getter, setter 함수 생성

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getReadcnt() {
		return readcnt;
	}
	public void setReadcnt(int readcnt) {
		this.readcnt = readcnt;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	@Override
	public String toString() {
		return "Board [num=" + num + ", title=" + title + ", content=" + content + ", writer=" + writer + ", regdate="
				+ regdate + ", readcnt=" + readcnt + "]";
	}

	

}
