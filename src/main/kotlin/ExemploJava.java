public class ExemploJava {


    // Uma variavel "static", ela pertence ao escopo da classe, quando ela nao é "static" ai ela pertence ao objeto.

    static int valor = 0;
    int value = 0;

    public ExemploJava() {
        valor++;
        value++;
    }

    public static void main(String[] args) {
        new ExemploJava();
        new ExemploJava();
        new ExemploJava();
        new ExemploJava();

        ExemploJava ex = new ExemploJava();
        System.out.println(ex.value);
        System.out.println(ExemploJava.valor);

    }

}
