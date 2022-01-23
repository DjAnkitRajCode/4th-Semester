#! /bin/bash

read -p 'Enter any no. : ' n

if [ $((n % 2)) -eq 0 ]
then
echo "Entered number is Even."
else
echo "Entered number is Odd."
fi