package com.models.music;

public class Drum implements Instrument{
    int size;

    public Drum(int size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Drum with size " + size + " plays");
    }
}
