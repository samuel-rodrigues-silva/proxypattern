package javaNoProxy;

import java.util.HashMap;
import java.util.Map;


public class SpotifyClass implements SpotifyLib {

    @Override
    public Map<String, Music> popularMusic() {
        connectToServer("http://www.spotify.com");
        return getRandomMusic();
    }

    @Override
    public Music getMusic(String musicId) {
        connectToServer("http://www.spotify.com/" + musicId);
        return getSomeMusic(musicId);
    }



    private void connectToServer(String server) {
        System.out.print("Connecting to " + server + "... ");
        System.out.print("Connected!" + "\n");
    }

    private Map<String, Music> getRandomMusic() {
        System.out.print("Downloading populars... ");

        Map<String, Music> list = new HashMap<>() ;
        list.put("priotnlkjgnh", new Music("priotnlkjgnh", "jazz.mp3"));
        list.put("s65d46a5s4ad", new Music("s65d46a5s4ad", "underground.mp3"));
        list.put("13265fcsdfss", new Music("priotnlkjgnh", "Black Metal.mp3"));
        list.put("98765qwe321s", new Music("98765qwe321s", "Ratos de porão.mp4"));

        System.out.print("Done!" + "\n");
        return list;
    }

    private Music getSomeMusic(String musicId) {
        System.out.print("Downloading music... ");

        Music video = new Music(musicId, "Some video title");

        System.out.print("Done!" + "\n");
        return video;
    }

}