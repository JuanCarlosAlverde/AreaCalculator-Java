import java.util.Scanner;
public class AreaCalculator {
	private static Scanner menu = new Scanner(System.in);
	private static boolean running = true;
	public static void main (String args []) {

		while(running){
			imprimirMenu();
		}
	}
	public static void imprimirMenu(){
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("este programa calcula Áreas");
		System.out.println("1. Area de un triangulo");
		System.out.println("2. Area de un Cuadrado");
		System.out.println("3. Area de un rectangulo");
		System.out.println("4. Salir");
		System.out.println("Selecciona una opcion: ");
		System.out.println("---------------------------------------------------------------------------");
		int opc = menu.nextInt();
		switch(opc){
		case 1:
			areaTriangulo();
			break;
		case 2:
			areaCuadrado();
			break;
		case 3:
			areaRectangulo();
			break;
		case 4:
			System.out.println("Gracias por usar este sistema");
			salir();
			break;
		default:
			break;
		}
		System.out.println("---------------------------------------------------------------------------");

	}
	public static void salir(){
		running = false;
	}
	public static void areaTriangulo() {
		System.out.println("calcula el area de un triangulo\n\ningresa la base: ");
		float b = menu.nextFloat();
		System.out.println("ingresa la altura:");
		float a = menu.nextFloat();
		float area = (b* a)/2;
		System.out.println("El Area del triangulo de base "+b+" y altura "+a+" es: " + area + "M2");
	}
	public static void areaCuadrado() {
		System.out.println("calcula el area de un Cuadrado\n\ningresa lado a: ");
		float b = menu.nextFloat();
		System.out.println("ingresa lado b:");
		float a = menu.nextFloat();
		float area = b*a;
		System.out.println("El Area del Cuadrado de lados "+a+" y "+b+" es: " + area + "m2");
	}
	private static void areaRectangulo() {
		System.out.println("calcula el area de un Rectangulo\n\ningresa base : ");
		float b = menu.nextFloat();
		System.out.println("ingresa altura:");
		float a = menu.nextFloat();
		float area = b*a;
		System.out.println("El Area del Rectangulo de base "+b+" y altura "+a+" es de: " + area+ "m2");
	}
}