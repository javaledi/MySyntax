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

// Порядок методов в классе не важен
/*
class Solution
{
   public static void printWiFi()
   {
     System.out.print("Wi-");
     System.out.println("Fi");
   }

   public static void printWiFi10Times()
   {
     for (int i = 0; i < 10; i++)
       printWiFi();
   }
   public static void main(String[] args)
   {
     printWiFi10Times();
   }
}
*/
