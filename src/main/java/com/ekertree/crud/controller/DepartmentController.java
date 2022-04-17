package com.ekertree.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ekertree.crud.bean.Department;
import com.ekertree.crud.bean.Msg;

@Controller
public class DepartmentController {
	
	@Autowired
	 private DepartmentService departmentService;
	
	@ResponseBody
	@RequestMapping("/depts")
	public Msg getDepts() {
		List<Department> list = departmentService.getDepts();
		return Msg.success().add("depts", list);
	}

}
