package LibraryManagmentSystem;
public class BookRecord
{
    private String name;
    private int number;
    private boolean available;
    private String author;
    
    BookRecord()
    {
    	name  = " ";
    	number = 0;
    	author = " ";
    }
    
    BookRecord(int number)
    {
    	this.number = number;
    }
    
    public String getName()
    {
    	return name;
    }
    
    public void setName(String bName)
    {
    	this.name= bName;
    }
    
    public int getNumber()
    {
    	return number;
    }
    
    public void setNumber(int bNum)
    {
    	this.number = bNum;
    }
    
    public String getAuthor()
    {
    	return author;
    }
    
    public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available)
	{
		this.available = available;
	}

	public void setAuthor(String bAuthor)
    {
    	this.author = bAuthor;
    }
    
    public void checkAvailability()
    {
    	if(available == true)
    	{
    		System.out.println("Book is Available");
    	}
    	else
    	{
    		System.out.println("Book is not Available");
    	}
    		
    }
}
