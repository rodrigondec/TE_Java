package pratica_1.resource;

public class Resource implements AutoCloseable{

    @Override
    public void close() throws IndexOutOfBoundsException {
        throw new IndexOutOfBoundsException("Erro ao fechar o indice.");
    }

    public void doSomething(){
        System.out.println("Terminei.");
    }
}
