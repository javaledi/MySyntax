// package com.javarush.task.pro.task02.task0215;

import java.util.Scanner;

/* 
Чтение чисел
*/

/*
Считай с клавиатуры три целых числа. 
Выведи на экран их среднее арифметическое. 
*/

public class Solution {

    public static void main(String[] args) {
    	
    	//напишите тут ваш код
    	
        // создаем объект класса Scanner для считывания с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // объявляем переменную i1 типа int и присваиваем ей значение числа,
        // считанного с клавиатуры с помощью метода nextInt
        int i1 = scanner.nextInt();
        // объявляем переменную i2 типа int и присваиваем ей значение числа,
        // считанного с клавиатуры с помощью метода nextInt
        int i2 = scanner.nextInt();
        // объявляем переменную i3 типа int и присваиваем ей значение числа,
        // считанного с клавиатуры с помощью метода nextInt
        int i3 = scanner.nextInt();

        // выводим на экран значение - результат вычисления выражения
        // (i1 + i2 + i3) / 3
        System.out.println((i1 + i2 + i3) / 3); // не забыть про скобки
    }
}

/*
Scanner keyboard = new Scanner(System.in);
int n1=keyboard.nextInt();
int n2= keyboard.nextInt();
int n3=keyboard.nextInt();
int n4=(n1+n2+n3)/3; // +1 строчка
System.out.println(n4); 
*/

/*
int a = console.nextInt(); 
int b = console.nextInt(); 
int c = console.nextInt(); 
int g = 3; // +лишняя строчка
int e = (a+b+с)/g; 
*/

// это не совсем корректно), интереснее конечно написать код так, чтобы он сам понимал на сколько надо делить.... значений ведь может быть не три, а больше... или меньше, и каждый раз переписывать код это не правильно. 

/*
Input data:
51
101
201
*/

// Output: 117