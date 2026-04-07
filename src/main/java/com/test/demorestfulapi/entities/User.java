package com.test.demorestfulapi.entities;


import jakarta.persistence.*;

@Entity
@Table
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String pswd;

    @Column
    private String city;


    public void setId(int id){
        this.id=id;
    }

    public int getId(){
        return id;
    }


    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public String getEmail(){
        return email;
    }

    public void setPswd(String pswd){
        this.pswd=pswd;
    }
    public String getPswd(){
        return pswd;
    }

    public void setCity(String city){
        this.city=city;
    }
    public String getCity(){
        return city;
    }




}
