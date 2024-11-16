public abstract class MediaPlayerLoader {
    public void load(){
        byte[] data = loadLocalData();
        decodeMedia(data);
        initializeUI();
        startPlayback();
    }

    abstract byte[] loadLocalData();
    abstract void decodeMedia(byte[] data);
    abstract void initializeUI();
    protected void startPlayback(){
        System.out.println("Playing.....");
    }
}
