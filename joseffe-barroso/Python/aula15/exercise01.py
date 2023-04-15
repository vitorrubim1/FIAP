def validar_numero(numero):
  try:
    numero = float(numero)
    if numero <= 0: raise ValueError
    
    return numero
  except ValueError:
    print("Erro: Digite um número positivo.")
    return None

itens_compra = []
for i in range(1, 4):
  print(f"\nProduto {i}:")
  nome = input("Nome do produto: ")
  
  quantidade = None
  while quantidade is None: quantidade = validar_numero(input("Quantidade: "))
  
  preco_unitario = None
  while preco_unitario is None: preco_unitario = validar_numero(input("Preço unitário: "))

  itens_compra.append((nome, quantidade, preco_unitario))

arquivo = open("joseffe-barroso/Python/aula15/lista.txt", "w")
for item in itens_compra:
  arquivo.write(f"{item[0]},{item[1]},{item[2]}\n")

print("Lista de compras gravada com sucesso!")
