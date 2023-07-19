// Каждый символ char — это в первую очередь число (код символа), а потом уже символ.
// Зная код символа, всегда можно получить его в программе:
char c = (char) 1128;
System.out.println(c);
// Output: Ѩ


char a = 'A'; // Переменная а будет содержать латинскую букву А.

char a = 65; // Переменная а будет содержать латинскую букву А. Ее код как раз 65.

char a = 0x41; // Переменная а будет содержать латинскую букву А.
// Ее код как раз 65, что равно 41 в шестнадцатеричной системе.

char a = 0x0041; // Переменная а будет содержать латинскую букву А.
// Ее код как раз 65, что равно 41 в шестнадцатеричной системе.
// Два лишних нуля ничего не меняют.

char a = '\u0041'; // Переменная а будет содержать латинскую букву А.
// Еще один способ задать символ по его коду.


char a = 'A';
a++;
System.out.println(a);
// На экран будет выведена латинская буква B. Потому что:
A – 65
B – 66
C – 67
