from utils.handleRequest import handleRequest

user = input("Digite o usuário do github: ")
data = handleRequest(f"https://api.github.com/users/{user}")

if data != "":
    print(f"Nome: {data['name']}")
    print(f"Seguidores: {data['followers']}")
    print(f"Quantidade de repositórios: {data['public_repos']}")
else:
    print("Usuário não encontrado.")