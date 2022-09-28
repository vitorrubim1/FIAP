# 58. Armazenar o nome, sexo e idade de cem pessoas. Consistir as entradas no sentido de aceitar apenas “F” ou “M” para o sexo e valores positivos para a idade. 
# Após a digitação, exibir os dados (nome, sexo e idade) de todas as pessoas com idade superior a dezoito anos. Ao final da lista, exibir a quantidade de pessoas listadas.

name = []
age = []
gender = []

for index in range(0, 5, 1):
    name.append(input(f"Informe o nome da {index + 1}º pessoa: "));

    # Age 
    personAge = int(input("Agora informe a idade: "));
    while (personAge <= 0):
        personAge = int(input("Somente valores positivos, informe a idade: "));

    # Gender
    personGender = input("Agora o sexo (M) para Masculino e (F) para feminino: ")
    while (personGender != "M" and personGender != "F"):
        personGender = input("Agora o sexo (M) para Masculino e (F) para feminino: ")

    gender.append(personGender);
    age.append(personAge);

for index in range(0, 5, 1):
    if (age[index] > 18):
        print(f"Os maiores de idade da lista chama-se {name[index]} sexo: {gender[index]} e tem {age[index]} anos")

    

