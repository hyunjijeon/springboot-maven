package com.tmax.demo.mapper;

import java.util.List;

import com.tmax.demo.dto.EmpDto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmpMapperTest {

    @Autowired
    EmpMapper mapper;
    
    @Test
    @DisplayName("EmpMapperTest - selectAll")
    void selectAll() {
        List<EmpDto> list = mapper.selectAll();
        System.out.println("========== [EmpMapperTest][selectAll] row cnt: " + list.size());
        for (EmpDto dto : list) {
            System.out.println(dto.toString());
        }
    }

    @Test
    @DisplayName("EmpMapperTest - insert")
    void insert() {
        EmpDto dto = new EmpDto(100, "king", 300, "JEJU");
        int affectedRows = mapper.insert(dto);
        System.out.println("========== [EmpMapperTest][insert] affectedRows: " + affectedRows);
    }

    @Test
    @DisplayName("EmpMapperTest - selectOneByEmpNo")
    void selectOneByEmpNo() {
        EmpDto dto = mapper.selectOneByEmpNo(100);
        System.out.println("========== [EmpMapperTest][selectOneByEmpNo] selectOnByEmpNo = 100");
        System.out.println(dto.toString());
    }

    @Test
    @DisplayName("EmpMapperTest - update")
    void update() {
        EmpDto dto = new EmpDto();
        dto.setEmpNo(100);
        dto.setName("updateKing");
        int affectedRows = mapper.update(dto);
        System.out.println("========== [EmpMapperTest][update] affectedRows: " + affectedRows);
    }

    @Test
    @DisplayName("EmpMapperTest - delete")
    void delete() {
        int affectedRows = mapper.delete(100);
        System.out.println("========== [EmpMapperTest][delete] affectedRows: " + affectedRows);
    }
}
