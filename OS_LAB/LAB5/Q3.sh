#!/usr/bin/bash
x=1
for i in {1..5..1}
do

 for (( j=1 ; $j <= $i ; j=$(( $j + 1 )) ))
 do
 echo -n "$x "
 done
 echo
 x=$(( $x + 1 ))
done