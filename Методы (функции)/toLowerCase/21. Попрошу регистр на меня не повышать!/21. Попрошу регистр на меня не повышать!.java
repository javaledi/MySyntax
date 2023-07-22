// package com.javarush.task.pro.task02.task0212;

/* 
Попрошу регистр на меня не повышать!
*/

// В методе main на экран выводятся три строки.
// Внеси изменения в код, чтобы все буквы в этих строках стали заглавными. 


public class Solution {

    public static void main(String[] args) {
        // объявляем переменную caps типа String и присваиваем ей значение
        String caps = "if I type in caps ";
        // объявляем переменную usa типа String и присваиваем ей значение
        String usa = "сша";
        
        //напишите тут ваш код
        /*
        System.out.println(usa);
        System.out.println("Винни Пух");
        System.out.println(caps + "they know I mean business");
        */

        // выводим на экран строку из переменной usa в верхнем регистре,
        // преобразованную с помощью метода toUpperCase
        System.out.println(usa.toUpperCase());
        
        // выводим на экран строку "Винни Пух" в верхнем регистре, полученное
        // с помощью метода toUpperCase
        System.out.println("Винни Пух".toUpperCase());
        
        // выводим на экран строку в верхнем регистре, которая образована
        // слиянием строки из переменной caps и "they know I mean business"
        System.out.println((caps + "they know I mean business").toUpperCase());
        // Конкатенация прячется в дополнительные скобки, чтобы всё выражение перешло в заглавные буквы. Выражение в кавычках считается одним объектом, как и переменная 
    }
}

/*
Output:
	США
	ВИННИ ПУХ
	IF I TYPE IN CAPS THEY KNOW I MEAN BUSINESS
*/