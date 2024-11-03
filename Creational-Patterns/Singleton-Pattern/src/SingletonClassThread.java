
// Multiple Thread Handling
public class SingletonClassThread {

    private static volatile SingletonClassThread instance;

    private String data;

    private SingletonClassThread(String data){
        this.data = data;
    }

    public static SingletonClassThread getInstance(String data) {
        SingletonClassThread result = instance;

        if (result == null) {
            synchronized (SingletonClassThread.class) {
                if (instance == null) {
                    instance = new SingletonClassThread(data);
                }
            }
        }
        return result;
    }
}
