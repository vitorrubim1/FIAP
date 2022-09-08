index = 1

previousNumber = 0
nextNumber = 1
sumNumbers = 1

while (index < 31):
    print(nextNumber)
    sumNumbers = nextNumber + previousNumber
    previousNumber = nextNumber
    nextNumber = sumNumbers
    index = index + 1