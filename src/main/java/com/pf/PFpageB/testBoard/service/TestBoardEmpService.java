package com.pf.PFpageB.testBoard.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;

import com.pf.PFpageB.testBoard.model.BoardEmp;

public interface TestBoardEmpService {
	
	List<BoardEmp> selectEmpList(HashMap<String, Object> param);
}
