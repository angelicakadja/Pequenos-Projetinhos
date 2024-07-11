public class Operadores {
    public static void main (String[] args) {
       
        // String unida com operador +

        String nomeCompleto = "LINGUAGEM " + "JAVA";
            System.out.println(nomeCompleto);
        
        // Concatenação com String e Número

        String concatenacao = "?"; 

            concatenacao = 1+1+1+"1";
                System.out.println(concatenacao);

            concatenacao = 1+"1"+1+1;
                System.out.println(concatenacao);

            concatenacao = 1+"1"+1+"1";
                System.out.println(concatenacao);

            concatenacao = "1"+1+1+1;
                System.out.println(concatenacao);

            concatenacao = "1"+(1+1+1);
                System.out.println(concatenacao);

            int numero = 5;
                System.out.println(numero);

        // Repetição

        numero = numero + 2;
            System.out.println(numero);

        // Decrementar automático

        System.out.println(numero --);
        System.out.println(numero);

        // Invertendo variável do tipo Booleana

        boolean variavel = true;

            variavel = !variavel;
                System.out.println(variavel);

        // Operador Ternário - método 1

        int a, b;

        a = 5;
        b = 6;

        String resultado = "";

        if (a==b)
            resultado = "verdadeiro";

        else
            resultado = "falso";

        System.out.println(resultado);

        // Operador Ternário - método 2

        int c, d;

        c = 5;
        d = 6;

        String valor = c==d ?"1" : "0";

        System.out.println(valor);

        // Operadores Relacionais

        int numero1 = 1;
        int numero2 = 2;

        if(numero1 > numero2)
	        System.out.println("Numero 1 maior que numero 2");

        if(numero1 < numero2)
	        System.out.println("Numero 1 menor que numero 2");

        if(numero1 >= numero2)
	        System.out.println("Numero 1 maior ou igual que numero 2");

        if(numero1 <= numero2)
	        System.out.println("Numero 1 menor ou igual que numero 2");

        if(numero1 != numero2)
	        System.out.println("Numero 1 é diferente de numero 2");

        // Operadores Relacionais com Boolean numeral

        int numero3 = 2;
        int numero4 = 5;

        boolean simNao = numero3 == numero4;

            if(numero3 < numero4){
                System.out.println("a nossa condição é verdadeira");
            }

            System.out.println("numero3 é igual a numero4? " + simNao);
        
        simNao = numero3 != numero4;
            System.out.println("numero3 é diferente de numero4? " + simNao);

        simNao = numero3 > numero4;
            System.out.println("numero3 é maior que numero4? " + simNao);

        // Comparar Objetos com Boolean String

        String nomeUm = "Kadja";
        String nomeDois = "Angelica";
        String nomeTres = new String("Kadja");
        
        System.out.println(nomeUm.equals(nomeDois));

        System.out.println(!nomeUm.equals(nomeDois));

        // Comparar objetos com equals String

        System.out.println(nomeUm.equals(nomeTres));

        // Operadores Lógicos

        boolean condicao1=true;
        boolean condicao2=false;

        if(condicao1 && condicao2){
            System.out.println("as duas condições são verdadeiras");
        }
            System.out.println("fim");

        if(condicao1 || condicao2){
            System.out.println("uma das condições é verdadeira");
        }
        

    }
        

    }
