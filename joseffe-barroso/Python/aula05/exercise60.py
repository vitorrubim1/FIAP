list = []

for index in range(0, 5, 1):
  number = int(input(f"Informe o {index + 1}º valor: "));

  # Caso inicial ou se o número atual digitado é maior q o último da lista
  if (index == 0 or number > list[-1]): list.append(number);
  else:
    position = 0;

    # Percorrendo todos itens da lista pra verificar qual é maior q o ultimo número digitado
    while (position < len(list)):
      if (number <= list[position]):
        list.insert(position, number);
        break;
      position = position + 1;

print(f"{list}");