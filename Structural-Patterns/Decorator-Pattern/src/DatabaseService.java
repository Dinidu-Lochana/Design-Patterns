public class DatabaseService {

    public String getPhoneNumberFromUsername(String username){
        return username + " @Phone";
    }

    public String getFBFromUsername(String username){
        return username + " @Facebook";
    }

    public String getMailFromUsername(String username){
        return username + " @Mail";
    }

}
