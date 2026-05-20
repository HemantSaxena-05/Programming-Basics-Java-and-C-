#include <stdio.h>
#include <stdlib.h>

int main()
{
    int a = 5;      //%p pointer ke liye hota hai, int* -> pointer
    int* x = &a;    //idhar isne a ka adress store kr liya
    printf("%p\n", x);
    printf("%p\n", &x);  //idhar hum pointer ka address print krwa rhe hai
    return 0;
}
