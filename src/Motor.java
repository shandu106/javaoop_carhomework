
public class Motor {

	public String jacina;
	public String tipGoriva;
	public int snaga;
	public int zapremina;
	
	public Motor()
	{
		
	}
	public Motor(String jacina, String tipGoriva, int zapremina) {
		this.jacina = jacina;
		this.tipGoriva = tipGoriva;
		this.zapremina = zapremina;
	}
	
	public void povecajSnagu(int snaga) {
		int s = 2*snaga;
		System.out.println("Snaga automobila je: "+s);
	}
	
	public void dajInformacijeMotor() {
		System.out.println("Jacina motora: "+jacina+" Tip goriva: "+tipGoriva+" Zapremina motora: "+zapremina+"mm");
	}
}
	
