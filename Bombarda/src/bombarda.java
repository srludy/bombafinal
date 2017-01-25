
public class bombarda {
	private String mensajeCodificado = "";
	private String mensaje = "";
	
public bombarda (){
	mensaje = "el rey es mi padre";
	mensajeCodificado = "";
}
	
	
	public static void main(String[] args) {
	bombarda B = new bombarda();
	B.codificador();
	B.muestraMensaje();
		

	}
	public void codificador (){
		
		for (int i = 0 ; i < mensaje.length() -1 ; i+=2){	
			if (i == 0){
				mensajeCodificado = mensajeCodificado + mensaje.charAt(0);
			}else{
				if(i == mensaje.length()-2){
					mensajeCodificado = mensajeCodificado + mensaje.charAt(i) + mensaje.charAt(i-1)+ mensaje.charAt(i+1);
					break;
				}
				mensajeCodificado = mensajeCodificado + mensaje.charAt(i) + mensaje.charAt(i-1);
			}
		}
			

	}
	public void muestraMensaje(){
		System.out.println(mensajeCodificado);
	}

}
