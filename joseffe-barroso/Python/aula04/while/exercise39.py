index = 1;
t1 = -1
t2 = 1
t3 = 0

while (index < 31):
    t3 = t1 + t2
    t1 = t2
    t2 = t3
    index = index + 1;
    if(t3 == 0): continue
    print(t3)

print("Fim")