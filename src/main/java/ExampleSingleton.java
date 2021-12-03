public class ExampleSingleton {

    private static ExampleSingleton uniqueInstance;
    private ExampleSingleton(){}

    public static ExampleSingleton getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new ExampleSingleton();
        }
        return uniqueInstance;
    }

    public void hello(){
        System.out.println("Hello from Singleton");
    }

    public static void main(String[ ] args){
        //ExampleSingleton exampleSingleton = new ExampleSingleton();
        ExampleSingleton exampleSingleton = ExampleSingleton.getInstance();
        exampleSingleton.hello();
    }

}
