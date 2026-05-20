
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

void change(pokemon* p){
    (*p).hp = 70;
    (*p).attack = 80;
    (*p).speed = 150;
    (*p).tier = 'S';
    strcpy((*p).name,"Raichu");
    return;
}

int main()
{
    pokemon pikachu;
    pikachu.hp = 60;
    pikachu.attack = 100;
    pikachu.speed = 70;
    pikachu.tier = 'A';
    strcpy(pikachu.name, "Pikachu");
    return 0;

    printf("%d\n", pikachu.hp);
    printf("%d\n", pikachu.attack);
    printf("%d\n", pikachu.speed);
    printf("%c\n", pikachu.tier);
    printf("%s\n", pikachu.name);

    change(&pikachu);

    printf("%d\n", pikachu.hp);
    printf("%d\n", pikachu.attack);
    printf("%d\n", pikachu.speed);
    printf("%c\n", pikachu.tier);
    printf("%s\n", pikachu.name);

    return 0;

}
