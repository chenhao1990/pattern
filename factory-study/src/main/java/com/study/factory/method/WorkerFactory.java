package com.study.factory.method;

import com.study.factory.simple.factory.pojo.Person;
import com.study.factory.simple.factory.pojo.Worker;

public class WorkerFactory implements MethodFactory {
    @Override
   public Person getPerson() {
        return new Worker();
    }
}
