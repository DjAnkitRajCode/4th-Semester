#include <stdio.h> 
#include <sys/types.h> 
#include <unistd.h>
int main()
{
    fork();
    printf("%d %d\n", getpid( ), getppid() );
    int x=fork();
    if(x==0)
    {
        printf("%d %d\n", getpid( ), getppid() );
    }
    return 0;

}