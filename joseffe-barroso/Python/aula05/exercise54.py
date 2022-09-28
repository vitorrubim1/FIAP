numbers = []
result = []

for index in range (0, 5, 1):
    number = int(input("Digite um número: "))
    numbers.append(number)

value = int(input("Digite um valor para a constante: "))

for index in range (0, 5, 1):
    result.append(value * numbers[index])

print("Array inicial", numbers);
print("Resultado final", result);

