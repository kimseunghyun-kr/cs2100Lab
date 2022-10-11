#include <stdio.h>
#include <ctype.h>

int main(void)
{
    char key[] = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    char lower[] = "HELLO";

    lower[0] = *key;

    printf("%s\n", key);
    printf("%s\n", lower);
}