#!/usr/bin/bash

for i in {1..5..1}
do
 for (( j=1 ; $j <= $i ; j=$(( $j + 1 )) ))
 do
 echo -n "* "
 done
 echo
done