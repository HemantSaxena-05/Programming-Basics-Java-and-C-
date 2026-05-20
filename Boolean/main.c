#include <stdio.h>
#include <stdlib.h>

int main()
{
    int x = 3, y, z;
    y = x = 10;
    z = x< 10;
    printf("\nx= %d y = %d z = %d", x,y,z);
    return 0;
}
// pehle x = 3 tha..
// phir x = 10 kiya agli condition mai
// phir condtion di z ke liy eki x<10..
//lekin 10<10 nhi hota voh false hai..
//isliye z = 0 aaya kyuki false matlab 0.
