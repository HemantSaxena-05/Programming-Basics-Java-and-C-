#include <stdio.h>
#include <stdlib.h>

int main()
{
    int length;
    printf("Enter the length of rectangle: ");
    scanf("%d", &length);
    int breadth;
    printf("Enter the breadth of rectangle: ");
    scanf("%d", &breadth);
    int area = length * breadth;
    int perimeter = 2 * (length + breadth);
    if(area>perimeter){
        printf("Area is greater than perimeter");
    }
    else {
        printf("Area is not greater than than perimeter");
    }


    return 0;
}
