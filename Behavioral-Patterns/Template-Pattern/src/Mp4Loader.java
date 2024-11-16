public class Mp4Loader extends MediaPlayerLoader{
    @Override
    byte[] loadLocalData(){
        byte[] data = new byte[10];
        return data;
    }

    @Override
    void decodeMedia(byte[] data){
        System.out.println("Decoding MP4...");
    }

    @Override
    void initializeUI(){
        System.out.println("Initializing...");
    }
}
