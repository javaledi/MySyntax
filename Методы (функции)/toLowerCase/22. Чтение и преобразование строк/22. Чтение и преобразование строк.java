// package com.javarush.task.pro.task02.task0214;

import java.util.Scanner;

/* 
Чтение и преобразование строк
*/

/*
Считай с клавиатуры три строки. А затем: 
1. Выведи на экран третью строку в неизменном виде.
2. Выведи на экран вторую строку, предварительно преобразовав ее к верхнему регистру. 
3. Выведи на экран первую строку, предварительно преобразовав ее к нижнему регистру. 
*/

public class Solution {

    public static void main(String[] args) {
    	
    	//напишите тут ваш код
    	
        // создаем объект класса Scanner для считывания с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // объявляем переменную s1 типа String и присваиваем ей значение строки,
        // считанной с клавиатуры с помощью метода nextLine
        String s1 = scanner.nextLine();
        // объявляем переменную s2 типа String и присваиваем ей значение строки,
        // считанной с клавиатуры с помощью метода nextLine
        String s2 = scanner.nextLine();
        // объявляем переменную s3 типа String и присваиваем ей значение строки,
        // считанной с клавиатуры с помощью метода nextLine
        String s3 = scanner.nextLine();

        // выводим на экран значение переменной s3
        System.out.println(s3);
        // выводим на экран строку из переменной s2 в верхнем регистре,
        // преобразованную с помощью метода toUpperCase
        System.out.println(s2.toUpperCase());
        // выводим на экран строку из переменной s1 в нижнем регистре,
        // преобразованную с помощью метода toLowerCase
        System.out.println(s1.toLowerCase());
        
        // System.out.println(s3 + "\n" + s2.toUpperCase() + "\n" + s1.toLowerCase());
    }
}

// Input data
 // Голова
 // Уже не кружится
 // Листва кружится