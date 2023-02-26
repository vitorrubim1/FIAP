package model;

public class Feriado {
    
    private String name;
    private String date;
    private String type;
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

    
    public String exibeFeriado(String diaDigitado, String mesDigitado) {
    	String dataFeriadoFormatada = date.replace("-", "");
    	String diaFeriado = dataFeriadoFormatada.substring(6,8);
        String mesFeriado = dataFeriadoFormatada.substring(4,6);
        
        String dataInformada = "(" + diaDigitado + "/" + mesDigitado + "/" + "2023" + ")";
        
        if ((diaFeriado == diaDigitado) && (mesFeriado == mesDigitado)) {
        	return "No data informada " + dataInformada + "acontece o feriado de: " + this.getType();
        }
        
        if (mesFeriado == mesDigitado) {
        	return "No data informada não foi encontrado, mas no mês " + mesDigitado + "acontece o feriado de: " + type;
        }
    	
//        return mesFeriado + " " + mesDigitado;
//        return diaFeriado + " " + diaDigitado;
//        return "Feriado [nome=" + name + ", data=" + date + ", tipo=" + type + "]";
        return "";
    }
}










