import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MultiRestoApp implements IMultiRestoApp{
    @Override
    public void displayMenus(XmlData xmlData){
        System.out.println("Menu");
    }

    @Override
    public void displayRecommendations(XmlData xmlData){
        System.out.println("Recommendations");
    }
}
