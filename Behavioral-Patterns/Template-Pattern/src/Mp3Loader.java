public class Mp3Loader extends MediaPlayerLoader{
    @Override
    byte[] loadLocalData(){
        byte[] data = new byte[10];
        return data;
    }

    @Override
    void decodeMedia(byte[] data){
        System.out.println("Decoding MP3...");
    }

    @Override
    void initializeUI(){
        System.out.println("Initializing...");
    }

}
