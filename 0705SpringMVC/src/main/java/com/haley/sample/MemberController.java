package com.haley.sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.haley.sample.service.MemberService;

@RestController // String 이나 JSON 데이터를 출력할 수 있는 Controller로 만들어주는 어노테이션
public class MemberController {

	@Autowired
	private MemberService service;

	// id를 파라미터로 받아서 db와 아이디 중복 체크 요청 처리
	@RequestMapping(value = "idCheck", method = RequestMethod.GET)
	public Map<String, String> idCheck(@RequestParam("id") String id) {
		// 아이디 중복 체크 후 return되는 map
		Map<String, Object> map = service.idCheck(id);

		// 결과를 저장할 맵
		Map<String, String> resultMap = new HashMap<String, String>();

		// 아이디 중복 X
		if (map == null) {

			resultMap.put("result", "true");

		}
		// 아이디 중복 O - 아이디가 이미 존재
		else {

			resultMap.put("result", "false");

		}

		return resultMap;
	}
	
	

}
