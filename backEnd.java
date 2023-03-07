package cceProject;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class backEnd {
	first firs = new first();
	//objects
	public static Scanner sc = new Scanner(System.in);
	public static DecimalFormat f = new DecimalFormat ("#,###.00");
	static LocalDate Date = LocalDate.now();
	static LocalTime Time =LocalTime.now();
	
	//body 
	static int quantity;
	static float payment = 0;
	static float change;
	static float bill;
	static float addpayment = 0;
	static float payment2 = 0;
	static float pay = 0;
	
	//menuList for coffee
	static int americano = 149;
	static int espresso = 175;
	static int cappucino = 180;
	static int vanillaLatte =190;
	static int cafeLatte = 200;
	static int doppio = 190;
	static int espressoConPanna = 230;
	static int caramelMacchiato = 220;
	static int affogato = 240;
	static int frapuccino = 250;
	
	//Adds-On
	static int sugar = 10;
	static int honey = 30;
	static int milk = 20; // 20 per cup
	
	//Dessert
	static int baguette = 88;
	static int cheeseCake = 123; // per slice
	static int brownies = 98;
	static int wholeWheatChocolateCake = 128; // per slice
	static int chocolateChipCookies = 89;
	static int donuts = 50; 
	static int churros = 30; // per piece
	static ArrayList<String> orderNa= new ArrayList<>();
	
	static void inventory(String order)
	{
		orderNa.add(order);
		System.out.println(orderNa);
	}
		public static void main(String[] args) {
			//main 
			input();
			menu();
			
	        }
		
				public static void input()
				{
					//Selecting if the user wants to order or not
					try
					{
					System.out.println("\t\t\tEl Cafe es Amor");
					System.out.print("Do you want to order? [Y][N]");
					char a = sc.next().charAt(0);
					switch (a)
					{
					case 'Y':
					case 'y':
						System.out.println("\t\t\tWelcome to El Cafe es amor");
						//wish to view the menu 
						break;
					case 'N':
					case 'n': 
						System.err.println("Thank you come Again!");
						System.exit(0);
						break;
						default: 
							System.err.println("Thank you!");
							System.exit(0);
					}
					}catch(Exception e)
					{
						System.err.print("WRONG INPUT! TRY AGAIN");
					}
				}
					
					//Menu List 
					public static void menu()
					{
					try
					{
						ArrayList cof = new ArrayList();
					
					cof.add(" Americano- 149");
					cof.add(" Espresso- 175");
					cof.add(" Cappucinno- 180");
					cof.add(" Vanilla Latte- 190");
					cof.add(" Cafe Latte- 200");
					cof.add(" Doppio- 190");
					cof.add(" Espresso Con Panna- 230");
					cof.add(" Caramel Macchiato- 220");
					cof.add(" Affogato- 240");
					cof.add(" Frapuccino- 250");
					
						System.out.println("\t\t======================Menu===================");
						System.out.println("\t\t=====================Add-On==================");
						System.out.println("\t\t[0] Sugar\n\t\t[1] Honey \n\t\t[2] Milk");
						System.out.println("\t\t=====================Coffee==================");
						int c=0;
						System.out.println("\t\t[0] Next");
						for (int a=0; a<cof.size();a++)
						{
							c++;
							System.out.println("\t\t["+c+"]" + cof.get(a));

						}
						int coffee = sc.nextInt();
						// switch gamiton then butang ang mga methods 
						switch (coffee)
						{
						//choices ni sa coffee
						
						case 1: Americano(coffee); inventory("Americano"); break;
						case 2: Espresso(coffee); break;
						case 3:Cappucino(coffee);break;
						case 4: Vanilla(coffee);break;
						case 5: Cafe(coffee); break;
						case 6: Doppio(coffee); break;
						case 7: Espres(coffee); break;
						case 8: Caramel(coffee); break;
						case 9: Affog(coffee); break;
						case 10: Frap(coffee); break;
						
						}
						ArrayList des = new ArrayList();
						des.add(" Baguette- 88");
						des.add(" Cheese Cake- 123");
						des.add(" Brownies- 98");
						des.add(" Whole Wheat Chocolate Cake- 128");
						des.add(" Chocolate Chip Cookies- 89");
						des.add(" Donuts- 50");
						des.add(" Churros- 30");
						System.out.println("====================================================================");
						System.out.println("\t\t======================Desserts==================");
						int d=0;
						System.out.println("\t\t[0] Next");
						for (int b=0;b<des.size();b++)
						{
							d+=1;
							System.out.println("\t\t[" + d+"]" +des.get(b));
						}
						int dess = sc.nextInt();
						switch(dess)
						{
						case 1: baguet(dess);break;
						case 2: cCake(dess);break;
						case 3: brown(dess);break;
						case 4: wwChocLate(dess); break;
						case 5: ccCake(dess); break;
						case 6: donu(dess);break;
						case 7: choru(dess);break;
						
						}
						
						
						System.out.println("====================================================================");
					}catch(Exception e)
					{
						System.out.println("INPUT MISMATCH! TRY AGAIN!");
					}
						
					}
						
						public static void addMore()
							{
							// ask the user if he/she want to add more
							 System.out.println("Would you like to add more?");
							  char add = sc.next().charAt(0);
							  
							  switch (add)
							  {
							  case 'Y':
							  case 'y':
								  	menu();
								  	break;
							  case 'N':
							  case 'n':
								  	pay();
								  break;
							  
								  default: 
									  System.err.println("ERROR! TRY AGAIN!");
									  System.exit(0);
							  }
								
							}
								
								//menu for coffee
							static void Americano(int coffee)
							{
								System.out.println("How much do you want for Americano: ");
								quantity = sc.nextInt();
								pay = (int)(quantity* americano);
								System.out.println("You've purchase " + quantity + " Americano/s with a total of " + f.format(pay) + "!");
								bill = (bill + pay);
								addOn();
								addMore();
								menu();
							}
							static void Espresso(int coffee)
							{
								System.out.println("How much do you want for Espresso: ");
								quantity = sc.nextInt();
								pay = (int)(quantity* espresso);
								System.out.println("You've purchase " + quantity + " Espresso/s with a total of " + f.format(pay) + "!");
								bill = (bill + pay);
								addOn();
								addMore();
								menu();
							}
							static void Cappucino(int coffee)
							{
								System.out.println("How much do you want for Cappucino ");
								quantity = sc.nextInt();
								pay = (int)(quantity* cappucino);
								System.out.println("You've purchase " + quantity + " Cappucino/s with a total of " + f.format(pay) + "!");
								bill = (bill + pay);
								addOn();
								addMore();
								menu();
							}
							static void Vanilla(int coffee)
							{
								System.out.println("How much do you want for Vanilla Latte");
								quantity = sc.nextInt();
								pay = (int)(quantity* vanillaLatte);
								System.out.println("You've purchase " + quantity + " Vanilla Latte/s with a total of " + f.format(pay) + "!");
								bill = (bill + pay);
								addOn();
								addMore();
								menu();
							}
							static void Cafe(int coffee)
							{
								System.out.println("How much do you want for Cafe Latte ");
								quantity = sc.nextInt();
								pay = (int)(quantity* cafeLatte);
								System.out.println("You've purchase " + quantity + " Cafe Latte/s with a total of " + f.format(pay) + "!");
								bill = (bill + pay);
								addOn();
								addMore();
								menu();
							}
							static void Doppio(int coffee)
							{
								System.out.println("How much do you want for Doppio ");
								quantity = sc.nextInt();
								pay = (int)(quantity* doppio);
								System.out.println("You've purchase " + quantity + " Doppio/s with a total of " + f.format(pay) + "!");
								bill = (bill + pay);
								addOn();
								addMore();
								menu();
							}
							static void Espres(int coffee)
							{
								System.out.println("How much do you want for Espresso Con Panna ");
								quantity = sc.nextInt();
								pay = (int)(quantity* espressoConPanna);
								System.out.println("You've purchase " + quantity + " Espresso Con Panna/s with a total of " + f.format(pay) + "!");
								bill = (bill + pay);
								addOn();
								addMore();
								menu();
							}
							static void Caramel(int coffee)
							{
								System.out.println("How much do you want for Caramel Macchiato");
								quantity = sc.nextInt();
								pay = (int)(quantity* caramelMacchiato);
								System.out.println("You've purchase " + quantity + " Caramel Macchiato/s with a total of " + f.format(pay) + "!");
								bill = (bill + pay);
								addOn();
								addMore();
								menu();
							}
							static void Affog(int coffee)
							{
								System.out.println("How much do you want for Affogato ");
								quantity = sc.nextInt();
								pay = (int)(quantity* affogato);
								System.out.println("You've purchase " + quantity + " Affogato/s with a total of " + f.format(pay) + "!");
								bill = (bill + pay);
								addOn();
								addMore();
								menu();
							}
							static void Frap(int coffee)
							{
								System.out.println("How much do you want for Frapuccino ");
								quantity = sc.nextInt();
								pay = (int)(quantity* frapuccino);
								System.out.println("You've purchase " + quantity + " Frapuccino/s with a total of " + f.format(pay) + "!");
								bill = (bill + pay);
								addOn();
								addMore();
								menu();
							}
							
							static void addOn()
							{
								int s;
								System.out.println("\nDo you want to add on to your drink?[y][n]");
								char a = sc.next().charAt(0);
								switch(a)
								{
								case 'Y':
								case 'y':
									System.out.println("Add-on \n[0] Sugar-10 \n[1] Honey-30 \n[2] Milk- 20");
								int add = sc.nextInt();
								if (add == 0)
								{
									System.out.println("How many do you want for sugar: ");
									quantity = sc.nextInt();
									s = (int) (quantity * sugar);
									bill = bill+s;
									System.out.println("You've add on sugar to your drink, total of " +f.format(bill));
								}
								else if(add == 1)
								{
									System.out.println("How many do you want for honey: ");
									quantity = sc.nextInt();
									s = (int) (quantity* honey);
									bill = bill+s;
									System.out.println("You've add on honey to your drink, total of " + f.format(bill));
								}
								else if(add == 2)
								{
									System.out.println("How many do you want for milk: ");
									quantity = sc.nextInt();
									s= (int) (quantity* milk);
									bill = bill+s;
									System.out.println("You've add on milk to your drink, total of " + f.format(bill));
								}
								else 
								{
									System.out.println("NOT AVAILABLE!");
								}
								}
								
							}
							//menu for dessert
							static void baguet(int dess)
							{
								System.out.println("How much do you want for Baguette ");
								quantity = sc.nextInt();
								pay = (int)(quantity* baguette);
								System.out.println("You've purchase " + quantity + " Baguette/s with a total of " + f.format(pay) + "!");
								bill = (bill + pay);
								addMore();
								menu();
							}
							static void cCake(int dess)

							{
								System.out.println("How much do you want for Cheese Cake ");
								quantity = sc.nextInt();
								pay = (int)(quantity* cheeseCake);
								System.out.println("You've purchase " + quantity + " Cheese Cake/s with a total of " + f.format(pay) + "!");
								bill = (bill + pay);
								addMore();
								menu();
							}
							static void brown(int dess)
							{
								System.out.println("How much do you want for Brownies ");
								quantity = sc.nextInt();
								pay = (int)(quantity* brownies);
								System.out.println("You've purchase " + quantity + " Brownies with a total of " + f.format(pay) + "!");
								bill = (bill + pay);
								addMore();
								menu();
							}
							static void wwChocLate(int dess)
							{
								System.out.println("How much do you want for Whole Wheat Chocolate Cake ");
								quantity = sc.nextInt();
								pay = (int)(quantity* wholeWheatChocolateCake);
								System.out.println("You've purchase " + quantity + " Whole Wheat Chocolate Cake/s with a total of " + f.format(pay) + "!");
								bill = (bill + pay);
								addMore();
								menu();
							}
							static void ccCake(int dess)
							{
								System.out.println("How much do you want for Chocolate Chip Cookies");
								quantity = sc.nextInt();
								pay = (int)(quantity* chocolateChipCookies);
								System.out.println("You've purchase " + quantity + "  Chocolate Chip Cookies with a total of " + f.format(pay) + "!");
								bill = (bill + pay);
								addMore();
								menu();
							}
							static void donu (int dess)
							{
								System.out.println("How much do you want for Donuts");
								quantity = sc.nextInt();
								pay = (int)(quantity* donuts);
								System.out.println("You've purchase " + quantity + "  Donuts with a total of " + f.format(pay) + "!");
								bill = (bill + pay);
								addMore();
								menu();
							}
							static void choru(int dess)
							{
								
								System.out.println("How much do you want for Churros");
								quantity = sc.nextInt();
								pay = (int)(quantity* churros);
								System.out.println("You've purchase " + quantity + "  Churros with a total of " + f.format(pay) + "!");
								bill = (bill + pay);
								addMore();
								menu();
							}
				 
							static void pay()
							{
							
								String na; 
								System.out.print("Name: ");
								sc.nextLine();
								na =  sc.nextLine();
								
								change = payment-bill;
								System.out.println();
								System.out.println("TOTAL BILL: " + bill);
								System.out.print("PAYMENT: ");
								payment = sc.nextFloat();
								
								payment2 = payment + addpayment;
								change = payment2 - bill;
								change = payment - bill;
								if(payment >= bill) 
								{
									
									String t= "\t\t\t\tEl Cafe es amor "
											+ "\n\t\t"+Date+"\t\t"+Time+
											"\n\t\t_________________________________________"+
											"\n\t\tDine In"+
											"\n\t\t_________________________________________"+
											"\n\t\tName: " + na.toUpperCase()+ 
											"\n\t\tCoffee \t\t Price \t\tQuantity" +
											"\n\t\t\t\t\t\t    "+
											"\n\t\t_________________________________________"+
											"\n\t\tTotal Bill.................. " + f.format(bill)+
											"\n\t\tPayment..................... " + f.format(payment)
											+"\n\t\t_________________________________________"
											+"\n\t\tChange...................... " + f.format(change)
											+"\n\t\t[THANK YOU FOR DRINKING WITH ME]";
									
									for (int i = 0; i < t.length(); i++) 
									{
										long start = System.currentTimeMillis();
										while (System.currentTimeMillis() - start < 20) {
										}
										System.out.print(t.charAt(i));
										}System.exit(0);
									}
									else if (payment < bill)
									{
										payment2 = payment + addpayment;
											do
											{
											System.out.println("\n >> Sorry! Insufficient Amount! <<");
											System.out.println(" >> You need " + f.format(bill - payment) + " more. <<");
											System.out.print("\n > Please Enter Additional Amount: $");
											addpayment = sc.nextFloat();
											payment2 = payment + addpayment;
											}while(payment2 < bill);
									}
								
									payment2 = payment + addpayment;
									change = payment2 - bill;
											if(payment2 >= bill) 
											{
												
												String t= "\t\t\t\tEl Cafe es amor "
														+ "\n\t\t"+Date+"\t\t"+Time+
														"\n\t\t_________________________________________"+
														"\n\t\tDine In"+
														"\n\t\t_________________________________________"+
														"\n\t\tName: " + na.toUpperCase()+ 
														"\n\t\tCoffee \t\t Price \t\tQuantity" +
														"\n\t\t\t\t\t\t    "+
														"\n\t\t_________________________________________"+
														"\n\t\tTotal Bill.................. " + f.format(bill)+
														"\n\t\tPayment..................... " + f.format(payment)
														+"\n\t\t_________________________________________"
														+"\n\t\tChange...................... " + f.format(change)
														+"\n\t\t[THANK YOU FOR DRINKING WITH ME]";
												
												for (int i = 0; i < t.length(); i++) {
													long start = System.currentTimeMillis();
													while (System.currentTimeMillis() - start < 20) {
													}
													System.out.print(t.charAt(i));
													}System.exit(0);
											}
									

							}


}

