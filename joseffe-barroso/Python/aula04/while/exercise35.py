value = int(input("Informe um valor qualquer: "))

while (value <= 0): 
    value = int(input("Informe um valor positivo: "))

index = 1
while (index < 11):
    result = value * index
    print(f"{value} X {index} = {result}")
    index = index + 1	
