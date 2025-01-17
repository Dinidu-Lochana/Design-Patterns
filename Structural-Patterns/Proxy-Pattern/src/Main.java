public class Main {
    public static void main(String[] args) {
        VideoDownloader videoDownloader = new ProxyVideoDownloader();
        videoDownloader.getVideo("Video1");
        videoDownloader.getVideo("Video2");
        videoDownloader.getVideo("Video1");
        videoDownloader.getVideo("Video3");

    }
}