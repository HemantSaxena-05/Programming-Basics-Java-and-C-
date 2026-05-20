/* take positive integer input and tell if it is divisible by 3 or 5 and not divisble by 15*/

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);
    if (n%5==0 || n%3==0){
        if (n%15!=0){
            printf("The number is divisible by 5 and 3 and not 15");
        }
        else {
            printf("The number is divisble by 15");
        }
    }
    return 0;
}
