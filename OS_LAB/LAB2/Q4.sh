 #! /bin/bash

read -p 'Enter Time 1 in HH MM SS: ' ha ma sa

read -p 'Enter Time 2 in HH MM SS: ' hb mb sb

ta=$(( ha * 3600 ))
ta=$(( ta + $(( ma * 60 ))))
ta=$(( ta + sa ))

tb=$(( hb * 3600 ))
tb=$(( tb + $(( mb * 60 ))))
tb=$(( tb + sb ))

if [ $ta -gt $tb ] 
then
t=$(( ta - tb ))
else
t=$(( tb - ta ))
fi

h=$(( t / 3600 ))
t=$(( t % 3600 ))
m=$(( t / 60 ))
t=$(( t % 60 ))
echo "Time Difference- HH: $h hours, MM: $m mins, SS: $t secs "