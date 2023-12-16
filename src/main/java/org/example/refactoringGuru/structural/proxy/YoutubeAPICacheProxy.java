package org.example.refactoringGuru.structural.proxy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class YoutubeAPICacheProxy implements YoutubeAPIClient {
    private final YoutubeAPIClient youtubeAPIClient;
    private final Map<String, List<Video>> feedByUsernameCache = new HashMap<>();
    private final Map<String, Video> videoByIdCache = new HashMap<>();

    public YoutubeAPICacheProxy(YoutubeAPIClient youtubeAPIClient) {
        this.youtubeAPIClient = youtubeAPIClient;
    }

    @Override
    public List<Video> getFeed(String username) {
        Optional<List<Video>> feedCache = Optional.ofNullable(feedByUsernameCache.get(username));
        if (feedCache.isEmpty()) {
            List<Video> feed = youtubeAPIClient.getFeed(username);
            feedByUsernameCache.put(username, feed);
            return feed;
        }
        System.out.println("Getting the feed for user from cache");
        return feedCache.get();
    }

    @Override
    public Video getVideo(String videoId) {
        Optional<Video> videoCache = Optional.ofNullable(videoByIdCache.get(videoId));
        if (videoCache.isEmpty()) {
            Video video = videoByIdCache.get(videoId);
            videoByIdCache.put(videoId, video);
            return video;
        }
        return videoCache.get();
    }

    public void reset() {
        feedByUsernameCache.clear();
        videoByIdCache.clear();
    }
}
