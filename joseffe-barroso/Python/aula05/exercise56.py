name = []
age = []

for index in range(0, 5, 1):
    name.append(input(f"Informe o nome da {index + 1}º pessoa: "));
    age.append(input("Agora informe a idade: "));

for index in range (0, 5, 1):
    print(f"A {index + 1}º pessoa chama-se {name[index]} e tem {age[index]}")

