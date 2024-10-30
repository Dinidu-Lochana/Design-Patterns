public class SingletonClass {

    private static SingletonClass instance;
    private String data;

    private SingletonClass(String data){
        this.data=data;
    }

    public static SingletonClass getInstance(String data){
        if(instance==null){
            instance = new SingletonClass(data);
        }
        return instance;
    }
}
