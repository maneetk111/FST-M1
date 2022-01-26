from msilib import sequence


def fibonacci(n):
    if n <= 1:
        return n
    else:
        return(fibonacci(n-1) + fibonacci(n-2))

sequence = int(input("Enter a number: "))

if sequence <= 0:
    print("Please enter a positive number")
else:
    print("Fibonacci Sequence: ")
    for i in range(sequence):
        print(fibonacci(i))