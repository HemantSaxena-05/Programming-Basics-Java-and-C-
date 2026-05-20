#include <stdio.h>
#include <stdlib.h>

int main()
{
    int i,j;
    int arr[5][5];
    for(int i=0; i<5; i++){
        for(j=0; j<5; j++){
            scanf("%d", &arr[i][j]);
        }
    }
    printf("\n");
    for(int i=0; i<5; i++){
        for(j=0; j<5; j++){
            printf("%d", arr[i][j]);
        }
        printf("\n");
    }
    return 0;
}
