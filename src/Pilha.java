

public class Pilha {
    public static void main(String[] args){
        System.out.println("chammou método 1");
        metodo1();
        System.out.println("método 1 chamdou o método 2");

    }

    static void metodo1(){
        metodo2();
        System.out.println("chamou método 2");;

    }

    static void metodo2(){
        System.out.println("fim do método 2");


    }

}
