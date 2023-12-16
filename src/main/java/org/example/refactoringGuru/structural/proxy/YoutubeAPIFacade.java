package org.example.refactoringGuru.structural.proxy;

import java.util.List;
import java.util.stream.IntStream;

public class YoutubeAPIFacade implements YoutubeAPIClient {
    @Override
    public List<Video> getFeed(String username) {
        connectToServer("youtube.com");
        return getFeedByUsername(username);
    }

    @Override
    public Video getVideo(String videoId) {
        connectToServer("youtube.com");
        return getVideoById(videoId);
    }

    private void connectToServer(String server) {
        System.out.print("Connecting to " + server + "... ");
        experienceNetworkLatency();
        System.out.print("Connected!" + "\n");
    }

    private void experienceNetworkLatency() {
        int randomLatency = random(5, 10);
        IntStream.range(0, randomLatency)
                .forEach(latencyCount -> {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
    }

    private int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    private List<Video> getFeedByUsername(String username) {
        System.out.println("Getting feed for user: " + username);
        experienceNetworkLatency();
        return List.of(new Video("1", "Some video title"));
    }

    private Video getVideoById(String videoId) {
        System.out.print("Playing video... ");
        experienceNetworkLatency();
        return new Video(videoId, "Some video title");
    }
}
