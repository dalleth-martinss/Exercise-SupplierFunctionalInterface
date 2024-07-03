import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        /*Supplier representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
        *É comumente usado para criar ou fornecer novos objetos de um determinado tipo.*/

        /*Usa Supplier com expressão lambda que não recebe nenhum paramentro, e fornece uma saudação personalizada.
        retorna  um output do mesmo tipo "String" */

        Supplier<String> saudacao = () -> "Olá, seja bem vindo (a)!";


        //Usar o Supplier para obter uma lista com 5 saudações

        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(5)
                .toList();

        //Imprime as saudações que foram geradas.
        listaSaudacoes.forEach(System.out::println);



    }
}