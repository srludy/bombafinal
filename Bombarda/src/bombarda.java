

public class bombarda {
	private int mensajeCodificado[];
	private int mensaje[];
	
public bombarda (){
	mensaje = new int[8];
	mensaje[0] = 7;
	mensaje[1] = 3;
	mensaje[2] = 5;
	mensaje[3] = 8;
	mensaje[4] = 9;
	mensaje[5] = 6;
	mensaje[6] = 0;
	mensaje[7] = 5;
	mensajeCodificado = new int[8];
}
	
	
	public static void main(String[] args) {
	bombarda B = new bombarda();
	B.codificador();
	B.muestraMensaje();
		

	}
	public void codificador (){
		
		for (int fila = 0 ; fila < mensaje.length ; fila++){	
			for (int fila2 = 0 ; fila2 < 11 ; fila2++){
				if(fila2 == mensaje[fila]){
					mensajeCodificado[fila] = mensaje[fila]+1;
				}
			}
	
		}
			

	}
	public void muestraMensaje(){
	for(int i = 0; i < mensajeCodificado.length ; i++){	
		System.out.println(mensajeCodificado[i]);
	}
	}

}

