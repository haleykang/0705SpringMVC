package com.haley.sample;

import java.util.List;
import java.util.Locale;
import org.apache.ibatis.session.SqlSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.haley.sample.domain.Board;
import com.haley.sample.service.BoardService;

@Controller
public class HomeController {

	@Autowired
	private BoardService boardService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {


		return "home";
	}

	@RequestMapping(value = "boardList", method = RequestMethod.GET)
	public String boardList(Model model) {
		
		// 요청 처리 메소드 호출 
		List<Board> list = boardService.boardList();
		model.addAttribute("list", list);
		
		return "list";
	}

}
