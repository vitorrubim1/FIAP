index = 1

firstNumber = -1
secondNumber = 1
thirdNumber = 1
sumNumbers = 0

for index in range(1, 31, 1):
    print(secondNumber)
    sumNumbers = secondNumber + firstNumber + thirdNumber
    firstNumber = secondNumber
    secondNumber = thirdNumber
    thirdNumber = sumNumbers
    index = index + 1