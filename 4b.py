s={1,2,3,4,5}
t={6,7,8,9,1,2,3,4,5}
s.update(t)
print(s)
print(t.issuperset(s))
s.discard(t)
print(s)
print(t.isdisjoint(s))
s.symmetric_difference(t)
print(s)
