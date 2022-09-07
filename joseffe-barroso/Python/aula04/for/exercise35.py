value = int(input("Informe um valor qualquer: "))

while (value <= 0): 
    value = int(input("Informe um valor positivo: "))

for index in range(1, 11, 1):
    result = value * index 
    print(f"{value} X {index} = {result}")
    index = index + 1
