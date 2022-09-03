name = input("Informe seu nome: ")
genre = input("Informe seu sexo (M para masculino) e (F para feminino): ")

if (genre == "M" or genre == "F"): 
  maritalStatus = int(input('''
    Informe seu estado civil

    1 - Solteiro(a)
    2 - Casado(a)
    3 - Separado(a)
    4 - Divorciado(a)
    5 - Viúvo(a)

    Digite o número correspondente: 
  '''))

  if (maritalStatus == 1 or maritalStatus == 2 or maritalStatus == 3 or maritalStatus == 4 or maritalStatus == 5):
    if (maritalStatus == 2):
      yearsMarried = float(input("Quantos anos de casado? "))
      print(f"Olá {name}, que legal que você está há {yearsMarried:.1f} casado(a)")
  else:
    print("Informe um estado civil que corresponde na lista")
else:
  print("Informe um genêro válido")

