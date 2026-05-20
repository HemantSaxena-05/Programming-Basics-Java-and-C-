#include <stdio.h>
#include <string.h>

int main()
{
    struct book {
        char name[50];
        int noOfPages;
        float price;
        } a,b,c;

        a.noOfPages = 120;
        a.price = 150.36;
        strcpy(a.name, "Secret Seven");

        b.noOfPages = 150;
        b.price = 170.58;
        strcpy(b.name, "Famous Five");

        c.noOfPages = 200;
        c.price = 180.23;
        strcpy(c.name, "Charlie Chocolate Factory");

        printf("%f\n", a.price);
        printf("%d\n", b.noOfPages);
        printf("%s\n", c.name);
    return 0;
}
