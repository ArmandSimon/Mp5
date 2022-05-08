import java.util.*;
public class Salari {
	public static String Emp(Scanner scanner) throws BRException{
		System.out.println("Introdueix el tipus d'empleat:  \n-0.Venedor \n-1.Encarregt:");
		int num = Integer.parseInt(scanner.nextLine());
		String empleat="";

		if(num==0) {
			empleat="Venedor";
			return empleat;	
		}
		else if (num==1){
			empleat="Encarregat";
			return empleat;	
		}
		else {
			throw new BRException("Nomes pot tindre caracters alfanumerics");
		}
	}
	
	public static float ImportVendes(Scanner scanner) throws BRException{

		System.out.println("Introdueix l'import de vendes:");
		float vendes = Float.parseFloat(scanner.nextLine());
		if(vendes>=0) {	
			return vendes;	
		}
		else {
			throw new BRException("L'import ha de ser un número positiu.");
		}
	}
	
	public static int HoresExtra(Scanner scanner) throws BRException{
		System.out.println("Introdueix les hores extra:");
		int hores = Integer.parseInt(scanner.nextLine());
		if(hores>=0) {	
			return hores;	
		}
		else {
			throw new BRException("Les hores han de ser mes grans o iguals a zero.");
		}
	}

	public static void calculSalaris(Scanner scanner) throws BRException{
		String empleat = Emp(scanner);
		float vendes = ImportVendes(scanner);
		int hores = HoresExtra(scanner);
			
		float salariBrut= EmpleatBR.CalculaSalariBrut(empleat,vendes,hores);
		float salariNet = EmpleatBR.CalculaSalariNet(vendes);
		System.out.println("El sou brut es "+ salariBrut);
		System.out.println("El sou net es "+ salariNet);
	}
	
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		try {
			calculSalaris(scanner);
		}catch(Exception e){
			System.out.println("L'error és "+ e);
		}
	}
}
