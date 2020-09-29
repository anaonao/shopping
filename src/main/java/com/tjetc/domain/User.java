package com.tjetc.domain;

public class User {
    private int userId;
    private String userName;
    private String userPwd;
    private String userIphone;//电话
    private String userAddress;//地址
    private int userStates;//状态（0：禁用，1：启用）

    public User() {
    }

    public User(String userName, String userPwd) {
        this.userName = userName;
        this.userPwd = userPwd;
    }

    public User(int userId, String userName, String userPwd, String userIphone, String userAddress, int userStates) {
        this.userId = userId;
        this.userName = userName;
        this.userPwd = userPwd;
        this.userIphone = userIphone;
        this.userAddress = userAddress;
        this.userStates = userStates;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserIphone() {
        return userIphone;
    }

    public void setUserIphone(String userIphone) {
        this.userIphone = userIphone;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public int getUserStates() {
        return userStates;
    }

    public void setUserStates(int userStates) {
        this.userStates = userStates;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userIphone='" + userIphone + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", userStates=" + userStates +
                '}';
    }
}
