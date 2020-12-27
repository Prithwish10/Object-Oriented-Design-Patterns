class SingletonL{
    private static SingletonL soleInstance; // Lazy Initialize
    // Making the constructor as private. By this we are ensuring that no more than 1 object can be     created at a time
    private SingletonL(){
        System.out.println("Creating ...");
    }
    // A global point to access the instance
    public static synchronized SingletonL getInstance(){
        if(soleInstance == null)
            soleInstance = new SingletonL();
        return soleInstance;
    }
}
public class Singleton_Lazy {
    public static void main(String ags[]){
        SingletonL singleton1 = SingletonL.getInstance();
        SingletonL singleton2 = SingletonL.getInstance();

        // Will give same output
        System.out.println(singleton1); //o/p : SingletonL@372f7a8d
        System.out.println(singleton2); //o/p : SingletonL@372f7a8d
    }
}

