// Параметры — это специальные переменные метода. 
// С их помощью в метод можно передавать различные значения при его вызове.

public static void print() // Метод без параметров


public static void print(String str) // Объявлен метод print с параметром String str
{
} 


public static void print(String str, int count) // Объявлен метод print с двумя параметрами String str int count
{
}


public static void write(int x, int y) // Объявлен метод write с двумя параметрами int x int y
{
}


class Solution
{
   public static void main(String[] args)
   {
     printWiFi10Times(); // Вызываем метод printWiFi10Times
   }

   public static void printWiFi10Times() // Объявляем метод printWiFi10Times
   {
     for (int i = 0; i < 10; i++)
       printWiFi(); // Вызываем метод printWiFi10Times 10 раз в цикле
   }

   public static void printWiFi()
   {
     System.out.print("Wi-"); // Выводим на экран текст:
     System.out.println("Fi"); // Wi-Fi
   }
}


// Стандарты Java требуют, чтобы у всех методов внутри одного класса были уникальные имена. 
// Т.е. невозможно объявить в одном классе два одинаковых метода.
// Только вот при сравнении методов на одинаковость учитываются не только имена, но и типы параметров! 
// Причем имена переменных-параметров не учитываются.

// Эти два метода считаются одинаковыми (их нельзя объявить в одном классе).
void sum(int x, int y) {
}
void sum(int data, int value) {
}
// Каждый класс должен иметь не методы с уникальными именами, а методы с уникальными сигнатурами.

// Эти три метода считаются разными. Их можно объявить в одном классе.
void fill(int[] data, int value) {
}
void fill(int[][] data, int value) {
}
void fill(int[][][] data, int value)  {
}

// Все эти пять методов считаются разными. Их можно объявить в одном классе.
void print(String str) {
}
void print(String str, String str2) {
}
void print(int val) {
}
void print(double val) {
}
void print() {
}
// Компилятор следит, чтобы при вызове метода типы аргументов и параметров совпадали, а на имя аргумента не обращает никакого внимания.
// В Java имена переменных-параметров никак не помогают компилятору определить вызываемый метод. 
// Поэтому и не учитываются при определении уникальности метода.

// Имя метода и типы его параметров называются СИГНАТУРОЙ МЕТОДА: 
sum(int, int)

// Каждый класс должен иметь не методы с уникальными именами, а методы с уникальными сигнатурами.
