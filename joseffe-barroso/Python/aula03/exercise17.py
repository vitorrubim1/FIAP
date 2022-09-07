heigth = float(input('Digite a sua altura em (m): '))
weight = float(input('Digite o seu peso (em Kg): '))
gender = input('Digite "M" para masculino e "F" para feminino: ')

while (gender != 'M' and gender != 'F'):
    gender = input(
        'INFORME UM GENÊRO VALIDO. "M" para Masculino e "F" para feminino: ')

imc = weight / (heigth * heigth)

if (gender == 'M'):
    if (imc < 20):
        print("Abaixo do peso!")
    elif (imc < 25):
        print("Peso ideal!")
    else:
        print("Acima do peso!")

else:
    if (imc < 19):
        print("Abaixo do peso!")
    elif (imc < 24):
        print("Peso ideal!")
    else:
        print("Acima do peso!")
