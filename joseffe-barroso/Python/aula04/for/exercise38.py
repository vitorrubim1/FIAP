finalValue = 1
currentValue = 1;

for index in range(1, 101, 1):
    currentValue = index;
    finalValue = finalValue + currentValue

print(f"O resultado da soma no intervalo de um a cem deu: {finalValue}")
