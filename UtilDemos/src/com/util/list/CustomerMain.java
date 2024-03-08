package com.util.list;

import java.util.*;

public class CustomerMain {
    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<>();
        List<Customer> customerByCity = new ArrayList<>();

        Customer customer1=new Customer("Kavya",1,"Bangalore");
        customerList.add(customer1);

        Customer customer2 = new Customer("Pooja",2,"Mysore");
        customerList.add(customer2);

        Customer customer3 = new Customer("Chandu",3,"Mandya");
        customerList.add(customer3);

        Customer customer4 = new Customer("Geetha",4,"Mysore");
        customerList.add(customer4);

        Customer customer5 = new Customer("Kumar",5,"Hassan");
        customerList.add(customer5);

        Customer customer6 = new Customer("Vijay",6,"Kolar");
        customerList.add(customer6);

        Customer customer7 = new Customer("Keerthi",6,"Bangalore");
        customerList.add(customer7);

        for(Customer customer:customerList)
            System.out.println(customer);

//        for (Customer customer:customerList){
//           if (customer.city.equals("Bangalore")){
//               customerByCity.add(customer);
//           }
//        }

        for (Customer customer:customerList){
            if (customer.getCity().equals("Bangalore")){
                customerByCity.add(customer);
            }
        }

        System.out.println(" ");
        System.out.println("Customers in Bangalore");

        for(Customer customer:customerByCity)
            System.out.println(customer);

//        Collections.sort(customerList);
    }
}
