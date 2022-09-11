quantity = 10
sumNumbers = 0
higherNumber = 0

index = 0
while (index < quantity):
  number = int(input("Digite um número: "))

  if (index == 0):
    higherNumber = number
  elif (number > higherNumber):
    higherNumber = number

  sumNumbers = sumNumbers + number
  index = index + 1

avarage = sumNumbers / quantity

print("média", avarage)
print("soma", sumNumbers)
print("maior", higherNumber)
