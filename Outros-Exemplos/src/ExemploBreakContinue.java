public class ExemploBreakContinue {
    
    public static void main(String[] args) {
	
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                break;

                /*O break para na variável menor
                *Para o ontinue ele não imprime o 3
                *Para alterar o método, substitua o break por continue
                */
            
            System.out.println(numero);
            
        }
    }
}
