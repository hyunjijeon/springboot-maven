package com.tmax.demo.service;

import java.util.List;

import com.tmax.demo.dto.EmpDto;
import com.tmax.demo.mapper.EmpMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    EmpMapper mapper;

    @Override
    public List<EmpDto> getEmpList() {
        return mapper.selectAll();
    }

    
}
