echo "enter limit"
read n;
s=$n;
for((i=1;i<n;i++))
do
for((j=1;j<=$s;j++))
do
echo -n " ";
done
for((k=1;k<=i;k++))
do
echo -n $k
done
for((l=i-1;l>=1;l--))
do
echo -n $l
done
echo " "
s=$((s-1))
done

for((i=n;i>0;i--))
do
for((j=1;j<=$s;j++))
do
echo -n " ";
done
for((k=1;k<=i;k++))
do
echo -n $k
done
for((l=i-1;l>=1;l--))
do
echo -n $l
done
echo " "
s=$((s+1))
done



