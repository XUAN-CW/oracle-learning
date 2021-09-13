package com.example.oraclemybaitsplus;

import com.example.oraclemybaitsplus.entity.Person;
import com.example.oraclemybaitsplus.mapper.PersonMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class OracleMybaitsplusApplicationTests {

    @Autowired
    PersonMapper personMapper;

    @Test
    void insertTest() {
        Person user = new Person();
        user.setId(new Date().getTime());
        user.setAge(18);
        user.setName("hello oracle");

        personMapper.insert(user);

        for (Person person : personMapper.selectList(null)) {
            System.out.println(person);
        }
    }

}
