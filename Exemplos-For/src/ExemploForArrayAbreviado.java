import java.util.Arrays;

public class ExemploForArrayAbreviado {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        /* Em arrays o índice tem que ser sempre ZERO
        *Forma abreviada
        */

	    for(String aluno : alunos) {
        System.out.println(Arrays.toString(alunos));
      }
    }
}