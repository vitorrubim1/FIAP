import requests

user = input("Digite o usuário do github: ")
url = f"https://api.github.com/users/{user}"

response = requests.get(url)

if response.status_code == 200:
    dados = response.json()
    print(f"Nome: {dados['name']}")
    print(f"Seguidores: {dados['followers']}")
    print(f"Quantidade de repositórios: {dados['public_repos']}")
else:
    print("Usuário não encontrado.")