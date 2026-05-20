#include <stdio.h>
#include <stdlib.h>
#include<stdbool.h>

int main()
{
    typedef struct date{
        int date;
        int month;
        int year;
    } date;

    date a,b;
    date c;
    c = a;

    a.date = 5;
    a.month = 1;
    a.year = 2007;

    b.date = 23;
    b.month = 8;
    b.year = 2007;


    bool flag = true;
    if(a.date!=b.date) flag = false;
    if(a.month!=b.month) flag = false;
    if(a.year!=b.year) flag = false;

    if(flag==true) printf("The dates are same!!");
    else printf("The dates are different");
    return 0;
}
