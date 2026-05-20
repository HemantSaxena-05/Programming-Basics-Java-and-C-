#include <stdio.h>
#include <stdlib.h>

int main()
{
    for(int i = 65; i<=90; i++){
        printf("%d ",i);
        char ch = (char)i;  //TYPE CASTING DONE HERE
        printf("%c\n", ch);
    }
    return 0;
}
