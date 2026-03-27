/*
Part 4: Object Arrays — Library System
Create a Book class: 
Include title, author, ISBN (String), genre, and isIssued (boolean). 
Include a constructor, displayInfo(), markIssued(), and markReturned().

Create a Library class: Include name, an array of Book objects (e.g., Book[] books with a maximum size of 20), and bookCount (int).
Library Methods:
addBook(Book b)
findByTitle(String title): Returns the Book object or prints "Not found".
findByAuthor(String author): Prints all matching books.
issueBook(String title): Marks the book as issued if it is available.
returnBook(String title)
displayAllBooks()
countAvailable()
Testing (in main): 
Create a Library. 
Add 6 books. 
Issue 2 books. 
Return 1 book. 
Search for a specific book. 
Finally, print all books along with their current issue status.
*/
class Book{
	String title, author, ISBN, genre;
	boolean isIssued;

	Book(String title,String author,String ISBN, String genre,boolean isIssued){
		this.title=title;
		this.author=author;
		this.ISBN=ISBN;
		this.genre=genre;
		this.isIssued=isIssued;
	}

	void displayInfo(){
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
		System.out.println("ISBN: "+ISBN);
		System.out.println("Genre: "+ genre);
		System.out.println("IsIssued: "+isIssued);
		System.out.println("----------------------------------------");
	}

	void markIssued(){
		this.isIssued=true;
	}

	void markReturned(){
		this.isIssued=false;
	}
	
}
class Library{
	String  name;
	Book[] books=new Book[15];
	
	int bookCount=0;

	void addBook(Book b){
		books[bookCount++]=b;

	}

	Book findByTitle(String title){
 		//: Returns the Book object or prints "Not found".
 		for(Book book:books){
			if(book!=null)
			{
				if(book.title.equals(title))
					return book;
			}
		}

 		return null;
	}
	Book[] findByAuthor(String author){
		//: Prints all matching books.
		Book[] foundBooksByAuthor=new Book[10];
		int  cnt=0;
		for(Book book:books){
			if(book!=null)
			{
				if(book.author.equals(author))
					foundBooksByAuthor[cnt++]=book;
			}
		}
		return foundBooksByAuthor;
	}
	void issueBook(String title){
		//: Marks the book as issued if it is available.
	}
	void returnBook(String title){

	}
	void  displayAllBooks(){
		for(Book book:books){
			if(book!=null)
			book.displayInfo();
		}

	}
	int countAvailable(){
		return  0;
	}
}
class LibraryTest{
	public static void main(String args[]){

		Library lib=new  Library();
		lib.addBook(new Book("AAAA","xxx","PS123W","ggg1",false));
		lib.addBook(new Book("BBBB","xxx","PS321W","ggg2",false));
		lib.addBook(new Book("CCCC","xxx","PS132W","ggg3",false));
		lib.addBook(new Book("DDDD","xxx","PS213W","ggg4",false));
		lib.addBook(new Book("EEEE","yyy","PS113W","ggg5",false));
		lib.displayAllBooks();

		String findByTitle="CCCC1111";
		Book foundByTitle=lib.findByTitle(findByTitle);
		if(foundByTitle!=null)
		{
			System.out.println("Found book title: "+findByTitle);
			foundByTitle.displayInfo();
		}else{
			System.out.println(findByTitle+" not found");
		}

		String findByAuthor="xxx123";
		Book[] foundByAuthor=new Book[10];
		boolean isfindByAuthor=false;
		foundByAuthor=lib.findByAuthor(findByAuthor);
		System.out.println("Found books Search by Author :"+findByAuthor);
		for(Book book :foundByAuthor){
			if(book!=null){
				book.displayInfo();
				isfindByAuthor=true;
			}
		}
		if(!isfindByAuthor){
			System.out.println("There are no books by : "+findByAuthor);
		}


	}
}