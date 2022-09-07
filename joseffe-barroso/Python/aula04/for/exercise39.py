index = 1;
t1 = 1
t2 = 0
t3 = 0

for index in range(1, 31, 1):
    t3 = t1 + t2
    t1 = t2
    t2 = t3
    index = index + 1;
    print(t3)

print("Thank you")