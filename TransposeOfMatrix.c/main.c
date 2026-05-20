#include <stdio.h>
#include <stdlib.h>

int main()
{

    int r, c;
    printf("Enter the number of rows: ");
    scanf("%d", &r);
    printf("Enter the number of columns: ");
    scanf("%d", &c);
    printf("Enter all the elements:\n");
    int arr[r][c];
    for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++){
            scanf("%d", &arr[i][j]);
        }
    }
    printf("\n");
    for(int i=0; i<c; i++){     //idhar transpose krna hai isliye humne outer loop mai i<c kiya aur inner loop mai j<r kiy hai.
        for(int j=0; j<r; j++){
            printf("%d ", arr[j][i]);
        }
        printf("\n");
    }
    return 0;
}
