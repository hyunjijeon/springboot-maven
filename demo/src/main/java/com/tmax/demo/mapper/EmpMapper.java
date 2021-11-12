package com.tmax.demo.mapper;

import java.util.List;

import com.tmax.demo.dto.EmpDto;
import com.tmax.demo.dto.UserDto;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmpMapper {
    
    public List<EmpDto> selectAll();

    public EmpDto selectOneByEmpNo(int empNo);

    public List<UserDto> selectAllAsUser();

    public int insert(EmpDto dto);

    public int update(EmpDto dto);

    public int delete(int empNo);
}
