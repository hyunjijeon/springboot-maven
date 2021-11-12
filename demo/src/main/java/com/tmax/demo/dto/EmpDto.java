package com.tmax.demo.dto;

public class EmpDto {
    private int empNo;
    private String name;
    private int age;
    private String address;

    public EmpDto() {
    }

    public EmpDto(int empNo, String name, int age, String address) {
        this.empNo = empNo;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getEmpNo() {
        return empNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("{ ");
		builder.append("empNo: ").append(empNo).append(", ");				
		builder.append("name: ").append(name).append(", ");				
		builder.append("age: ").append(age).append(", ");				
		builder.append("address: ").append(address);
        builder.append(" }");
		return builder.toString();
    }
}
