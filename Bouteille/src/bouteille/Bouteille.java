package bouteille;

public class Bouteille {

	private float contenanceEnL;
	private float contenuEnL;
	private boolean ouvert;
	private String typeDuContenu;
	
	public Bouteille() {
		contenanceEnL = 1.2f;
		contenuEnL = 0.8f;
		ouvert = false;
		typeDuContenu = "coca";
	}
	
	public Bouteille(float _contenanceEnL, float _contenuEnL, boolean _ouvert, String _typeDuContenu) {
		this.contenanceEnL = _contenanceEnL;
		this.contenuEnL = _contenuEnL;
		this.ouvert = _ouvert;
		this.typeDuContenu = _typeDuContenu;
		
	}
	
	public float donneContenanceEnCL() {
		float result;
		result = this.contenanceEnL / 100;
		return result;
	}
	
	public void donneContenuEnCL() {
		
		
	}

	public boolean estPleine() {
		boolean pleine;
		if(this.contenuEnL == this.contenanceEnL);
	
	}
	
	public boolean fermer() {
		boolean 
	}
}
