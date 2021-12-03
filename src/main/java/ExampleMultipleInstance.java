public class ExampleMultipleInstance {

    public ExampleMultipleInstance(){

    }

    public void hello(){
        System.out.println("Hello from ExampleMultipleInstance");
    }

    public static void main(String[ ] args){
        ExampleMultipleInstance exampleMultipleInstance = new ExampleMultipleInstance();
        exampleMultipleInstance.hello();
    }
}
