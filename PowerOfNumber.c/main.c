#include <stdio.h>
#include <stdlib.h>

int main()
{
    int a;
    int b;
    printf("Enter Base: ");
    scanf("%d", &a);
    printf("Enter Power: ");
    scanf("%d", &b);
    int power = 1;
    for(int i =1; i<=b; i++){
        power = power * a;
    }
    printf("%d raised to the power %d is %d", a, b, power);
    return 0;
}
