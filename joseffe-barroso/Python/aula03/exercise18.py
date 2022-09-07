acceleration = float(input("Informe o valor da aceleração em m/s2: "));
speed = float(input("Informe o valor da velocidade inicial em m/s: "));
travelTime = float(input("Informe o tempo de percurso em segundos: "));

kmPerHour = speed + (acceleration * travelTime)

if (kmPerHour <= 40): 
  print("Veículo muito lento")
elif (40 < kmPerHour <= 60):
  print("Velocidade permitida")
elif (60 < kmPerHour <= 80):
  print("Velocidade de cruzeiro")
elif (80 < kmPerHour <= 120):
  print("Veículo rápido")
elif (kmPerHour > 120):
  print("Veículo muito rápido")

