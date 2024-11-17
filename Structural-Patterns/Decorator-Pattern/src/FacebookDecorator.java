public class FacebookDecorator extends BaseNotifierDecorator{
    public FacebookDecorator(INotifier wrapped){
        super(wrapped);
    }

    @Override
    public void send(String msg){
        super.send(msg);
        String username = databaseService.getFBFromUsername(getUsername());
        System.out.println("Sending " + msg+" by Facebook to "+ username);
    }
}
