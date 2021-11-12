package com.tmax.demo.dto;

public class UserDto {
    private int userId;
    private String userName;

    public UserDto() {
    }

    public UserDto(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("{ ");
		builder.append("userId : ").append(userId).append(", ");				
		builder.append("userName : ").append(userName);
        builder.append("}");
		return builder.toString();
    }
}
