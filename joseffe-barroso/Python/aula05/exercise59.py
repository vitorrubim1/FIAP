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

counter = 1;
for index in range(0, 5, 1):
    if (age[index] > 18 and counter <= 2):
        print(f"Os maiores de idade da lista chama-se {name[index]} sexo: {gender[index]} e tem {age[index]} anos")

    if (counter >= 2):
        input("Clique qualquer tecla pra visualizar mais");
        counter = 0;

    counter = counter + 1;


    

