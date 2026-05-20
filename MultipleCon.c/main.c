#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);
    if(n%5==0 && n%3==0) {
        printf("The number is divisble");
    }
    else {
        printf("It is not.");
    }
    return 0;
}
