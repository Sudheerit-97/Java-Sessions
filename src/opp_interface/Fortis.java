package opp_interface;

public class Fortis extends Hospital implements Us_medical, Uk_medical, India_medical{

	// Us 
	
	@Override
	public void GynecologyServices() {
	  System.out.println("GynecologyServices");
		
	}

	@Override
	public void ObstetricsServices() {
		System.out.println("Obstetric______Services");
		
	}

	@Override
	public void DermatologyServices() {
		System.out.println("Dermatology_____services");	
	}
   // UK medical 
	@Override
	public void PediatricsServices() {
			System.out.println("PediatricsServices");
	}

	@Override
	public void OncologyServices() {
		System.out.println("OncologyServices");	
	}
   // India 
	@Override
	public void CardiologyServcices() {
		System.out.println("Gynecology___Services");
	}

	@Override
	public void NeurologyServices() {
		System.out.println("Neurology__Services");
	}

	@Override
	public void OrthopedicsServices() {
		System.out.println("Dermatology______Services");
		}
       // Own method
	public void EmergencyService() {
		System.out.println(" Hospital emergency___Services");
	}
	public void BloodTest() {
		System.out.println("blood test method ");
	}
	public static void Billing () {
		System.out.println("Fortis Hospital____Billing");
	}

	@Override
	public void Vacination() {
		System.out.println("Covid vaccination");
		
	}
}
