
public class ReadingMaterialsDriver {

	public static void main(String[] args) {
		ReadingMaterial book;
		ReadingMaterial journal;
		
		book = new Book("English", "Random House", "Dracula","Bram Stoker", "Gothic, Horror" );
		journal = new AcademicJournal("English", "AAAS", "Science", "27 March 2015", 347, 6229);
		
		// process ReadingMaterial objects polymorphically
		System.out.println(book.toString());
		System.out.println();
		System.out.println(journal.toString());

	}

}
/* Sample Output:
Language: English
Publisher: Random House
Title: Dracula
Author: Bram Stoker
Genre: Gothic, Horror

Language: English
Publisher: AAAS
Science
Volume 347, Issue 6229
*/