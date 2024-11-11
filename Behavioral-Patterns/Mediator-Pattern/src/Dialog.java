import javax.swing.JTextField;

public class Dialog implements Mediator{
    private JTextField userTextBox;
    private JTextField passTextBox;

    private LoginButton button;

    public void setUserTextBox(JTextField userTextBox) {
        this.userTextBox = userTextBox;
    }

    public void setPassTextBox(JTextField passTextBox) {
        this.passTextBox = passTextBox;
    }

    public void setButton(LoginButton button) {
        this.button = button;
    }
    @Override
    public void login(){
        String userName = userTextBox.getText();
        String password = passTextBox.getText();
        System.out.println("Username: " + userName);
        System.out.println("Password: " + password);
    }
}
