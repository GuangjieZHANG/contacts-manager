package com.fredericboisguerin.insa;

public class Contact {

    private String name;
    private String email;
    private String phoneNumber;

    public Contact(){

    }

    public Contact(String name,String email,String phoneNumber){

        this.name=name;
        this.email=email;
        this.phoneNumber=phoneNumber;

    }

    public String getName(){
        return name;
    }

    public void printcontact(){

        if(this.name!=null){

            System.out.print(this.name);

        }

        if(this.email!=null){

            System.out.print(", "+this.email);

        }

        if(this.phoneNumber!=null){

            System.out.println(", "+this.phoneNumber);
        }

    }

    @Override
    public String toString() {

        return this.name+", "+this.email+", "+this.phoneNumber;
        //return this.name+this.email+this.phoneNumber;
    }
}
