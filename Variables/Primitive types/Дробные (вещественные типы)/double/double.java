double a = 1234567890.1234567890; // Значение переменной 1234567890.1234567

double a = 1234567890.1234512345; // Значение переменной 1234567890.1234512

double a = 1234567890.1357913579; // Значение переменной 1234567890.1357913


// Под экспоненту выделяется 11 бит, что позволяет хранить степень десятки от -323 до +308 
// (степень двойки — от -1024 до +1023). 
// Тип double легко может хранить число с сотней нулей после запятой:
double a = 2E-300 * 3E+302 // Значение переменной 600.0


double infinity = 1d / 0d; // NaN

double a = 0.0 / 0.0; // a == NaN
double b = a * 10; // b == NaN
double c = b - 100; // c == NaN
double d = a + infinity; // d == NaN

System.out.println(0.0 / 0.0); // NaN

System.out.println(infinity / infinity); // NaN

// Любая операция с NaN дает NaN.


System.out.println( 100.0 / 0.0 ); // Infinity

System.out.println( -100.0 / 0.0 ); // -Infinity

double a = 1d / 0d; // a == Infinity
double b = a * 10; // b == Infinity
double c = b - 100; // c == Infinity
