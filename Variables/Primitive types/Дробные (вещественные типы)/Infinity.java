//  Бесконечность
  
// Числа с плавающей точкой обладают еще одной интересной особенностью: 
// они позволяют хранить специальное значение, обозначающее бесконечность. 
// Причем может быть положительная бесконечность и отрицательная бесконечность.

System.out.println( 100.0 / 0.0 ); // Infinity

System.out.println( -100.0 / 0.0 ); // -Infinity

double a = 1d / 0d; // a == Infinity
double b = a * 10; // b == Infinity
double c = b - 100; // c == Infinity

// Если бесконечность умножить на число, получится бесконечность. 
// Если к бесконечности добавить число, получится бесконечность.