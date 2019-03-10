package com.study.factory.method;

import com.study.factory.simple.factory.pojo.Person;
import com.study.factory.simple.factory.pojo.Student;

public class StudentFactory implements MethodFactory {

    @Override
   public Person getPerson() {
        return new Student();
    }
}
