#include <stdio.h>
#include <string.h>
#include<stdbool.h>

typedef struct pokemon{
        int hp;
        int attack;
        int speed;
        char tier;
        char name[15];
    } pokemon;


int main()
{
    pokemon pikachu;
    pikachu.hp = 60;
    pikachu.attack = 100;
    pikachu.speed = 70;
    pikachu.tier = 'A';
    strcpy(pikachu.name, "Pikachu");

    (*x).hp = 70;           //value of hp will change along with attack.
    (*x).attack = 120;

    printf("%d", pikachu.hp);
    printf("%d", pikachu.attack);
    return 0;
}
