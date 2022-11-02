onibus = []
retornar = "s"
empty = "-----";
lotacao=0

for index in range(0, 10, 1):
    onibus.append([])

# Populando a matriz
for line in range(0, 10, 1):
    for column in range(0, 4, 1):
        onibus[line].append(empty)

while(retornar == "s"): 
    name = input("Digite o nome do passageiro: ")
    fileira = int(input("Digite a fileira que você deseja sentar (1 a 10): ")) - 1  # Linha
    cadeira = int(input("Digite a cadeira que você deseja sentar (1 a 4): ")) - 1   # Coluna

    while (onibus[fileira][cadeira] != empty):
        print("Essa assento já está reservado.")
        fileira = int(input("Digite novamente a fileira que você deseja sentar (1 a 10): ")) - 1  # Linha
        cadeira = int(input("Digite a cadeira que você deseja sentar (1 a 4): ")) - 1   # Coluna
  
    onibus[fileira][cadeira] = name
    print("Reserva realizada com sucesso!")
    lotacao = lotacao + 1

    if (lotacao != 40):
        retornar = input("Deseja realizar mais alguma reservar? S/N: ").lower()
        while (retornar != "n" and retornar != "s"):
            print("Digite somente S ou N")
            retornar = input("Deseja realizar mais alguma reservar? S/N: ").lower()
    else:
        print("O ônibus está lotado")
        break

print("Mapa da reservas do ônibus: ")
for index in range(0, 10, 1):
    print(onibus[index]);