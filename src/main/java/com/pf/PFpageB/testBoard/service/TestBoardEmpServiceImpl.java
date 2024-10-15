package com.pf.PFpageB.testBoard.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pf.PFpageB.testBoard.mapper.TestBoardEmpMapper;
import com.pf.PFpageB.testBoard.model.BoardEmp;


import lombok.Setter;




@Service
public class TestBoardEmpServiceImpl implements TestBoardEmpService{

	@Setter(onMethod_ = @Autowired)
	private TestBoardEmpMapper testBoardEmpMapper;

	@Override
	public List<BoardEmp> selectEmpList(HashMap<String, Object> param) {
		return testBoardEmpMapper.selectEmpList(param);
	}

}
