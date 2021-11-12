package com.tmax.demo.mapper;

import java.util.List;

import com.tmax.demo.dto.EmpDto;
import com.tmax.demo.dto.UserDto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EmpMapperTest {

    @Autowired
    EmpMapper mapper;
    
    @Test
    @Order(1)
    @DisplayName("(1) selectAll")
    void selectAll() {
        List<EmpDto> list = mapper.selectAll();
        System.out.println("[EmpMapperTest][selectAll] row cnt: " + list.size());
        for (EmpDto dto : list) {
            System.out.println("\t" + dto.toString());
        }
    }

    @Test
    @Order(2)
    @DisplayName("(2) insert")
    void insert() {
        EmpDto dto = new EmpDto(100, "king", 300, "JEJU");
        int affectedRows = mapper.insert(dto);
        System.out.println("[EmpMapperTest][insert] insert EmpDto(100, \"king\", 300, \"JEJU\")\n\taffectedRows: " + affectedRows);
    }

    @Test
    @Order(3)
    @DisplayName("(3) update")
    void update() {
        EmpDto dto = new EmpDto();
        dto.setEmpNo(100);
        dto.setName("KING");
        int affectedRows = mapper.update(dto);
        System.out.println("[EmpMapperTest][update] update king's name to KING\n\taffectedRows: " + affectedRows);
    }

    @Test
    @Order(4)
    @DisplayName("(4) selectOneByEmpNo")
    void selectOneByEmpNo() {
        EmpDto dto = mapper.selectOneByEmpNo(100);
        System.out.println("[EmpMapperTest][selectOneByEmpNo] select empNo = 100");
        System.out.println("\t" + dto.toString());
    }

    @Test
    @Order(5)
    @DisplayName("(5) delete")
    void delete() {
        int affectedRows = mapper.delete(100);
        System.out.println("[EmpMapperTest][delete] delete empNo = 100\n\taffectedRows: " + affectedRows);
    }

    @Test
    @Order(6)
    @DisplayName("(6) selectAllAsUser")
    void selectAllAsUser() {
        List<UserDto> list = mapper.selectAllAsUser();
        System.out.println("[EmpMapperTest][selectAllAsUser] row cnt: " + list.size());
        for (UserDto dto : list) {
            System.out.println("\t" + dto.toString());
        }
    }

}
