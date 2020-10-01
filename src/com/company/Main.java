package com.company;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Calendar;

public class Main {
    String name= " ";
    String surname=" ";
    int phoneNumber;

    static ArrayList<Main> d= new ArrayList<Main>();

    public Main(String name, String surname, int phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }

    public static void main(String[] args) {
	getDetails();
	calculateTime();
	displayDetails();
    }
    public static void getDetails(){
        String name;
        String surname;
        int phoneNumber;


        Scanner input= new Scanner(System.in);
        System.out.println("enter number of customers to be served");
       int customer=input.nextInt();

       for(int i= 0;i<customer;i++){
           System.out.println(" enter the customer name");
           name=input.next();
           System.out.println("enter the customer surname");
           surname=input.next();
           System.out.println("enter the customer phone number");
           phoneNumber=input.nextInt();

           d.add(i,new Main(name,surname,phoneNumber));


       }

       }

public static void displayDetails(){
        for(int i=0;i<d.size();i++){
            System.out.println(" customer " + i + " name is " + d.get(i).name);
            System.out.println("customer " + i + " surname is " + d.get(i).surname);
            System.out.println("phone number for " + i + "  is " + d.get(i).phoneNumber);

        }
}
    public static void calculateTime(){
       Calendar year =Calendar.getInstance();
        System.out.println(" current time " + year.get(Calendar.HOUR_OF_DAY)+":"+year.get(Calendar.MINUTE)+":"+year.get(Calendar.SECOND));
for(int i=0;i<d.size();i++){
    year.add(Calendar.MINUTE,5);
    System.out.println(" customer  " + i + " will be served at" + year.get(Calendar.HOUR_OF_DAY)+":"+year.get(Calendar.MINUTE)+":"+year.get(Calendar.SECOND));
}

    }

    }


