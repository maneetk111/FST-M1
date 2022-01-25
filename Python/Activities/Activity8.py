mylist = list(input("Enter values for the list:").split(", "))
print("Given list is", mylist)
if(mylist[0]==mylist[-1]):
    print("First and last values are same")
else:
    print("First and last values not same")
