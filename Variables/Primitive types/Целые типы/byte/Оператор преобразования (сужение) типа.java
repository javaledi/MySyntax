long a = 1;
int b = (int) a;
short c = (short) b;
byte d = (byte) c;

long a = 1000000; // a == 1000000
int b = (int) a; // b == 1000000
short c = (short) b; // c == 16960
byte d = (byte) c; // d == 64