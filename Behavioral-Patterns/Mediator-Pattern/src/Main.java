import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JTextField userTextBox = new JTextField();
        JTextField passTextBox = new JTextField();

        LoginButton loginButton = new LoginButton();

        Dialog dialog = new Dialog();
        dialog.setUserTextBox(userTextBox);
        dialog.setPassTextBox(passTextBox);
        dialog.setButton(loginButton);

        userTextBox.setText("Name");
        passTextBox.setText("testPass");

        dialog.login();
    }
}