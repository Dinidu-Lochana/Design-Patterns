public class ReadyState extends State{
    public ReadyState(Phone phone){
        super(phone);
    }

    @Override
    public String onHome(){
        return "Home";
    }

    @Override
    public String onOffOn(){
        phone.setState(new OffState(phone));
        return "Off";
    }
}
