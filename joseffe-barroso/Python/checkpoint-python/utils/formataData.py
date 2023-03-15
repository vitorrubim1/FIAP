def handleFormataData(data):
    data = data.replace("-", "")
    diaFeriado = data[6:8]
    mesFeriado = data[4:6]
    anoFeriado = data[0:4]

    dataFormatada = f"{diaFeriado}/{mesFeriado}/{anoFeriado}"

    return dataFormatada