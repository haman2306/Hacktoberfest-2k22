#to calculate the bill per person

def food(f):
    tip=10/100*f
    f=tip+f
    fperson=f/num
    return fperson

def movie(m):
    mperson=m/num
    return mperson

num=int(input("enter thed total no. of people:  "))
ftotal=int(input("enter the total amount of food:  "))
mtotal=int(input("enter the total amount of movie:  "))

x=food(ftotal)
y=movie(mtotal)

print("amount per person is :  ",x+y)
