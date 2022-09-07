# 39. Exibir os trinta primeiros valores da série de Fibonacci. A série: 1, 1, 2, 3, 5, 8, ...

index = 1;
t1 = -1
t2 = 1
t3 = 0

while (index < 10):
    t3 = t1 + t2
    t1 = t2
    t2 = t3
    index = index + 1;
    print(t3)

print("Fim")