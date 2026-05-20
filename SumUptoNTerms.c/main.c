#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n;
    printf("Enter a Number: ");
    scanf("%d", &n);
    int sum = 0;
    if(n%2==0){
        sum = -n/2;
    }
    else{
        sum = -n/2 + n;
    }
    printf("The sum is %d", sum);
    return 0;
}
