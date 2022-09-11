quantity = 10
sumNumbers = 0
higherNumber = 0

for index in range (0, quantity, 1):
  number = int(input("Digite um número: "))

  if (index == 0):
    higherNumber = number
  elif (number > higherNumber):
    higherNumber = number

  sumNumbers = sumNumbers + number

avarage = sumNumbers / quantity

print("média", avarage)
print("soma", sumNumbers)
print("maior", higherNumber)
