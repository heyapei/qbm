package com.hyp.qbm.pojo.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

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
    @NotNull
    private String name;

}