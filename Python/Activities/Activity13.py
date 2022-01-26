list1 = [10, 11, 12, 13, 14, 15]
print("The list is ", list1)
def calcuate_sum(n):
    sum = 0
    for i in n:
        sum = sum + i

print("Sum of numbers in the list ", sum(list1))