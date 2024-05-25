import java.util.Arrays;

public class BookService {
	
	
	public BookService() {};
	
	public Book[] filterBooksByAuthor(Author author, Book[] books) {
		
		// Check book or author == null
		if (books == null || author == null ) {
			return new Book[0];
		}

		Book[] filteredBooks = Arrays.stream(books)
				.filter(book -> book.hasAuthor(author)).toArray(Book[]::new); 		
		
		return filteredBooks;
	}

	
	public Book[] filterBooksByPublisher(Publisher publisher, Book[] books) {
		
		// Check book == null
		if (books == null || publisher == null ) {
			return new Book[0];	}
			
		
			Book[] filteredBooks = Arrays.stream(books)
					.filter(book -> book.getPublisher() == publisher).toArray(Book[]::new);
			
			
	
		return filteredBooks;
	}

	
	public Book[] filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] books) {
		
		return Arrays.stream(books).filter(book -> book.getPublishingYear() == yearFromInclusively).toArray(Book[]::new);
		
		
	}



	//ALL METHODS SHOULD USE STREAM API

}
