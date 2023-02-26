package com.rustdv.reflectionRepeating;

import com.rustdv.reflectionRepeating.annotation.MinAge;

import java.io.Serializable;

public class User extends Person implements Serializable, Comparable<User> {

    private String name;

    @MinAge(age = 22)
    private int age;

    @Override
    public String toString() {
        return "User{id = " + super.getId() +
                " name = '" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(Long id, String name, int age) {
        super(id);
        this.name = name;
        this.age = age;
    }
    @Override
    public int compareTo(User o) {
        return 0;
    }


}
