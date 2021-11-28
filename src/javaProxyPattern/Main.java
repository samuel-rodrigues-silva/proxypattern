package javaProxyPattern;

public class Main {

	  public static void main(String[] args) {
	        SpotifyDownloader client = new SpotifyDownloader(new SpotifyCacheProxy());

	        test(client);

	    }

	    private static long test(SpotifyDownloader downloader) {
	        long startTime = System.currentTimeMillis();
	        
	        downloader.renderPopularMusics();
	        downloader.renderMusicPage("priotnlkjgnh");
	        downloader.renderPopularMusics();
	        downloader.renderMusicPage("s65d46a5s4ad");

	        downloader.renderMusicPage("13265fcsdfss");
	        downloader.renderMusicPage("98765qwe321s");

	        long finalTime = System.currentTimeMillis() - startTime;
	        System.out.print( finalTime + "ms\n");
	        return finalTime;
	    }
}
