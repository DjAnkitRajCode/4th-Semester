# !/usr/bin/bash
echo -n "ENter total no. of element :"
read n
echo "Enter elements"
i=0
while [ $i -lt $n ]
do
read a[$i]
i=$(( $i + 1 ))
done
j=0
echo "Elements are : "
for j in "${a[@]}"
do
echo $j
done