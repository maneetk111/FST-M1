from pickle import FALSE
import pandas as py

data = {
  "Usernames": ["admin", "Charles", "Deku"],
  "Passwords": ["password", "CHarli3", "AllMight"]
  }

dataframe = py.DataFrame(data)

print(dataframe)
dataframe.to_csv("activity17.csv",index=False)