package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rwOnly = new RWOnly();
        rwOnly.setName("Name");
        // 'name' has private access in 'com.driver.RWOnly
        // System.out.println(rwOnly.name);
        System.out.println(rwOnly.getName());
    }
}