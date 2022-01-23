#include <stdio.h>
#include <unistd.h>
#include <sys/types.h>
int main( )
{
fork() ;
printf("%d %%d\n", getpid( ), getppid() );
return 0;
}