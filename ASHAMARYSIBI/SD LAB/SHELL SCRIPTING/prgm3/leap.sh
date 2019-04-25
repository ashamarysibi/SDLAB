echo "enter a year"
read year;
if [ `expr $year % 4` -eq 0 ]
then
if [ `expr $year % 100` -eq 100 ]
then

if [ `expr $year % 400` -eq 400 ]
then
echo "$year is leap year"
else
echo "$year is not a leap year"
fi
else
echo "$year is leap year"
fi
else
echo "$year is not a leap year"
fi
