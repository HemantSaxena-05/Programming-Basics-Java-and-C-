#include <stdio.h>

int main()
{
    int m, n, p, q;

    // 1st matrix
    printf("Enter no of rows of 1st matrix: ");
    scanf("%d", &m);
    printf("Enter no of columns of 1st matrix: ");
    scanf("%d", &n);

    int a[m][n];
    printf("Enter elements of 1st matrix:\n");
    for(int i = 0; i < m; i++){
        for(int j = 0; j < n; j++){
            scanf("%d", &a[i][j]);
        }
    }

    // 2nd matrix
    printf("Enter no of rows of 2nd matrix: ");
    scanf("%d", &p);
    printf("Enter no of columns of 2nd matrix: ");
    scanf("%d", &q);

    int b[p][q];
    printf("Enter elements of 2nd matrix:\n");
    for(int i = 0; i < p; i++){
        for(int j = 0; j < q; j++){
            scanf("%d", &b[i][j]);   // ✅ fixed
        }
    }

    // condition
    if(n != p){
        printf("Matrix multiplication not possible\n");
        return 0;
    }


    int res[m][q];

    // multiplication
    for(int i = 0; i < m; i++){
        for(int j = 0; j < q; j++){
            res[i][j] = 0;   // ✅ initialize
            for(int k = 0; k < n; k++){
                res[i][j] += a[i][k] * b[k][j];
            }
        }
    }

    // result
    printf("\nResultant matrix:\n");
    for(int i = 0; i < m; i++){
        for(int j = 0; j < q; j++){
            printf("%d ", res[i][j]);
        }
        printf("\n");
    }

    return 0;
}
