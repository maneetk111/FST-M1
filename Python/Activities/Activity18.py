import pandas as py
data = py.read_csv("activity17.csv")

print("Full Data: ")
print(data)

print("Usernames:")
print(data["Usernames"])

print("Username: ", data["Usernames"][1], " | ", "Password: ", data["Passwords"][1])

print("Data sorted in ascending Usernames:")
print(data.sort_values('Usernames'))

print("Data sorted in descending Passwords:")
print(data.sort_values('Passwords', ascending=False))