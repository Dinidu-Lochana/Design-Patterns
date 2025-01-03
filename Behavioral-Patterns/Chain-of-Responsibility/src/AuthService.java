public class AuthService {
    private Handler handler;

    public AuthService(Handler handler){
        this.handler = handler;
    }

    public boolean logIn(String email, String password){
        if(handler.handle(email,password)){
            System.out.println("Authorization successful");
            return true;
        }
        return false;
    }
}
