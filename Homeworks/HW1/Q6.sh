for b in *;
do
a= "${b%.*}"
mkdir "$a"
mv "$b" "$a"
done
