package com.project.frontend;

import java.util.Scanner;

import com.project.Deo.BuyerDeoImpl;
import com.project.Deo.Buyer_Deo;
import com.project.beam.Buyer;

public class auctionApp {

	public static void selectoption() {
		
		Buyer_Deo buyerdao = new BuyerDeoImpl();
		try {
			
			System.out.println("\nPlease Select an option to continue.");
			System.out.println("\n1. User as Admistrator");
			System.out.println("\n2. User as Seller");
			System.out.println("\n3. User as Buyer");
			System.out.println();
			
			Scanner sc = new Scanner(System.in);
			int user  = sc.nextInt(); 
			
			switch(user) {
			
			case 1:
			case 2:
			case 3:
				try {
					while(true) {
						System.out.println();
						System.out.println("\n1. Register himself or herself as Buyer.");
						System.out.println("\n2. Search and view Item by category.");
						System.out.println("\n3. Select and view all the buyers and also thier Items category wise.");
						System.out.println("\n4. Selects Items to buy.");
						System.out.println();
						int option = sc.nextInt();
						
						if(option==1) {
							
							System.out.println("Enter Details of buyer");
							 System.out.println();
							 System.out.print("Enter Buyer Name    - ");
							 String bname = sc.next();
							 
							 System.out.print("Enter Buyer Email   - ");
							 String bemail = sc.next();
							 
							 System.out.print("Enter Buyer Phone   - ");
							 Long bphone = sc.nextLong();
							 
							 System.out.print("Enter Buyer Address - ");
							 String badd = sc.next();
							 
							 Buyer buyer = new Buyer();
							 
							 buyer.setBuyerName(bname);
							 buyer.setBuyerAddress(bemail);
							 buyer.setBuyerPhone(user);
							 buyer.setBuyerAddress(badd);
							 
							 String result = buyerdao.registeredAsBuyer(buyer);
							 System.out.println();
							 System.out.println(result);
							 System.out.println();
							 System.out.println("=============================================================================================");
					
						}
						
					}
				} catch (Exception e) {
					e.printStackTrace();
					auctionApp.selectoption();
				}
			}		
			
		} catch (Exception e) {
			e.printStackTrace();
			auctionApp.selectoption();
		}
		
	}
}
