package com.models.literature;

public class Book implements Printable{
    @Override
    public void print() {
        System.out.println(this);
    }
    public static void printBooks(Printable[] printable){
        for(Printable p : printable){
            if(p instanceof Book){
                p.print();
            }
        }
    }
}
