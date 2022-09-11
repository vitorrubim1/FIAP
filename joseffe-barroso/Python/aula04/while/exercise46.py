quantity = int(input("Informe a quantidade: "))
while (quantity <= 0 or quantity > 20): 
  quantity = int(input("O valor da sequência deve ser positivo e menor que vinte. Informe novamente: "))

sumNumbers = 0
higherNumber = 0
smallestNumber = 0
avaragePositiveValues = 0
avarageNegativeValues = 0
userAnswer = 'NAO'

index = 0
while (index < quantity):
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
   
  index = index + 1

  if (index == quantity):
    print(f"Maior valor informado: {higherNumber}")
    print(f"Menor valor informado: {smallestNumber}")
    print(f"Soma dos valores informado: {sumNumbers}")
    print(f"Média dos valores informados: {avarage}")
    print(f"Porcentagem dos valores positivos: {(avaragePositiveValues * 100) / quantity}%")
    print(f"Porcentagem dos valores negativos: {(avarageNegativeValues * 100) / quantity}%")
    
    userAnswer = input("\nDeseja executar o programa novamente? 'SIM' ou 'NAO': ")
    while (userAnswer != 'SIM' and userAnswer != 'NAO'): 
      userAnswer = input("Deseja executar o programa novamente? 'SIM' ou 'NAO' ")
    if (userAnswer == 'SIM'): 
      sumNumbers = 0
      higherNumber = 0
      smallestNumber = 0
      avaragePositiveValues = 0
      avarageNegativeValues = 0
      quantity = int(input("Informe a quantidade: "))
      while (quantity <= 0 or quantity > 20): 
        quantity = int(input("O valor da sequência deve ser positivo e menor que vinte. Informe novamente: "))
      index = 0
    

