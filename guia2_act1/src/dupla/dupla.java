package dupla;

public class dupla {
	private int a;
	private int b;
	
	public static void main(String[] args) {
		dupla primerPar = new dupla();
		
		int x;
		int y;
		primerPar.Guarda(12, 32);
		x = primerPar.a;
		y = primerPar.b;
		
		
		System.out.println("Valor de primerPar.a: "+x);
		System.out.println("Valor de primerPar.b: "+y);
		
	} 
	
	public void Guarda(int a2, int b2) {
		this.a = a2;
		this.b = b2;
	}
	
}
