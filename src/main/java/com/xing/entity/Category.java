package com.xing.entity;

import java.util.Date;

public class Category {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.cid
     *
     * @mbg.generated Sun Sep 03 20:13:49 CST 2017
     */
    private Integer cid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.uid
     *
     * @mbg.generated Sun Sep 03 20:13:49 CST 2017
     */
    private Integer uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.category
     *
     * @mbg.generated Sun Sep 03 20:13:49 CST 2017
     */
    private String category;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.gmt_create
     *
     * @mbg.generated Sun Sep 03 20:13:49 CST 2017
     */
    private Date gmtCreate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.cid
     *
     * @return the value of category.cid
     *
     * @mbg.generated Sun Sep 03 20:13:49 CST 2017
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.cid
     *
     * @param cid the value for category.cid
     *
     * @mbg.generated Sun Sep 03 20:13:49 CST 2017
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.uid
     *
     * @return the value of category.uid
     *
     * @mbg.generated Sun Sep 03 20:13:49 CST 2017
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.uid
     *
     * @param uid the value for category.uid
     *
     * @mbg.generated Sun Sep 03 20:13:49 CST 2017
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.category
     *
     * @return the value of category.category
     *
     * @mbg.generated Sun Sep 03 20:13:49 CST 2017
     */
    public String getCategory() {
        return category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.category
     *
     * @param category the value for category.category
     *
     * @mbg.generated Sun Sep 03 20:13:49 CST 2017
     */
    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.gmt_create
     *
     * @return the value of category.gmt_create
     *
     * @mbg.generated Sun Sep 03 20:13:49 CST 2017
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.gmt_create
     *
     * @param gmtCreate the value for category.gmt_create
     *
     * @mbg.generated Sun Sep 03 20:13:49 CST 2017
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}