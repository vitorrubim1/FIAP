manha = []
linhasManha=0
colunasManha=0

tarde = []
linhasTarde=0
colunasTarde=0

noite = []
linhasNoite=0
colunasNoite=0


retornar = "s"
empty = "-----";
lotacao=0

for index in range(0, 3, 1):
    if (index == 0):
        print("SESSÃO MATINAL")
        linhasManha = int(input('Digite a quantidade de fileiras que a casa de show terá: '))
        colunasManha = int(input('Digite a quantidade de poltronas por fileira que a casa de show terá: '))
    if (index == 1):
        print("\nSESSÃO VESPERTINA")
        linhasTarde = int(input('Digite a quantidade de fileiras que a casa de show terá: '))
        colunasTarde = int(input('Digite a quantidade de poltronas por fileira que a casa de show terá: '))
    if (index == 2):
        print("\nSESSÃO NOTURNA")
        linhasNoite = int(input('Digite a quantidade de fileiras que a casa de show terá: '))
        colunasNoite = int(input('Digite a quantidade de poltronas por fileira que a casa de show terá: '))


for index in range(0, linhasManha, 1):
    manha.append([])

for index in range(0, linhasTarde, 1):
    tarde.append([])
    
for index in range(0, linhasNoite, 1):
    noite.append([])

# Populando a matriz MANHÃ
for line in range(0, linhasManha, 1):
    for column in range(0, colunasManha, 1):
        manha[line].append(empty)

# Populando a matriz TARDE
for line in range(0, linhasTarde, 1):
    for column in range(0, colunasTarde, 1):
        manha[line].append(empty)

# Populando a matriz NOITE
for line in range(0, linhasNoite, 1):
    for column in range(0, colunasNoite, 1):
        manha[line].append(empty)

while(retornar == "s"): 
    name = input("Digite o nome do festeiro: ")

    fileira = int(input("Digite a fileira que você deseja sentar (1 a 10): ")) - 1  # Linha
    cadeira = int(input("Digite a cadeira que você deseja sentar (1 a 4): ")) - 1   # Coluna

    while (manha[fileira][cadeira] != empty):
        print("Essa assento já está reservado.")
        fileira = int(input("Digite novamente a fileira que você deseja sentar (1 a 10): ")) - 1  # Linha
        cadeira = int(input("Digite a cadeira que você deseja sentar (1 a 4): ")) - 1   # Coluna
  
    manha[fileira][cadeira] = name
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

print("Mapa da reserva da casa de show MANHÃ: ")
for index in range(0, linhas, 1):
    print(manha[index]);

print("Mapa da reserva da casa de show TARDE: ")
for index in range(0, linhas, 1):
    print(tarde[index]);

print("Mapa da reserva da casa de show NOITE: ")
for index in range(0, linhas, 1):
    print(noite[index]);