package com.SpringProject.WebProject3;
import java.io.Serializable;

public class dataController implements Serializable {

    public int ID;
    public boolean New;
    public int age;
    public String name;
    public String profession;

    public dataController(int ID, boolean New, int age, String name, String profession){
        this.ID = ID;
        this.New = New;
        this.age = age;
        this.name = name;
        this.profession = profession;


    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public boolean isNew() {
        return New;
    }

    public void setNew(boolean aNew) {
        New = aNew;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
     }

    public String toString(){


        return "The person has an ID:"+ID+"/n The persons status is:"+New+"/n The persons age is:"+age+"/n The persons name is:"+name+"/n The persons profession is"+profession;
    }





}
