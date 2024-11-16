public class Main {
    public static void main(String[] args) {
        MediaPlayerLoader mp3Loader = new Mp3Loader();
        MediaPlayerLoader mp4Loader = new Mp4Loader();

        mp3Loader.load();
        mp4Loader.load();
    }
}