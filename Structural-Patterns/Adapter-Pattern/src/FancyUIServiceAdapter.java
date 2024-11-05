public class FancyUIServiceAdapter implements IMultiRestoApp{
    private final FancyUIService fancyUIService;

    public FancyUIServiceAdapter(){
        fancyUIService = new FancyUIService();
    }

    @Override
    public void displayMenus(XmlData xmlData){
        JsonData jsonData = convertXmlToJson(xmlData);
        fancyUIService.displayMenu(jsonData);
    }

    @Override
    public void displayRecommendations(XmlData xmlData){
        JsonData jsonData = convertXmlToJson(xmlData);
        fancyUIService.displayRecommendations(jsonData);
    }

    private JsonData convertXmlToJson(XmlData xmlData){
        JsonData jsonData = new JsonData();
        return jsonData;
    }
}
