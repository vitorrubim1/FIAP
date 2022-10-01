list = []

# []
# 10, 8, 0, 3, 1
# [10]
# [10, ]

for index in range(0, 5, 1):
  number = int(input(f"Informe o {index + 1}º valor: "));

  # Caso inicial
  if (index == 0): list.append(number);
  else:
    position = 0

    while (position < len(list)):
      if (number >= list[position]): 
        list.insert(position, number);
        break;
      else:
        list.append(number);
       
      position = position + 1
  
print(f"{list}");