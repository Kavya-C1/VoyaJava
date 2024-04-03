package com.practice.oops1;

abstract public class Publication {
    private int noOFPages;
    private double price;
    private String publisherName;

    public Publication(int noOFPages, double price, String publisherName){
        this.noOFPages = noOFPages;
        this.price = price;
        this.publisherName = publisherName;
    }


}
