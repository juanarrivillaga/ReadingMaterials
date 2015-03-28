
public class Book extends ReadingMaterial {
	private String title;
	private String author;
	private String genre;
	
	public Book(String language, String publisher, 
			String title, String author, String genre) {
		super(language, publisher);
		this.title = title;
		this.author = author;
		this.genre = genre;
		
	}

	public Book() {
		super();
		title = "Not Yet Specified";
		author = "Not Yet Specified";
		genre = "Not Yet Specified";
				
	}
	
	public String getAuthor(){
		return author;
	}
	
	public void setAuthor (String author){
		this.author = author;
	}
	
	public String getGenre(){
		return genre;
	}
	
	public void setGenre(String genre){
		this.genre = genre;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString(){
		return String.format("%s%nTitle: %s%nAuthor: %s%nGenre: %s", 
				super.toString(), getTitle(), getAuthor(), getGenre());
	}
}


