import lombok.Data;

@Data
public class PayPal {
    private int balance=1000000;
    private final String email;
    private final String password;
}
