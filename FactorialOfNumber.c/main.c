#include <stdio.h>
#include <stdlib.h>

int main()
{

    int n;
    printf("Enter a Number: ");
    scanf("%d", &n);

    int product = 1;
    for(int i = 1; i<=n; i++){
        product = product * i;
        printf("The factorial of %d is %d\n", product);
    }

    return 0;
}
