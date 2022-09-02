valueOne = float(input("Informe a primeira nota: "))
valueTwo = float(input("Informe a primeira nota: "))

average = (valueOne + valueTwo) / 2

if (average >= 5):
    print(f"Sua média foi {average:.2f} e você está aprovado!")
else:
    print("Reprovado!")
