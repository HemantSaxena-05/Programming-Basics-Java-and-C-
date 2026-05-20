#include <stdio.h>
#include <stdlib.h>

int main()
{
    int marks[10] = {95, 85, 68, 74, 21, 34, 28, 27, 56, 87};
    for(int i=0; i<=10; i++){
        if(marks[i]<35){    //printing index of array whose marks are less than 35//
        printf("%d ", i);
        }
    }
    return 0;
}
