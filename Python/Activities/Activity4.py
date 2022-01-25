user1 = input("Enter is Player 1 name ")
user2 = input("Enter is Player 2 name ")

while True: 
    p1 = input(user1 + ", do you want to choose rock, paper or scissors? ").lower()
    p2 = input(user2 + ", do you want to choose rock, paper or scissors? ").lower()

    if(p1==p2):
        print("This game is a tie!")
    elif(p1=='rock'):
        if(p2=='scissors'):
            print("Rock wins")
        else:
            print("Paper wins")
    elif(p1=='scissors'):
        if(p2=='rock'):
            print("Rock wins")
        else:
            print("scissors wins")
    elif(p1=='paper'):
        if(p2=='scissors'):
            print("scissors wins")
        else:
            print("Paper wins")
    else:
        print("Invalid input")
    repeat = input("Do you want to play another round? Yes/No: ").lower()
    
    if(repeat == "yes"):
        pass
    elif(repeat == "no"):
        raise SystemExit
    else:
        print("You entered an invalid option. Exiting now.")
        raise SystemExit