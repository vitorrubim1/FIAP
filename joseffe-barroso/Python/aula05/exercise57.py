name = []
age = []
gender = []

for index in range(0, 3, 1):
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

for index in range(0, 3, 1):
    if (gender[index] == "F"):
        print(f"As mulheres da lista chama-se {name[index]} e tem {age[index]} anos")

    

