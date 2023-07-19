// Метод можно объявить в классе (ни в методе, ни в конструкторе).

int doWork() // Функция/метод правильно объявлена

// !Function DoWork()
 
// function DoWork()
 
// Procedure DoWork()
 

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
