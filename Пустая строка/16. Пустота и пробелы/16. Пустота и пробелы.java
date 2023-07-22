// package com.javarush.task.pro.task02.task0208;

/* 
Пустота и пробелы
*/

// Заполни пробелы пустотой... или наоборот. 
// Используй переменную, строки с одним пробелом и конкатенацию строк, чтобы записать в переменную fullness строку. 

public class Solution {

    public static void main(String[] args) {
        // объявляем переменную emptiness типа String и присваиваем ей значение
        String emptiness = "пустота";

		// String fullness = ""; '' напишите тут ваш код
		
        // объявляем переменную fullness типа String и присваиваем ей результат
        // соединения (конкатенации) строки emptiness с пробелами " "
        String fullness = emptiness + " " + emptiness + " " + emptiness;

        // выводим на экран значение переменной fullness
        System.out.println(fullness);
    }
}

// Output: пустота пустота пустота