package com.example.oraclemybaitsplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.oraclemybaitsplus.entity.Person;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 禤成伟
 * @date 2021-09-13 13:44
 */
@Mapper
public interface PersonMapper extends BaseMapper<Person> {
}
