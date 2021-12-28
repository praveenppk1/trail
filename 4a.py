n=int(input("enter the number"))
t=1
f=0
while True :
    t*=2
    if(n<t) :
        break
    else :
        if n == t :
            f=1
            break
if f == 1:
    print("it is possible")
else :
    print("not possible")
