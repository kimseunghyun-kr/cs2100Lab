#include <stdio.h>

typedef struct {
    int numer[1];
    int* denom;
} rational;

void multiply(rational x, rational* y){
    int x_num = *(x.numer), y_num = *(y->numer),
    x_den = *(x.denom), y_den = *(y->denom);
h
    *(x.numer) = x_num*y_num;
    *(y-> numer) = x_num*y_num;
    *(x.denom) = x_den*y_den;
    *(y->denom) = x_den*y_den;
}

int main(void) {
    int val1 = 2, val2 = 5;
    rational num1 = {{2}, &val1},
             num2 = {{3}, &val2};

    multiply(num1, &num2);
    printf("%d, %d\n", num1.numer[0], *(num1.denom));
    printf("%d, %d\n", num2.numer[0], *(num2.denom));
}