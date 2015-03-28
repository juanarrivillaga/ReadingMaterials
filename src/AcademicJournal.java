
public class AcademicJournal extends ReadingMaterial {
	private String journalName;
	private String date;
	private int volume;
	private int issue;
	
	public AcademicJournal(String language, String publisher, String journalName,
			String date, int volume, int issue) {
		super(language, publisher);
		this.journalName = journalName;
		this.date = date;
		this.volume = volume;
		this.issue = issue;
		
	}

	public AcademicJournal() {
		super();
		journalName = "Not Yet Specified";
		date = "Not Yet Specified";
		volume = 0;
		issue = 0;
	}

	public String getJournalName() {
		return journalName;
	}

	public void setJournalName(String journalName) {
		this.journalName = journalName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getIssue() {
		return issue;
	}

	public void setIssue(int issue) {
		this.issue = issue;
	}
	
	@Override 
	public String toString(){
		return String.format("%s%n%s%nVolume %d, Issue %d", super.toString(), getJournalName(),
				getVolume(), getIssue());
	}

}
