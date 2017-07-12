package com.haley.sample;

import java.util.List;
import java.util.Locale;
import org.apache.ibatis.session.SqlSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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

	@RequestMapping(value = "detail", method = RequestMethod.GET)
	public String detail(Model model, @RequestParam("num") int num) {

		// 데이터를 조회하는 경우 -> Model
		// num 파라미터를 어떻게 읽을 것인지 - 하나 두개는 @RequestParam이 제일 빠름
		Board board = boardService.getBoard(num);
		model.addAttribute("board", board);

		return "detail";
	}

	@RequestMapping(value = "boardwrite", method = RequestMethod.GET)
	public String write() {

		// 단순 페이지 이동
		return "write";
	}

	@RequestMapping(value = "saveboard", method = RequestMethod.POST)
	public String save(Board board) {

		boardService.saveBoard(board);
		// redirect를 해야 요청 주소로 이동 할 수 있음!!!
		return "redirect:boardList";
	}

	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public String delete(@RequestParam("num") int num) {

		boardService.deleteBoard(num);

		// 목록보기로 이동
		return "redirect:boardList";
	}

	// 회원가입 페이지로 이동 tomember
	@RequestMapping(value = "toregister", method = RequestMethod.GET)
	public String tomember() {

		return "register";
	}

}
