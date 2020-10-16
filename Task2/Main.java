
package TicketMachine;
import java.util.Scanner;

	public class Main 
	{
	   public static void main(String[] args) 
	   {
	       Scanner input = new Scanner(System.in);

	       System.out.println();
	       
	       System.out.println("\t\t ----- PRESENTING TICKET MACHINE ----- \t\t\n");
	       System.out.println("\t\t       SYEDA DUAA FATIMA BUKHARI \t\t\n");
	       System.out.println("\t\t            01-131182-035 \t\t\n");
	       System.out.println();

	       Ticket obj = new Ticket(50);

	       while (true) 
	       {
	           System.out.print(" Enter Ticekt Amount: ");
	           double amount = input.nextDouble();

	           int response = obj.insertMoney(amount);

	           if (response == -1) 
	           {
	               System.out.println(" Please Enter More " + obj.getRefund() + " Rupees");
	               System.out.println(" You Want to Insert/Leave? Y/n");

	               char choice = input.next().charAt(0);
	 
	               if (choice == 'y' || choice == 'Y')
	               {
	                   continue;
	               } 
	               else if ((choice == 'n' || choice == 'N')) 
	               {
	                   break;
	               }
	               else 
	               {
	                   System.out.println(" Wrong Input ");
	               }

	           } 
	           else if (response == -2) 
	           {
	               System.out.println(" Please keep " + obj.getRefund() + " Rupees");
	               obj.printTicket();
	               break;
	           }
	           else 
	           {
	               System.out.println(" Transaction is Successful");
	               obj.printTicket();
	               break;
	           }
	       }

	       System.out.println(" Good Bye ");
	       input.close();
	   }
	}

