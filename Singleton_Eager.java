class SingletonS{
    private static SingletonS soleInstance = new SingletonS(); // Eager Initialize
    // Making the constructor as private. By this we are ensuring that no more than 1 object can be     created at a time
    private SingletonS(){
        System.out.println("Creating ...");
    }
    // A global point to access the instance
    public static SingletonS getInstance(){
        return soleInstance;
    }
}
public class Singleton_Eager{
    public static void main(String ags[]){
        SingletonS singleton1 = SingletonS.getInstance();
        SingletonS singleton2 = SingletonS.getInstance();

        System.out.println(singleton1); //o/p : Singleton@372f7a8d
        System.out.println(singleton2); //o/p : Singleton@372f7a8d
    }
}