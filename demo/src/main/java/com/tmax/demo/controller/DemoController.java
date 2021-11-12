package com.tmax.demo.controller;

import java.util.List;

import com.tmax.demo.dto.EmpDto;
import com.tmax.demo.service.EmpService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo/*")
public class DemoController {
    
    @Autowired
    EmpService empService;

    @RequestMapping("/emp")
    @ResponseBody
    public List<EmpDto> getEmpList() {
        return empService.getEmpList();
    }
}
