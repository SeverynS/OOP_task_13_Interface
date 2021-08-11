package com.models.literature;

public class Magazine implements Printable{
    @Override
    public void print() {
        System.out.println(this);
    }
    public static void printMagazines(Printable[] printable){
        for(Printable p : printable){
            if(p instanceof Magazine){
                p.print();
            }
        }
    }
}
