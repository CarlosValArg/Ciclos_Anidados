
public class Triángulo {

		public static void triangulo(int filas){
		int x,y;
		for(x=1;x<=filas;x++) {
			for(y=1;y<=x;y++){
			System.out.print("*");
			
			}
			System.out.println("");
		}
	}	
	public static void main(String[] args) {
	triangulo(5);
	}
}
