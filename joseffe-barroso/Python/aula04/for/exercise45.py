quantity = int(input("Informe a quantidade: "))
while (quantity <= 0 or quantity > 20): 
  quantity = int(input("O valor da sequência deve ser positivo e menor que vinte. Informe novamente: "))

sumNumbers = 0
higherNumber = 0
smallestNumber = 0
avaragePositiveValues = 0
avarageNegativeValues = 0

index = 0
for index in range (index, quantity, 1):
  number = int(input("Digite um número: "))

  if (number <= 0):
    avarageNegativeValues = avarageNegativeValues + 1
  elif (number > 0):
    avaragePositiveValues = avaragePositiveValues + 1

  if (index == 0):
    higherNumber = number
    smallestNumber = number
  elif (number > higherNumber):
    higherNumber = number
  elif (number < smallestNumber):
    smallestNumber = number

  sumNumbers = sumNumbers + number

avarage = sumNumbers / quantity

print(f"\nMaior valor informado: {higherNumber}")
print(f"\nMenor valor informado: {smallestNumber}")
print(f"\nSoma dos valores informado: {sumNumbers}")
print(f"\nMédia dos valores informados: {avarage}")
print(f"\nPorcentagem dos valores positivos: {(avaragePositiveValues * 100) / quantity}%")
print(f"\nPorcentagem dos valores negativos: {(avarageNegativeValues * 100) / quantity}%")