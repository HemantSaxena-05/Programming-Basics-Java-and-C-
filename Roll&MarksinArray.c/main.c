#include <stdio.h>

int main() {
    int arr[4][4]; // 4 students, 4 columns (Roll, P, C, M)

    // Input
    for(int i = 0; i < 4; i++) {
        printf("\nEnter details for Student %d:\n", i + 1);

        printf("Roll No: ");
        scanf("%d", &arr[i][0]);

        printf("Physics Marks: ");
        scanf("%d", &arr[i][1]);

        printf("Chemistry Marks: ");
        scanf("%d", &arr[i][2]);

        printf("Maths Marks: ");
        scanf("%d", &arr[i][3]);
    }

    // Display
    printf("\n--- Student Data ---\n");
    printf("Roll\tP\tC\tM\n");

    for(int i = 0; i < 4; i++) {
        for(int j = 0; j < 4; j++) {
            printf("%d\t", arr[i][j]);
        }
        printf("\n");
    }

    return 0;
}
