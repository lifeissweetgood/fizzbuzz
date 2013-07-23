#include <stdio.h>
#include <stdlib.h>

void fizzbuzz(int n)
{
    int i;
    for(i = 1; i <= n; i++)
    {
        if( i % 15 == 0 )
            printf("FizzBuzz\n");
        else if( i % 3 == 0)
            printf("Fizz\n");
        else if( i % 5 == 0 )
            printf("Buzz\n");
        else
            printf("%d\n", i);
    }
    return;
}

int main(int argc, char **args)
{
    if( argc < 2)
    {
        printf("Need a number!\n");
        exit(1);
    }
    fizzbuzz(atoi(args[1]));
}
