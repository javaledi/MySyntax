class Solution
{
   public static void fill(String[] array, String value)
   {
      for (int i = 0; i < array.length; i++)
        array[i] = value;
   }

   public static void main(String[] args)
   {
     String[] data = new String[10];
     fill(data, "Hello");
   }
}