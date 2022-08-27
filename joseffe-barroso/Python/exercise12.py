firstNumber = float(input('Digite o primeiro número: '))
secondNumber = float(input('Digite o segundo número: '))
thirdNumber = float(input('Digite o terceiro número: '))
 
if (firstNumber > secondNumber and firstNumber > thirdNumber): 
    print("O primeiro valor informado é o maior")

if (secondNumber > firstNumber and secondNumber > thirdNumber): 
  print("O segundo valor informado é o maior")

if (thirdNumber > firstNumber and thirdNumber > secondNumber): 
  print("O terceiro valor informado é o maior")

if (firstNumber == secondNumber and firstNumber == thirdNumber):
  print("Os valores são iguais")
