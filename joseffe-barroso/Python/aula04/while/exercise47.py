number = int(input("Digite o valor de n: "))
while (number <= 0): number = int(input("Informe somente valores positivos: "));

factorial = 1
multiplier = 2
while (multiplier <= number):
    factorial = factorial*multiplier

    multiplier = multiplier + 1
    
    if (multiplier - 1 == number):
        print(f"O valor de {number}! é = {factorial}")

        userAnswer = input("\nDeseja executar o programa novamente? 'SIM' ou 'NAO': ")
        while (userAnswer != 'SIM' and userAnswer != 'NAO'): 
            userAnswer = input("Deseja executar o programa novamente? 'SIM' ou 'NAO': ")
        if (userAnswer == 'SIM'): 
            multiplier = 2
            factorial = 1
            
            number = int(input("Digite o valor de n: "))
            while (number <= 0): number = int(input("Informe somente valores positivos: "));
        
    




