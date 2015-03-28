// concrete superclass.
public class ReadingMaterial {
	private String language;
	private String publisher;
	
	public ReadingMaterial(String language, String publisher) {
		this.setLanguage(language);
		this.setPublisher(publisher);
	}
	
	public ReadingMaterial(){
		publisher = "Not yet specified";
		language = "Not yet specified";
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	@Override
	public String toString(){
		return String.format("Language: %s%nPublisher: %s", getLanguage(), getPublisher());
	}

}
