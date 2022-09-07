# Entrar via teclado com o sexo de determinado usuário, aceitar somente “F” ou “M” como respostas válidas.

gender = input("Informe seu sexo (F) para feminino e (M) para masculino: ")

while (gender != "M" and gender != "F"):
    gender = input("Informe um genêro válido (F) para feminino e (M) para masculino: ")

print("Thank you")