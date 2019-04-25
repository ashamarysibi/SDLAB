echo "enter a number"
read a;
if [ "$a" -eq 0 ]
then
echo "$a is equal to zero"
elif [ `expr $a % 2` -eq 0 ]
then
echo "$a is even"
else
echo "$a is odd"

fi 
