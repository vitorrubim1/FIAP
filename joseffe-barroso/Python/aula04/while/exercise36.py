value = int(input("Informe um valor qualquer: "))

while (value <= 0): 
    value = int(input("Informe um valor positivo: "))

interval = int(input("Informe o intervalo: "))

while (value > interval): 
    interval = int(input("O intervalo dever ser maior que o valor informado: "))

index = interval
while (index > 0):
    result = value * index
    print(f"{value} X {index} = {result}")
    index = index - 1

print("Isso é fiap")	