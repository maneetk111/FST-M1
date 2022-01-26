import pandas as py
data = py.read_excel("activity19.xlsx")

print("Full Data: ")
print(data)

print("Number of rows and columns:",data.shape)

print("Data sorted in ascending FirstNames:")
print(data.sort_values('FirstName'))
