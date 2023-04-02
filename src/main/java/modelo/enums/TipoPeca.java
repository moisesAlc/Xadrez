package main.java.modelo.enums;

public enum TipoPeca {
	PEAO ("peão"),
	TORRE ("torre"),
	CAVALO ("cavalo"),
	BISPO ("bispo"),
	RAINHA ("rainha"),
	REI ("rei");
	
	private final String valorStr;
	
	private TipoPeca(String tipoPeca) {
		valorStr = tipoPeca;
    }
	
	public boolean ehIgualTipoPeca(String tipoPeca) {
        return valorStr.equals(tipoPeca);
    }
	
	public String toString() {
		return this.valorStr;
	}
}
