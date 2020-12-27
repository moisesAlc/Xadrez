package modelo.enums;

public enum Cor {
	BRANCA ("branca"),
	PRETA ("preta");
	
	private final String valorStr;
	
	private Cor(String cor) {
		valorStr = cor;
    }
	
	public boolean ehIgualACor(String cor) {
        return valorStr.equals(cor);
    }
	
	public String toString() {
		return this.valorStr;
	}
}
