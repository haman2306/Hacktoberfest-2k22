#do i have enough money to buy the latest smartphone.
def money(m1,m2,m3):
    total=m1+m2+m3
    if total>30000:
        print("yaay!!!! you can buy the phn")
    else:
        print("sry! you can not buy the phn")

    return
savings=int(input("savings :   "))
internship=int(input("internship:   "))
gifts=int(input("gvifts :   "))
money(savings,internship,gifts)
