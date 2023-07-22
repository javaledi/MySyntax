package com.javarush.task.pro.task02.task0207;

/* 
Логотип решает все
*/

// В переменную tagline нужно записать строку "JustDoIt". 
// Используй s1 , s2 , s3 и конкатенацию строк. 


public class Solution {

    public static void main(String[] args) {
        // объявляем переменную s1 типа String и присваиваем ей значение
        String s1 = "Do";
        // объявляем переменную s2 типа String и присваиваем ей значение
        String s2 = "It";
        // объявляем переменную s3 типа String и присваиваем ей значение
        String s3 = "Just";
        
        // String tagline = ""; //напишите тут ваш код

        // объявляем переменную tagline типа String и присваиваем ей результат
        // соединения (конкатенации) строк s3, s1 и s2
        String tagline = s3 + s1 + s2;

        // выводим на экран значение переменной tagline
        System.out.println(tagline);
    }
}

// Output: JustDoIt