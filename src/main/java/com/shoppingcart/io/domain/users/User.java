package com.shoppingcart.io.domain.users;

public class User {
    private String name;
    private int age;
    private boolean ageRestrictedAllowed;

    public User(String name, int age, boolean ageRestrictedAllowed) {
        this.name = name;
        this.age = age;
        this.ageRestrictedAllowed = ageRestrictedAllowed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isUnderAge() {
        return !ageRestrictedAllowed;
    }

    public void setAgeRestrictedAllowed(boolean ageRestrictedAllowed) {
        this.ageRestrictedAllowed = ageRestrictedAllowed;
    }

}
