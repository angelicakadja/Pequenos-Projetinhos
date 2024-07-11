public class AboutMe {
    public static void main(String[] args) {

        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.parseInt(args[2]);
        double altura = Double.parseDouble(args[3]);

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + " cm ");


        /*Onde tem Integer.valueOf(args[2])
         * Ao invés de usar valueOf para converter String em número, podemos usar parseInt
         * Onde tem Double.valueOf(args[3])
         * Ao invés de usar Double.valueOf para converter qualquer parâmetro para double, use o parseDouble
         */
    }
}
