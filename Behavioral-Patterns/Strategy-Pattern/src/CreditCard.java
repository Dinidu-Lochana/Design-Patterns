import lombok.Data;

@Data
public class CreditCard {
    private int balance=1000;
    private final String cardNumber;
    private final String date;
    private final String cvv;

}
