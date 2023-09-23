import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) throws Exception {

    double mesada = 100;
    while (mesada > 0){

        double valorDoce = valorAleatorio();
        
            System.out.println("Doce de valor: " + valorDoce + " adicionado");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Gabriel gastou toda a sua mesada no doce");

    }



    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}