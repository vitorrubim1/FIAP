arquivo = open("joseffe-barroso/Python/aula15/lista.txt", "r")
palavras = arquivo.readlines()

itens_total = []
for palavra in palavras:
    nome, quantidade, preco_unitario = palavra.strip().split(",")
    total = float(quantidade) * float(preco_unitario)
    itens_total.append((nome, total))

arquivoResultado = open("joseffe-barroso/Python/aula15/total.txt", "w")
for item in itens_total:
  arquivoResultado.write(f"{item[0]},{item[1]:.2f}\n")

print("Lista de preços gravada com sucesso!")
