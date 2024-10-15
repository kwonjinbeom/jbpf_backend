package com.pf.PFpageB.testBoard.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pf.PFpageB.testBoard.service.TestBoardEmpService;
import com.pf.PFpageB.testBoard.model.BoardEmp;

@Controller
@RequestMapping("/api/BoardEmp")
public class TestBoardEmpController {

		
	@Autowired(required = true)
	private TestBoardEmpService testBoardEmpService;
	
	
	@GetMapping("/selectEmpList")
	public ResponseEntity<List<BoardEmp>> selectEmp(@RequestParam HashMap<String, Object> parameter) throws Exception{
		List<BoardEmp> empList = testBoardEmpService.selectEmpList(parameter);
        return ResponseEntity.ok().body(empList);
    }
	
}
