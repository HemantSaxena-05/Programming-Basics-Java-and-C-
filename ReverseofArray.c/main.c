#include <stdio.h>
#include <stdlib.h>

int main()
{
    int arr[5];

    for(int i = 0; i<=4; i++){
        printf("\nEnter element number %d", i+1);
        scanf("%d", &arr[i]);
    }
    int i;
    for(i=4; i>=0; i--){
    printf("%d ", arr[i]);
    }
    return 0;
}
