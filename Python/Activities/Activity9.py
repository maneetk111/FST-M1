list1 = [10,11,12,13,14]
list2 = [21,22,23,24,25]
print("First list: ",list1)
print("Second list: ",list2)
newlist = []

for i in list1:
    if(i%2==0):
        newlist.append(i)
for j in list2:
    if(j%2!=0):
        newlist.append(j)
print ("Third list: ",newlist)
