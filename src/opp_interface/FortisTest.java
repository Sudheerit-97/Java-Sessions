package opp_interface;

public class FortisTest {
// can not create the object of interface 
	public static void main(String[] args) {
	  Fortis fh = new Fortis(); 
	  fh.CardiologyServcices();
	  fh.DermatologyServices();
	  fh.ObstetricsServices();
	  fh.DermatologyServices();
	  fh.PediatricsServices();
	  fh.OncologyServices();
	  fh.CardiologyServcices();
	  fh.GynecologyServices();
	  fh.NeurologyServices();
	  fh.EmergencyService();
	  fh.BloodTest();
	  Us_medical.Billing();
	  Fortis.Billing();
	  fh.HospitalRD();
	  
	  System.out.println(Us_medical.min_fee);
	   // Top Casting 
	  
	  Us_medical us = new Fortis();
	  
	  us.CardiologyServcices();
	  us.OrthopedicsServices();
	  us.NeurologyServices();
	  

	}

}
