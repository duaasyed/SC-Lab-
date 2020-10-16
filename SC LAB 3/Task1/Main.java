package LibraryManagmentSystem;
import java.util.Scanner;

public class Main 
{	
	static void addBooks(Scanner SC, BookRecord [] obj )
	{
		String name, author;
		int num;
		boolean available;
		
		for(int i=0; i < 3; i++)
		{
			System.out.println(" \n Add Book Record " + (i + 1));
			System.out.print(" Enter Book Name: ");
			name =  SC.next();
			
			System.out.print(" Enter Book Number: ");
			num = Integer.parseInt(SC.next());
			
			System.out.print(" Enter Book Author: ");
			author = SC.next();
			
			System.out.print(" Is Avaliable? (false/true): ");
			available = Boolean.parseBoolean(SC.next());
			
			 obj[i].setName(name);
			 obj[i].setNumber(num);
			 obj[i].setAuthor(author);
			 obj[i].setAvailable(available);
						 
		}
	}
	
	static void viewBooks(BookRecord[] obj)
	{
		System.out.println("\n\t\tList Of Available Books\t\t\n");
		for(int i=0;i<3;i++)
		{
			 if(obj[i].isAvailable())
			 {
				 System.out.println(obj[i].getName());
			 }
		}
	}
	
	private static boolean issueBook(BookRecord[] book, LibraryCustomer customer, Scanner sc) 
	{
		// TODO Auto-generated method stub
		String id,author;
		int number;
		
		System.out.print(" ID: ");
		id = sc.next();
		System.out.print(" Book Number: ");
		number = sc.nextInt();
		customer.setId(id);
		for (int i = 0; i < 3; i++) 
		{
			if (book[i].isAvailable() && book[i].getNumber()==number) 
			{
				book[i].setAvailable(false);
				customer.setIssue(book[i]);
				return true;
			}
		}
		return false;
	}

	private static boolean returnBook(BookRecord[] book, LibraryCustomer person, Scanner sc)
	{
		// TODO Auto-generated method stub
		String id;
		int number;
		System.out.print(" Customer ID: ");
		id = sc.next();
		System.out.print(" Book Number: ");
		number = sc.nextInt();
		
		if (person.getId().contains(id) && person.getIssuedBook().getNumber()==number)
		{
			//person.setBook(null);// remove book from person record
			for (int i = 0; i < book.length; i++) 
			{
				if (book[i].getNumber()==number) 
				{
					book[i].setAvailable(true); 
					return true;
				}
			}
		}
		return false;

	}

	private static void printIssued(BookRecord[] book) 
	{
		// TODO Auto-generated method stub
		System.out.println("Issued Books");
		for (int i = 0; i < book.length; i++) 
		{
			if (!book[i].isAvailable()) 
			{
				System.out.println(book[i].getName());
			}

		}

	}

	private static void printAvailable(BookRecord[] book)
	{
		// TODO Auto-generated method stub
		System.out.println("Avaliable Books");
		for (int i = 0; i < book.length; i++) 
		{
			if (book[i].isAvailable()) 
			{
				System.out.println(book[i].getName());
			}

		}

	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner SC = new Scanner(System.in);
		BookRecord[] obj = new BookRecord[3];
		LibraryCustomer person=new LibraryCustomer();
		
		for(int i=0;i<3;i++)
		{
			obj[i]=new BookRecord();
		}
		
		int exit=1;
		while(exit!=0)
		{
			System.out.println(" \n\t\t -------- LIBRARY MANAGEMENT SYSTEM -------- \t\t\n ");
			System.out.println(" \t\t            SYEDA DUAA FATIMA BUKHARI  \t\t\n ");
			System.out.println(" \t\t                 01-131182-035 \t\t\n ");
			System.out.println(" Press (1) to Add Books ");
			System.out.println(" Press (2) to Issue Books Which are avaliable. ");
			System.out.println(" Press (3) to Return Book ");
			System.out.println(" Press (4) to Display Available Books List: ");
			System.out.println(" Press (5) to Display Issued Books List: ");
			int ch=Integer.parseInt(SC.next());
			
			if(ch==1)
			{
				addBooks(SC,obj);
			}
			
			else if (ch == 2)
			{
				if (issueBook(obj, person, SC)) 
				{
					System.out.print("Book " + person.getIssuedBook().getName() + " is Issued to "
							+ person.getId());
				} else {
					System.out.print("Book not available");
				}
			} 
			
			else if (ch == 3) 
			{
				if (returnBook(obj, person, SC))
				{
					System.out.print("Book Returned by " + person.getId() + " to Library");
				} else {
					System.out.print(" Error!!");
				}

			} 
			
			else if (ch == 4) 
			{
				printAvailable(obj);
			} 
			
			else if (ch == 5) 
			{
				printIssued(obj);
			}
			
			System.out.print("\n(Press 0 to exit/1 to continue...): ");
			exit = Integer.parseInt(SC.next());
		}

	}
		

}

