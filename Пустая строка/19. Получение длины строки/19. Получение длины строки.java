// package com.javarush.task.pro.task02.task0211;

/* 
Получение длины строки
*/

// В методе main на экран выводятся значения трех строк.
// Внеси изменения в код, чтобы вместо значений строк вывелась длина каждой строки. 

public class Solution {

    public static void main(String[] args) {
        // объявляем переменную emptyString типа String и присваиваем ей
        // значение - пустую строку ""
        String emptyString = "";
        
        //напишите тут ваш код
        /*
        System.out.println(emptyString);
        System.out.println("Gomu Gomu no Bazooka!");
        System.out.println((emptyString + 2 + 2 + "22"));
        */

        // выводим на экран значение длины строки из переменной emptyString,
        // полученное с помощью метода length
        System.out.println(emptyString.length());
        // выводим на экран значение длины строки "Gomu Gomu no Bazooka!",
        // полученное с помощью метода length
        System.out.println("Gomu Gomu no Bazooka!".length());
        // выводим на экран значение длины строки, полученной в результате
        // слияния строк и чисел emptyString + 2 + 2 + "22" при этом числа
        // будут преобразованы в строки перед соединением
        System.out.println((emptyString + 2 + 2 + "22").length());
    }
}


/*
Output: 
0
21
4
*/

/*
String emptyString = "";
String emptyString1 = "Gomu Gomu no Bazooka!";
String emptyString2 = emptyString + 2 + 2 + "22";

int cont1 = emptyString.length();
int cont2 = emptyString1.length();
int cont3 = emptyString3.length();

System.out.println(cont1);
System.out.println(cont2);
System.out.println(cont3);
*/