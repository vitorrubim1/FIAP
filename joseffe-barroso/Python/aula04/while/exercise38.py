index = 1;
finalValue = 1
currentValue = 1;

while (index < 101):
    currentValue = index;
    finalValue = finalValue + currentValue
    index = index + 1

print(f"O resultado da soma no intervalo de um a cem deu: {finalValue}")
