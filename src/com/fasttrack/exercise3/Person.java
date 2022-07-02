package com.fasttrack.exercise3;

public  class  Person {
    private String name;
    private int age;
    private String position;

    public Person(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }
    public Person (){
    }

    public Person( String name, int age){
        this.name=name;
        this.age=age;
        this.position="manager";
    }
    public String getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                '}';
    }
}
