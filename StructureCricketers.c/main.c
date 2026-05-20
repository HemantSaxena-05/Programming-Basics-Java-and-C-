#include <stdio.h>
#include <string.h>

int main()
{
    typedef struct cricketer;
    char name[15];
    int age;
    int noOfMatches;
    float average;
    return 0;
} cricketer;

    cricketer arr[3];
    for(int i=0; i<3; i++){
        scanf("%[^\n]s", arr[i].name);
        scanf("%d", &arr[i].age);
        scanf("%d", &arr[i].noOfMatches);
        scanf("%f", &arr[i].average);

    for(int i=0; i<3; i++){
        printf("Name : %s", arr[i].name);
        printf("Age : %d", arr[i].age);
        printf("noOfMatches : %d", arr[i].noOfMatches);
        printf("Average : %f", arr[i].average);
    }
