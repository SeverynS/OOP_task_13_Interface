package com;

import com.models.music.Drum;
import com.models.music.Guitar;
import com.models.music.Instrument;
import com.models.music.Trumpet;

/*
2. Создать интерфейс Инструмент и реализующие его классы Гитара, Барабан и Труба.
Интерфейс Инструмент содержит метод play() и переменную String KEY =»До мажор».
Гитара содержит переменные класса количествоСтрун, Барабан — размер, Труба — диаметр.
Создать массив типа Инструмент, содержащий инструменты разного типа.
В цикле вызвать метод play() для каждого инструмента,
который должен выводить строку «Играет такой-то инструмент c такими то характеристиками».
*/
public class Task2 {
    public static void main(String[] args) {
        Instrument[] instruments = arrayFilling(9);
        for (Instrument i : instruments) {
            i.play();
        }
    }

    private static Instrument[] arrayFilling(int arraySize) {
        Instrument[] arr = new Instrument[arraySize];
        for (int i = 0; i < arr.length; i++) {
            if (i % 3 == 0) {
                arr[i] = new Guitar((int) (Math.random() * 12));
            } else if (i % 2 == 0) {
                arr[i] = new Drum((int) (Math.random() * 50));
            } else {
                arr[i] = new Trumpet((int) (Math.random() * 30));
            }
        }
        return arr;
    }
}
