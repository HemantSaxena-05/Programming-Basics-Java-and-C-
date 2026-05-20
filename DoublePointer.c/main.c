#include <stdio.h>
#include <stdlib.h>

int main()
{
    int a = 25;
    int* x = &a;    //int* -> int ka address store krta hai
    int **y = &x;   //int** -> int* ka address store krta hai
    printf("%d\n", a);
    printf("%d\n", *x);
    printf("%d\n", **y);
    return 0;
}
