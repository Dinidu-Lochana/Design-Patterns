public class RealVideoDownloader implements VideoDownloader
{
    @Override
    public Video getVideo(String videoName)
    {
        System.out.println("Connecting... " + videoName);
        System.out.println("Downloading Video... " + videoName);
        System.out.println("Retrieving Video... " + videoName);
        return new Video(videoName);
    }
}
