echo -n "Enter Length :"
read n
echo "Enter numbers :"
i=0

while [ $i -lt $n ] 
do

    read a[$i]


    i=`expr $i + 1`
done

echo "Output :"
i=$n

while [ $i -ge 0 ] 
do
    echo ${a[$i]} 

    i=`expr $i - 1`
done