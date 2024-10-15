package com.pf.PFpageB.testBoard.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.pf.PFpageB.testBoard.model.BoardEmp;

@Mapper
public interface TestBoardEmpMapper {
	List<BoardEmp> selectEmpList(HashMap<String, Object> param);
}
