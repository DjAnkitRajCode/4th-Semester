#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>
void main()
{
    int i, pid;
    for (int j = 0; j < 3; j++)
    {
        pid = fork();
        if (pid = 0)
        {
            break;
        }
        wait();
    }
    printf("\nprocess id - > %d , Parent Process id - > %d ", getpid(), getppid());
}