#! /bin/bash
i=1
while [ $i -lt 1000 ]
do
    x=$i
    y=0
    digit=0
    sum=0
  while [ $x -gt 0 ]
    do
      x=$(( $x / 10 ))
      digit=$(( $digit + 1 ))  
    done

  x=$i
  while [ $x -gt 0 ]
    do
      rem=$(( $x % 10 ))  
      x=$(( $x / 10 ))
      c=`echo $rem ^ $digit | bc`
      sum=$(( $sum + $c ))
    done
  if (( $sum == $i ))
  then
  echo "number is $i"
  fi
i=$(( $i + 1 ))
done