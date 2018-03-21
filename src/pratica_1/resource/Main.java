package pratica_1.resource;

public class Main {
    public static void main(String[] args) {
        try (Resource resource = new Resource()) {
            resource.doSomething();
        }
    }
}
