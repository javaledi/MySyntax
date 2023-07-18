class Solution
{
   public static void printLines(String text, int count) // Объявили метод printLines с параметрами: String text, int count
   {
     for (int i = 0; i < count; i++)
       System.out.println(text); // Метод выводит на экран count раз строку text
   }

   public static void main(String[] args)
   {
      // Вызываем метод printLines с разными параметрами
     printLines("Привет", 10); // text = "Привет"; count = 10;
     printLines("Пока", 20); // text = "Пока"; count = 20;
   }
}

// Каждый раз при вызове метода его переменным-параметрам присваиваются переданные значения, 
// и только потом начинают выполняться команды внутри метода

// Те значения, которые передаются в метод, при его вызове принято называть АРГУМЕНТАМИ МЕТОДА.

// Параметры метода - это именно переменные, которым присваиваются определенные значения при вызове метода.
// Сами же значения "Привет", "Пока", 10 и 20 называются АРГУМЕНТАМИ МЕТОДА.


/*
class Solution
{
   public static void printLines(String text, int count)
   {
     for (int i = 0; i < count; i++)
       System.out.print(text);
   }

   public static void main(String[] args)
   {
     String str = "Привет";
     int n = 10;
     printLines(str, n);
   }
}
*/

// Конфликт имен переменных при вызове метода

/*
class Solution
{
   public static void printLines(String text, int count)
   {
     for (int i = 0; i < count; i++)
       System.out.print(text);
   }

   public static void main(String[] args)
   {
     String text = "Привет";
     int count = 10;
     printLines(text, count);
   }
}
*/
