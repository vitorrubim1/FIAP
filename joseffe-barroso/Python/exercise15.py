genderOption = {
  1: {'name': 'male'},
  2: {'name': 'female'},
}

heigth = float(input('Digite a sua altura em (m): '))
weight = float(input('Digite o seu peso (em Kg): '))
gender = input('Digite "M" para Masculino e "F" para feminino: ')

imc = weight / (heigth * heigth)

if (gender == 'M'):
  if (imc < 20):
    print("Abaixo do peso!")
  elif (imc < 25):
      print("Peso ideal!")
  else:
      print("Acima do peso!")

if (gender == 'F'):
  if (imc < 19):
    print("Abaixo do peso!")
  elif (imc < 24):
      print("Peso ideal!")
  else:
      print("Acima do peso!")

 
 
