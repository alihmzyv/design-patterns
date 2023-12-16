package org.example.refactoringGuru.structural.proxy;

import java.util.List;

public interface YoutubeAPIClient {
    List<Video> getFeed(String username);
    Video getVideo(String videoId);
}
