package pratica_1.encadeada;

public class Main {

    public static void d() throws Exception{
        throw new Exception("Primeira exceção");

    }

    public static void c() throws Exception{
        try {
            d();
        }
        catch (Exception e){
            throw new Exception("Segunda exceção", e);
        }
    }

    public static void b() throws Exception{
        try {
            c();
        }
        catch (Exception e){
            throw new Exception("Terceira exceção", e);
        }

    }

    public static void a() throws Exception{
        try {
            b();
        }
        catch (Exception e){
            throw new Exception("Quarta exceção", e);
        }

    }

    public static void main(String[] args) {
        try {
            a();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println(e.getCause());
        }
    }
}
