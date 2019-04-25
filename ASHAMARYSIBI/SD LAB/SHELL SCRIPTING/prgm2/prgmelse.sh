#number is positive,Zero or negative
echo -e "enter a number:\c"
read number
if [ "$number" -lt 0 ]
then
echo "negative"
elif [ "$number" -eq 0 ]
then
echo Zero
else
echo positive
fi
