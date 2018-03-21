package pratica_1.resource;

public class Resource implements AutoCloseable{

    @Override
    public void close() throws Exception {
        throw new Exception("Erro ao fechar");
    }

    public void doSomething(){
        System.out.println("Terminei.");
    }
}
