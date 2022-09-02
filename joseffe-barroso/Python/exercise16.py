acceleration = float(input("Informe o valor da aceleração em m/s2: "));
speed = float(input("Informe o valor da velocidade inicial em m/s: "));
travelTime = float(input("Informe o tempo de percurso em segundos: "));

kmPerHour = (speed + acceleration) * travelTime

print(kmPerHour);