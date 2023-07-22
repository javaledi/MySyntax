// package com.javarush.task.pro.task02.task0213;

/* 
Причешем резюме
*/

// Метод main выводит на экран четыре строки. 
// Все они - яркий пример злоупотребления заглавными буквами. 
// Внеси изменения в код, чтобы все буквы в этих строках стали строчными. 


public class Solution {

    public static void main(String[] args) {
        // объявляем переменную title типа String и присваиваем ей значение
        String title = "Senior Lead Principal Software Engineer Data Architect";
        // объявляем переменную degree типа String и присваиваем ей значение
        String degree = "In college, I Majored in Political Science and Minored in Religious Studies.";
        // объявляем переменную career типа String и присваиваем ей значение
        String career = "Experienced Team Leader with strong Organizational Skills and a Successful career in Management.";
        
        //напишите тут ваш код
        /*
        System.out.println("RESUME");
        System.out.println("TITLE: " + title);
        System.out.println("DEGREE: " + degree);
        System.out.println("CAREER: " + career);
        */

        // выводим на экран строку "RESUME" в нижнем регистре, полученное
        // с помощью метода toLowerCase
        System.out.println("RESUME".toLowerCase());
        // System.out.println("RESUME".toLowerCase()); 
        
        // выводим на экран строку в нижнем регистре, которая образована
        // слиянием строки "TITLE: " и строки из переменной title
        System.out.println(("TITLE: " + title).toLowerCase());
         // System.out.println("TITLE: ".toLowerCase() + title.toLowerCase()); 
        
        // выводим на экран строку в нижнем регистре, которая образована
        // слиянием строки "DEGREE: " и строки из переменной degree
        System.out.println(("DEGREE: " + degree).toLowerCase());
        // System.out.println("DEGREE: ".toLowerCase() + degree.toLowerCase());
        
        // выводим на экран строку в нижнем регистре, которая образована
        // слиянием строки "CAREER: " и строки из переменной career
        System.out.println(("CAREER: " + career).toLowerCase());
        // System.out.println("CAREER: ".toLowerCase() + career.toLowerCase()); 
    }
}

/*
Output:
	resume
	title: senior lead principal software engineer data architect
	degree: in college, i majored in political science and minored in religious studies.
*/