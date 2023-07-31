
public class Automobil {

	public String marka;
	public String model;
	public String boja;
	public String regTablica;
	public String motor;
	public int godiste;
	public int brojVrata;
	
	public Automobil() {
		
	}
	
	public Automobil(String marka, String model, String boja, String regTablica, String motor, int godiste, int brojVrata) {
		this.marka = marka;
		this.model = model;
		this.boja = boja;
		this.regTablica = regTablica;
		this.motor = motor;
		this.godiste = godiste;
		this.brojVrata = brojVrata;
	}
	

	public void ofarbajAuto(String novaBoja) {
		this.boja = novaBoja;
		System.out.println("Nova boja je: "+novaBoja);
	}
	
	public void registrujAuto(String novaRegTablica) {
		this.regTablica = novaRegTablica;
		System.out.println("Novi registarski broj je: "+novaRegTablica);
	}
	
	public void dajInformacijeAuto() {
		System.out.println("Ovo je "+marka+" "+model+". Boja: "+boja+" Registarski broj: "+regTablica+" Motor: "+motor+ " Godiste: "+godiste+" Broj vrata: "+brojVrata+"" );
	}
	
}
