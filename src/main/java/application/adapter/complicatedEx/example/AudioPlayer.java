package application.adapter.complicatedEx.example;

public class AudioPlayer implements MediaPlayer {
	private MediaAdapter mediaAdapter;

	@Override
	public void play(String audioType, String fileName) {
		if ("mp2".equalsIgnoreCase(audioType)) {
			System.out.println("Playing mp3 file. Name: " + fileName);
		} else if ("vlc".equalsIgnoreCase(audioType) || "mp4".equalsIgnoreCase(audioType)) {
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		} else
			System.out.println("CANNOT PLAY THIS TYPE OF FILE");
	}
}
