// package com.javarush.task.pro.task02.task0203;

/* 
Последняя цифра числа
*/

// В переменной number записано число.
// В переменную lastDigit нужно записать последнюю цифру этого числа. 
// Для вычисления используй переменную number и оператор «остаток от деления». Для объявления и инициализации lastDigit используй одну команду. 

public class Solution {

    public static void main(String[] args) {
        // объявляем переменную number типа int и сразу же в строке объявления
        // присваиваем ей значение 546
        int number = 546;
        
        // int lastDigit; //напишите тут ваш код

        // создаем переменную lastDigit типа int, в которую помещаем значение
        // последней цифры числа number
        // (number % 10 дает остаток от деления number на 10, а это и будет
        // последняя цифра числа number)
        int lastDigit = number % 10;

        // выводим на экран значение переменной lastDigit
        System.out.println(lastDigit);
    }
}