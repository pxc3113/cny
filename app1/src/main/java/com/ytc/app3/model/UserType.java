package com.ytc.app3.model;

public class UserType {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_type.id
     *
     * @mbggenerated Fri Feb 04 16:00:08 CST 2022
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_type.name
     *
     * @mbggenerated Fri Feb 04 16:00:08 CST 2022
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_type.id
     *
     * @return the value of user_type.id
     *
     * @mbggenerated Fri Feb 04 16:00:08 CST 2022
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_type.id
     *
     * @param id the value for user_type.id
     *
     * @mbggenerated Fri Feb 04 16:00:08 CST 2022
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_type.name
     *
     * @return the value of user_type.name
     *
     * @mbggenerated Fri Feb 04 16:00:08 CST 2022
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_type.name
     *
     * @param name the value for user_type.name
     *
     * @mbggenerated Fri Feb 04 16:00:08 CST 2022
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}