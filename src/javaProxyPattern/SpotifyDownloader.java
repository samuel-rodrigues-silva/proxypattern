package javaProxyPattern;

import java.util.Map;

public class SpotifyDownloader {
    private SpotifyLib api;

    public SpotifyDownloader(SpotifyLib api) {
        this.api = api;
    }

    public void renderMusicPage(String musicId) {
    	Music music = api.getMusic(musicId);
        System.out.println("\n-------------------------------");

        System.out.println("ID: " + music.id);
        System.out.println("Title: " + music.title);
        System.out.println("Music: " + music.data);
        System.out.println("-------------------------------\n");
    }

    public void renderPopularMusics() {
        Map<String, Music> list = api.popularMusic();
        System.out.println("\n-------------------------------");
        System.out.println("Random musics");
        for (Music music : list.values()) {
            System.out.println("ID: " + music.id + " / Title: " + music.title);
        }
        System.out.println("-------------------------------\n");
    }
}