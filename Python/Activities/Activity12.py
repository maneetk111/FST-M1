def sum(n):
    if n:
        return n + sum(n-1)
    else:
        return 0

print("Result of 0 to 10: ", sum(10))