public class TriánguloInvertido {

		public static void trianguloInvertido(int filas){
		int x,y;
		for(x=filas;x>=1;x--) {
			for(y=1;y<=x;y++){
			System.out.print("*");
			
			}
			System.out.println("");
		}
	}	
	public static void main(String[] args) {
	trianguloInvertido(6);
	}
}
