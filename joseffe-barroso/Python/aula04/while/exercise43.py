sequence = int(input("Qual é o valor do termo?"))

while (sequence <= 0) or (sequence > 50):
    sequence = int(input("O valor da sequência de termos deve ser positivo e menor que cinquenta. Informe novamente: "))

numerator = 1
denominator = 2
index = 1
sumNumbers = 0

while (index < sequence):
    numerator = (index ** 2) + 1
    denominator = (index ** 3)
    divisao = numerator / denominator
    if (index == 1): print(f'{numerator}')
    else: print(f"{numerator}/{denominator}")
    index = index + 1
    sumNumbers = sumNumbers + divisao

print('A soma é: %.2f' %sumNumbers)