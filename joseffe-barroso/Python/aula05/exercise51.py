arr = []

for index in range (0, 5, 1):
    number = int(input("Digite um número: "));
    arr.append(number);

print("Os números que você digitou foi: ")

for index in range (0, 5, 1):
    print(arr[index]);