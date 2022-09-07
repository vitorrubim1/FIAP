firstNumber = int(input('Digite o primeiro número: '))
secondNumber = int(input('Digite o segundo número: '))
thirdNumber = int(input('Digite o terceiro número: '))

listNumbers = [firstNumber, secondNumber, thirdNumber];

print("Ordem decrescente dos valores", sorted(listNumbers, reverse=True))