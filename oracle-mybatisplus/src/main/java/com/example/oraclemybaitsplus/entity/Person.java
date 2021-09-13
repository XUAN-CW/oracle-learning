package com.example.oraclemybaitsplus.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author 禤成伟
 * @date 2021-09-13 12:44
 */
@Data
@TableName("PERSON")
public class Person {
    @TableId("ID")
    private Long id;
    private String name;
    private int age;
}
