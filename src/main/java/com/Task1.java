package com;

import com.models.literature.Book;
import com.models.literature.Magazine;
import com.models.literature.Printable;

/*
Состоит из подзадач:
а) Определить интерфейс Printable, содержащий метод void print().
б) Определить класс Book, реализующий интерфейс Printable.
в) Определить класс Magazine, реализующий интерфейс Printable.
г) Создать массив типа Printable, который будет содержать книги и журналы.
д) В цикле пройти по массиву и вызвать метод print() для каждого объекта.
е) Создать статический метод printMagazines(Printable[] printable) в классе Magazine,
который выводит на консоль названия только журналов.
Создать статический метод printBooks(Printable[] printable) в классе Book,
который выводит на консоль названия только книг.
Используем оператор instanceof. Смотрите решение задачи в видео.
*/
public class Task1 {
    public static void main(String[] args) {
        Printable[] literature = arrayFilling(11);
        for(Printable p : literature){
            p.print();
        }
        //часть про методы с instanceOf
        System.out.println("***********************************");
        Book.printBooks(literature);
        Magazine.printMagazines(literature);
    }
    private static Printable[] arrayFilling(int arraySize){
        Printable[] arr = new Printable[arraySize];
        for(int i = 0; i < arr.length; i++){
            if(i % 2 == 0){
                arr[i] = new Book();
            }
            else{
                arr[i] = new Magazine();
            }
        }
        return arr;
    }
}
