package pratica_1.suppress;

public class Main {

    public static void last() throws ExceptionInInitializerError{
        throw new ExceptionInInitializerError("Erro inicial");
    }

    public static void first() throws Exception{
        try {
            last();
        }
        catch (ExceptionInInitializerError e){
            throw new Exception("Novo erro");
        }

    }

    public static void main(String[] args) {
	    try {
	        first();
        }
        catch (Exception e){
	        System.out.print(e.getMessage());
        }
    }



}
