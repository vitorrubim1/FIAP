# 38. Exibir a soma dos números inteiros positivos do intervalo de um a cem.

finalValue = 1
currentValue = 1;

for index in range(1, 101, 1):
    currentValue = index;
    finalValue = finalValue + currentValue

print(f"O resultado da soma deu: {finalValue}")
