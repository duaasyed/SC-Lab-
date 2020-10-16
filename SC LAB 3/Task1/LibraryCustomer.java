package LibraryManagmentSystem;
public class LibraryCustomer
{
	private String id;
	private BookRecord book;
	
	LibraryCustomer()
	{
		id = " ";
		this.book = new BookRecord();
	}
	
	LibraryCustomer(String id, BookRecord book)
	{
		this.id= id;
		this.book = book;
	}
	 
   public String getId()
   {
	   return id;
   }
   
   public void setId(String customerId)
   {
	   this.id = customerId;
   }
   
   public BookRecord getIssuedBook()
   {
		return book;
   }

	public void setIssue(BookRecord issuedBook)
	{
		this.book = issuedBook;
	}
   
}
