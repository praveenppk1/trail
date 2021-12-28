n=int(input("enter the no of students"))
d={}
for i in range(n):
    s=input("enter the student name,roll no,branch and age:").split()

    d[s[0]]=s[1:]
names=list(d.keys())
names.sort()
for i in names:
      print("name is :",i)
      print("roll no is :",d[i][0])
      print("branch is :",d[i][1])
      print("age is :",d[i][2])
    
