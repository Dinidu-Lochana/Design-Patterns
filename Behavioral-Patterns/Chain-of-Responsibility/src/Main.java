import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Database database = new Database();
        Handler handler = new UserExistsHandler(database)
                .setNextHandler(new ValidPasswordHandler(database))
                .setNextHandler(new RoleCheckHandler());
        AuthService authService=new AuthService(handler);
        authService.logIn("Username","Password");

    }
}