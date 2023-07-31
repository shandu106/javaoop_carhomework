
public class MainClass {

	public static void main(String[] args) {
		
		
		Automobil a1 = new Automobil("Renault", "Clio", "Bela", "ABC 123", "E Tech", 2019, 4);
		a1.dajInformacijeAuto();
		a1.ofarbajAuto("Plava");
		a1.registrujAuto("FDA 333");
		
		
		Motor m1 = new Motor("83 KW", "Dizel", 2175);
		m1.dajInformacijeMotor();
		m1.povecajSnagu(20);
		
		
		Automobil a2 = new Automobil("Audi", "A5", "Crna", "BCA 321", "TFSI", 2009, 4);
		a2.dajInformacijeAuto();
		a2.ofarbajAuto("Zuta");
		a2.registrujAuto("CCA - 222");
		
		
		Motor m2 = new Motor("81 KW", "Dizel", 2100);
		m2.dajInformacijeMotor();
		m2.povecajSnagu(20);
		
		
		Automobil a3 = new Automobil("Mazda", "CX-9", "Crvena", "CBA 332", "Skyactiv", 2010, 4);
		a3.dajInformacijeAuto();
		a3.ofarbajAuto("Bela");
		a3.registrujAuto("DDC - 322");
		
		
		Motor m3 = new Motor("85 KW", "Dizel", 2275);
		m2.dajInformacijeMotor();
		m3.povecajSnagu(20);
		
		
	}

}
