#to check whether perfect no. or not
#!/usr/bin/bash
echo "enter the number"
read a

rem1=0
sum=0
i=1
while [ $i -lt $a ]
do
    if (( $(( $a % $i )) == 0 ))
    then
    sum=$(( sum + i ))
    fi
    i=$(( $i + 1 ))
done
if (( $sum == $a ))
then
echo "perfect no."
else
echo "Not a perfect no."
fi