package com.models.music;

public class Guitar implements Instrument{
    int numberOfStrings;

    public Guitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public void play() {
        System.out.println("Guitar with " + numberOfStrings + " strings plays");
    }
}
