def validar_numero(numero):
    try:
        numero = float(numero)
        if numero <= 0: raise ValueError
        return numero
    except ValueError:
        print("Erro: Digite um número positivo.")
        return None

while True:
    nome = input("Digite seu nome: ")
    quantidade_produto = None
    while quantidade_produto is None:
        quantidade_produto = validar_numero(input("Quantidade de produtos de informática que deseja comprar: "))

    produtos = []
    for i in range(int(quantidade_produto)):
        print(f"\nProduto {i + 1}:")
        nome_produto = input("Nome do produto: ")

        quantidade = None
        while quantidade is None:
            quantidade = validar_numero(input("Quantidade: "))
        
        preco_unitario = None
        while preco_unitario is None:
            preco_unitario = validar_numero(input("Preço unitário: "))
        
        produtos.append((nome_produto, quantidade, preco_unitario))

    arquivo_pedidos = open("pedidos.txt", "a")
   
    arquivo_pedidos.write(f"\n{nome}\n")
    
    for produto in produtos:
        arquivo_pedidos.write(f"{produto[0]},{produto[1]},{produto[2]}\n")
    
    arquivo_pedidos.close()

    novo_pedido = input("Deseja cadastrar um novo pedido? (S/N): ")
    
    if novo_pedido.upper() != 'S': break

print("Pedidos cadastrados com sucesso!")


arquivo_pedidos = open("pedidos.txt", "r")
arquivo_total_pedidos = open("total_pedidos.txt", "w")

nome_cliente = ""
total_pedido = 0

for linha in arquivo_pedidos:
    linha = linha.strip()
    if linha == "" and nome_cliente != "":
        arquivo_total_pedidos.write(f"{nome_cliente} - R$ {total_pedido:.2f}\n")
        nome_cliente = ""
        total_pedido = 0
    elif "," in linha:
        produto = linha.split(",")
        quantidade = float(produto[1])
        preco_unitario = float(produto[2])
        total_pedido += quantidade * preco_unitario
    else:
        nome_cliente = linha

arquivo_total_pedidos.write(f"{nome_cliente} - R$ {total_pedido:.2f}\n")

arquivo_pedidos.close()
arquivo_total_pedidos.close()

