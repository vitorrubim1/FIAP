value = 1

while (value < 20):
    for index in range(1, 21, 1):
        result = value * index 
        print(f"{value} X {index} = {result}")
        index = index + 1

        
        if (index == 21):
            confirmation = input("Digite 'OK' para continuar: ")
            
            if (confirmation == 'OK'):
                value = value + 1
            else:
                confirmation = input("Digite 'OK' para continuar: ")

print("Thank you")