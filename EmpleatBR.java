public class EmpleatBR extends Salari {
 
	public static float CalculaSalariBrut(String emp, float vendes, int hores) {
		float sou=0;
		float souextraventes=0;
		float souextrahores=0;
		if(emp=="Encarregat") {
			sou=1500;
		}
		else if (emp=="Venedor"){
			sou=1000;
		}
		if(hores>=1000 && hores<1500) {
			souextraventes=100;
		}
		else if (hores>=1500){
			souextraventes=200;
		}
		souextrahores=20*vendes;
		return(sou+souextraventes+souextrahores);
	 }
	
	 public static float CalculaSalariNet(float salari) {
		float retencio=1;
	
		if(salari>=1000 && salari<1500) {
			retencio=(float) (1-0.16);
		}
		else if (salari>=1500){
			retencio=(float) (1-0.18);
		}
		else {
			retencio=1;
		}
		float salariNet = retencio*salari;
		return(salariNet);
	 } 
}