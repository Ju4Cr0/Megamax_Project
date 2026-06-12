package org.example.demo.Model;

public class User {

    String id;
    String name;
    String numero;
    UserType rol;


    public User(String id , String name , String numero , UserType rol){

        this.id = id;
        this.name = name;
        this.numero = numero;
        this.rol = rol;


    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

