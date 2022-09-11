sequence = int(input("Qual é o valor do termo?"))

while (sequence <= 0 or sequence > 50):
    sequence = int(input("O valor da sequência de termos deve ser positivo e menor que cinquenta. Informe novamente: "))

numerator = 1
denominator = 2
index = 1
sumNumbers = 0

while (index < sequence):
    division = numerator / denominator
    sumNumbers = sumNumbers + division
    print(f"{index}. {numerator}/{denominator}")
    numerator = numerator + 1
    denominator = denominator + 1
    index = index + 1

print("A soma deu: %.2f" % sumNumbers)