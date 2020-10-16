
package TicketMachine;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Ticket
{
   private double price;
   private double total;
   private double refund;
   private double reEnter;

   public Ticket(double price) 
   {
       this.price = price;
       total = 0;
       refund = 0;
       reEnter = 0;
   }

   public double getPrice() 
   {
       return price;
   }

   public int insertMoney(double amount)
   {
       if (amount < price) 
       {
           reEnter = price - amount;
           return -1;
       } 
       
       else if (amount > price) 
       {
           reEnter = 0;
           refund = amount - price;
           return -2;
       }
       else 
       {
           return -3;
       }
   }

   public void printTicket() 
   {

       DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
       LocalDateTime now = LocalDateTime.now();

       if (reEnter == 0) 
       {
           System.out.println();
           System.out.println(" Ticket: ");
           System.out.println(" Price: " + price + " Rs.");
           System.out.println(" Date: " + dtf.format(now));
           System.out.println();
       } 
       
       else 
       {
           System.out.println();
           System.out.println(" No Ticket");
           System.out.println();
       }

   }

   public double getRefund() 
   {
       return refund;
   }

   public double getReEnter() 
   {
       return reEnter;
   }

}
