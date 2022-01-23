#! /bin/bash

read -p 'Enter the marks: ' marks
if [ $marks -le 100 -a $marks -ge 90 ]
then echo "Grade: O"
elif [ $marks -le 89 -a $marks -ge 80 ]
then echo "Grade: E"
elif [ $marks -le 79 -a $marks -ge 70 ]
then echo "Grade: A"
elif [ $marks -le 69 -a $marks -ge 60 ]
then echo "Grade: B"
elif [ $marks -le 59 -a $marks -ge 50 ]
then echo "Grade: C"
elif [ $marks -le 49 -a $marks -ge 40 ]
then echo "Grade: D"
else echo "FAIL"
fi