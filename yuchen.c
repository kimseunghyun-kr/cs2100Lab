#include <stdio.h>


int main(void) {
    int son;
    int daughter;

    int* father;
    int** grandfather;

    son = 5;
    daughter = 7777;

    father = &son;
    grandfather = &father;

    printf("\n this is the original version \n");
    printf("son's address : %p \n, address stored in father: %p \n", &son, father);
    printf("this is to check father's address stored in grandfather : %p \n, %p \n", &father, grandfather);
    printf("father content check %d \n", *father);
     printf("grandfather content check %p \n", &father);

    father++;

        printf("\n this is the new version \n");
    printf("son's address : %p \n, address stored in father: %p \n", &son, father);
    printf("this is to check father's address stored in grandfather : %p \n, %p \n", &father, grandfather);

    printf("grandfather content check %p \n", &father);

}   