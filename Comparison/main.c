#include <stdio.h>
#include <stdlib.h>

int main()
{
   int a;
   int b;
   int c;
   printf("Enter the first number: ");
   scanf("%d", &a);
   printf("Enter the second number: ");
   scanf("%d", &b);
   printf("Enter the third number: ");
   scanf("%d", &c);
   if(a>b && a>c){
    printf("%d is greatest", a);
   }
    if(b>a && b>c){
    printf("%d is greatest", b);
   }
    if(c>a && c>b){
    printf("%d is greatest", c);
   }

    return 0;
}
