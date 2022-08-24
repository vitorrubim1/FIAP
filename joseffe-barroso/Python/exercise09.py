heigth = float(input('Digite a sua altura em (m): '))
weight = float(input('Digite o seu peso (em Kg): '))
 
imc = weight / (heigth * heigth)
 
if (imc < 20):
    print("Abaixo do peso!")
elif (imc < 25):
    print("Peso ideal!")
else:
    print("Acima do peso!")