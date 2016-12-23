package Lab92;

public class SmartphonePlayer implements MusicPlayer {

	@Override
	public void play(String album) {
		// TODO Auto-generated method stub

		System.out.println("Smartphone Player play" + album);
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

		System.out.println("Smartphone Player stop");
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

		System.out.println("Smartphone Player stop");
	}

	@Override
	public void next() {
		// TODO Auto-generated method stub

		System.out.println("Smartphone Player stop");
	}

	@Override
	public void previous() {
		// TODO Auto-generated method stub

		System.out.println("Smartphone Player stop");
	}

}
