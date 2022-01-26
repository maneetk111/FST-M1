fruits = {
    "apple":"20",
    "banana":"10",
    "grapes":"30",
    "mango":"15"
}
print("The list of fruits are ",fruits)

item = input("What are you looking for? ").lower()
if(item in fruits):
    print("It is available")
else:
    print("It is not available")