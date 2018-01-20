package com.atguigu.atcrowdfunding.bean;

import java.io.Serializable;

public class User implements Serializable{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.id
     *
     * @mbggenerated Sat Dec 16 17:29:36 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.loginacct
     *
     * @mbggenerated Sat Dec 16 17:29:36 CST 2017
     */
    private String loginacct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.userpswd
     *
     * @mbggenerated Sat Dec 16 17:29:36 CST 2017
     */
    private String userpswd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.username
     *
     * @mbggenerated Sat Dec 16 17:29:36 CST 2017
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.email
     *
     * @mbggenerated Sat Dec 16 17:29:36 CST 2017
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.createtime
     *
     * @mbggenerated Sat Dec 16 17:29:36 CST 2017
     */
    private String createtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.id
     *
     * @return the value of t_user.id
     *
     * @mbggenerated Sat Dec 16 17:29:36 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.id
     *
     * @param id the value for t_user.id
     *
     * @mbggenerated Sat Dec 16 17:29:36 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.loginacct
     *
     * @return the value of t_user.loginacct
     *
     * @mbggenerated Sat Dec 16 17:29:36 CST 2017
     */
    public String getLoginacct() {
        return loginacct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.loginacct
     *
     * @param loginacct the value for t_user.loginacct
     *
     * @mbggenerated Sat Dec 16 17:29:36 CST 2017
     */
    public void setLoginacct(String loginacct) {
        this.loginacct = loginacct == null ? null : loginacct.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.userpswd
     *
     * @return the value of t_user.userpswd
     *
     * @mbggenerated Sat Dec 16 17:29:36 CST 2017
     */
    public String getUserpswd() {
        return userpswd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.userpswd
     *
     * @param userpswd the value for t_user.userpswd
     *
     * @mbggenerated Sat Dec 16 17:29:36 CST 2017
     */
    public void setUserpswd(String userpswd) {
        this.userpswd = userpswd == null ? null : userpswd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.username
     *
     * @return the value of t_user.username
     *
     * @mbggenerated Sat Dec 16 17:29:36 CST 2017
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.username
     *
     * @param username the value for t_user.username
     *
     * @mbggenerated Sat Dec 16 17:29:36 CST 2017
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.email
     *
     * @return the value of t_user.email
     *
     * @mbggenerated Sat Dec 16 17:29:36 CST 2017
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.email
     *
     * @param email the value for t_user.email
     *
     * @mbggenerated Sat Dec 16 17:29:36 CST 2017
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.createtime
     *
     * @return the value of t_user.createtime
     *
     * @mbggenerated Sat Dec 16 17:29:36 CST 2017
     */
    public String getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.createtime
     *
     * @param createtime the value for t_user.createtime
     *
     * @mbggenerated Sat Dec 16 17:29:36 CST 2017
     */
    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

	@Override
	public String toString() {
		return "User [id=" + id + ", loginacct=" + loginacct + ", userpswd=" + userpswd + ", username=" + username
				+ ", email=" + email + ", createtime=" + createtime + "]";
	}
    
    
}