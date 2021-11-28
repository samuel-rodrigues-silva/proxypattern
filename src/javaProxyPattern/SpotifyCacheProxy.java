package javaProxyPattern;

import java.util.HashMap;
import java.util.Map;

public class SpotifyCacheProxy implements SpotifyLib {
    private SpotifyLib youtubeService;
    private Map<String, Music> cachePopular = new HashMap<>();
    private Map<String, Music> cacheAll =  new HashMap<>();

    public SpotifyCacheProxy() {
        this.youtubeService = new SpotifyClass();
    }

    @Override
    public Map<String, Music> popularMusic() {
        if (cachePopular.isEmpty()) {
            cachePopular = youtubeService.popularMusic();
        } else {
            System.out.println("Retrieved list from cache.");
        }
        return cachePopular;
    }

    @Override
    public Music getMusic(String videoId) {
    	Music video = cacheAll.get(videoId);
        if (video == null) {
            video = youtubeService.getMusic(videoId);
            cacheAll.put(videoId, video);
        } else {
            System.out.println("Retrieved video '" + videoId + "' from cache.");
        }
        return video;
    }

    public void reset() {
        cachePopular.clear();
        cacheAll.clear();
    }
}