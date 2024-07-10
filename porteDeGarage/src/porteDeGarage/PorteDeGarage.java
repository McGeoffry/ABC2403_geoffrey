package porteDeGarage;

public class PorteDeGarage {

	private boolean estVerrouille;
	private float pourcentageDOuverture;
	
	public PorteDeGarage() {
	estVerrouille = true;
	pourcentageDOuverture = 0;
	}
	
	public PorteDeGarage(boolean _estVerrouille, float _pourcentageDOuverture) {
		this.estVerrouille = _estVerrouille;
		this.pourcentageDOuverture = _pourcentageDOuverture;
		
	}
	
	public float pourcentageDOuverture(float pourcent) {
		
		this.pourcentageDOuverture += pourcent;
		return this.pourcentageDOuverture;
	}
	public boolean estVerrouille() {
		boolean result = true;
		if(this.estVerrouille == false);
		 this.estVerrouille = true;
		 return result;
	}
}


