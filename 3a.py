old=int(input("enter the old meter reading:"))
new=int(input("enter the new meter reading:"))
cu=new-old
total_amount=0
if cu >= 0 and cu <= 100:
    total_amount=cu*4
elif cu >= 101 and cu <= 150:
    total_amount=cu*4.6
elif cu >= 151 and cu <= 200:
    total_amount=cu*5,2
elif cu >= 201 and cu <= 300:
    total_amount=cu*5.3
else :
    total_amount=cu*8
print("the total_amount is:",(total_amount))
