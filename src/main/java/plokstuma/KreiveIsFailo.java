package plokstuma;

public class KreiveIsFailo {
	
	protected String vardas_failo;	
	
	public KreiveIsFailo( ) {
		
	}
	
	public KreiveIsFailo ( String failo_vardas ) {
		
		vardas_failo = failo_vardas;
	}	

	public Kreive gautiKreive() {
		
		Kreive kreive = new Kreive();
		
		return kreive;
	}
	
	public void setVardasFailo( String failo_vardas ) {
		
		vardas_failo = failo_vardas;
	}

	public String getVardasFailo() {
		
		return vardas_failo;
	}	
}
