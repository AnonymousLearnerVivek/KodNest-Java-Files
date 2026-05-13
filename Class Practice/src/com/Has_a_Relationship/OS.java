package com.Has_a_Relationship;

public class OS {
    String name;
    float size;

    public OS(String name, float size) {
        this.name = name;
        this.size = size;
    }

    public void osDetails() {
        System.out.println("OS Name: " + name);
        System.out.println("OS Size: " + size + " GB");
    }
}
