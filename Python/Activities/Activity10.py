mylist = tuple(input("Enter values for the tuple:").split(", "))
print("Numbers divisible by 5: ")
for num in mylist:
    if(int(num)%5==0):
        print(num)
