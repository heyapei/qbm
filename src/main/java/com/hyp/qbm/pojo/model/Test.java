package com.hyp.qbm.pojo.model;

import lombok.Data;

import javax.persistence.*;

@Data
public class Test {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 姓名
     */
    private String name;

}