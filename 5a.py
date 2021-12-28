a=input("enter the list of integers ").split(" ")
t=tuple(a)

for i in range(len(t)-1):
    if int(t[i]) > int (t[i+1]):
        print(t[i+1])
    else :
        print(-1)
