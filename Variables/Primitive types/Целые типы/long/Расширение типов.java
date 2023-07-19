byte a = 5;
short b = a;
int c = a + b;
long d = c * c;

int a = 1;
long b = 2;
long c = a + b;
// a будет расширена до типа long и только затем произойдет сложение.
