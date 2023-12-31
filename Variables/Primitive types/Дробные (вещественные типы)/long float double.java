long a = 1234567890;
float b = a; // b == 1.23456794E9
double c = a; // c == 1.23456789E9

// При преобразовании из целых чисел в дробные могут отбрасываться самые младшие части числа. 
// Но т.к. смысл дробного числа в том, чтобы хранить приблизительное значение, такое присваивание разрешается.


// Если в выражении участвуют целое число и число с плавающей точкой (float/double), 
// целое число будет преобразовано в число с плавающей точкой (float/double), 
// и только потом будет выполнена операция над ними.

// Если в операции участвуют float и double, то float будет преобразован к double. 
