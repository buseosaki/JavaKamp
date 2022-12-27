package inheritance2;

public class FileLogger extends Logger {
	@Override 
	//base'deki kodun üzerine yaziyorum.
	public void log() {
		System.out.println("File yollandı.");
	}
}
