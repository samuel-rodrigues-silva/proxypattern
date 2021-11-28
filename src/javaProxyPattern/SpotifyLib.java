package javaProxyPattern;

import java.util.Map;

public interface SpotifyLib {
    Map<String, Music> popularMusic();

    Music getMusic(String videoId);
}