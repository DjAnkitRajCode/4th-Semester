echo -n "Enter Length :"
read n
echo "Enter numbers :"
i=0

while [ $i -lt $n ] 
do

    read arr[$i]


    i=`expr $i + 1`
done

max=${arr[0]}
min=${arr[0]}

for i in "${arr[@]}"
do
    if [[ "$i" -gt "$max" ]]; then
        max="$i"
    fi

    if [[ "$i" -lt "$min" ]]; then
        min="$i"
    fi
done


echo "Max is: $max"
echo "Min is: $min"
~