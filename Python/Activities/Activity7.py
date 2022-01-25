#list = [2,3,5,4,7]
mylist = list(input("Enter values for the list:").split(", "))
sum=0
for i in mylist:
    sum += int(i)
print(sum)
