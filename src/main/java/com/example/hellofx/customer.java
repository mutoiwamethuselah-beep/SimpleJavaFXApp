package com.example.hellofx;
public class customer {
    private final String name;
    private final String province;

    public customer(String name, String province) {
        this.name = name;
        this.province = province;
    }

    public String getName() {
        return name;
    }

    public String getProvince() {
        return province;
    }
}
