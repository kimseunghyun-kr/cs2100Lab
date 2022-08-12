#include <stdio.h>

void display(int);

int main() {
  int ageArray[] = { 2, 15, 2, 4 };
  display(ageArray[2]);
  display(ageArray[0]);
  display((sizeof(ageArray) / sizeof(int)));
  printf("size of the array is %d", sizeof(ageArray) / sizeof(int));
  printf("%p , %p, %d, %d", ageArray , &ageArray[0], ageArray[0], *ageArray);
  return 0;
}

void display(int age) {
  printf("%d\n", age);
}
