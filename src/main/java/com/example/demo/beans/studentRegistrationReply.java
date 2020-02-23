package com.example.demo.beans;

public class studentRegistrationReply {
    String name;
    int age;
    String registerationNumber;
    String registerationStatus;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getregisterationNumber(){
        return registerationNumber;
    }
    public void setregisterationNumber(String registerationNumber){
        this.registerationNumber=registerationNumber;
    }
    public String getregisterationStatus(){
        return registerationStatus;
    }
    public void setregisterationStatus(String registerationStatus){
        this.registerationStatus=registerationStatus;
    }
}
