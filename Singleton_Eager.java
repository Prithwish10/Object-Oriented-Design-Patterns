class Singleton{
    private static Singleton soleInstance = new Singleton(); // Eager Initialize
    // Making the constructor as private. By this we are ensuring that no more than 1 object can be     created at a time
    private Singleton(){
        System.out.println("Creating ...");
    }
    // A global point to access the instance
    public static Singleton getInstance(){
        return soleInstance;
    }
}
public class Singleton_Eager{
    public static void main(String ags[]){
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1); //o/p : Singleton@372f7a8d
        System.out.println(singleton2); //o/p : Singleton@372f7a8d
    }
}