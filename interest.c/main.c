#include<stdio.h>
int main() {
    float principle, rate, time, si;
    printf("Enter Priciple : ");
    scanf("%f", &principle);
    printf("Enter Rate : ");
    scanf("%f", &rate);
    printf("Enter Time : ");
    scanf("%f", &time);
    si = (principle*rate*time/100);
    printf("The calculated si is: %f", si);
    return 0;
}
