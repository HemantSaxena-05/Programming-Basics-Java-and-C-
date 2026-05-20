#include <stdio.h>
#include <stdlib.h>

int main()
{
    int cp;
    printf("Enter cost price: ");
    scanf("%d", &cp);
    int sp;
    printf("Enter selling price: ");
    scanf("%d", &sp);
    if(cp>sp){
        printf("LOSS!!!");
    }
    else {
        printf("PROFIT!!!");
    }
    return 0;
}
