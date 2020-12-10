package finalcalc;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
	
		
			
				System.out.println("CS1701/CS1803: Formative Task");
				System.out.println("We certify that this assignment is our own work based on our studies and research. We also certify that the work we submit has not been plagarised in any way shape or form.");
				
				Scanner first = new Scanner( System.in );
				System.out.println("Please press Y to continue.");
			    System.out.println();
			    	String y = first.nextLine();
			    	
			    	switch (y) 
					{
				    	case "y":
							menu();
							break;
			        }
		}
		
		
				public static void menu() {
					
				System.out.println("Assignment 0: Formative Task");
				System.out.println("");
					
				
				System.out.println("1: Addition, subtraction, multiplication and division of two numbers");
				System.out.println("2: Power, modulo, and square/cube roots");
				System.out.println("3: Conversions between temperature units (Celsius/Fahrenheit)");
				System.out.println("4: Conversions between Metric and Imperial units for mass (g/oz) and length (cm/inches)");
				System.out.println("5: Conversion of a decimal number to binary");
				System.out.println("6: Conversion of a binary number to decimal");
				System.out.println("7: Conversion of a decimal number to hexadecimal");
				System.out.println("8: Conversion of a hexadecimal number to decimal");
						
				
					Scanner menu1 = new Scanner( System.in );
					System.out.println("");
				    System.out.print("Please select which function you would like to use:");
				    
			    	int menuc = menu1.nextInt();
					    	
					    	switch (menuc) 
					    	{
					    		case 1:
					    			System.out.println("");
					    			task1();
					    			break;
					    	
					    		case 2:
					    			System.out.println("");
					    			task2();
					    			break;
					    				
					    		case 3:
					    			System.out.println("");
					    			task3();
					    			break;
					    			
					    		case 4:
					    			System.out.println("");
									task4();
								    break;
					    		  
					    		case 5:
					    			System.out.println("");
									task5();
								    break;						//used switch case instead of if statement as it is much easier
								    							// after each case, it'll go to desired task   
					    		case 6:
					    			System.out.println("");
									task6();
								    break;
								   
					    		case 7:
					    			System.out.println("");
									task7();
								    break;						
								    
					    		case 8:
					    			System.out.println("");
					    			task8();
					    			break;					
					    	}				
										}
			
					
				public static void task1() { // Gabriel's task
					
						System.out.println("1: Addition, subtraction and division of two numbers");
				
						// Declaring variables
						double num1, num2, answer = 0;
						String operator, z;
						
						// Created scanner to allow for input in the console
						Scanner input = new Scanner(System.in);
						// User requested to input their first number
						System.out.print("Enter your first number: ");
						num1 = input.nextDouble();
						// User requested to input their desired operator
						System.out.print("Enter your operator (+, -, *, /): ");
						// Now allows user to input from keyboard
						operator = input.next();
						
						// Switch statement looks for operator inputted by user to carry out appropriate method
						switch (operator)
						{
						   case "+":
						   {
							   // User requested to input second number - (Same process for other cases)
							   System.out.println("Enter your second number: ");
							   num2 = input.nextDouble();
							   // Answer is calculated and stored in the variable 'answer'
							   answer = num1 + num2;
							   break;
						   }
						   
						   case "-":
						   {
							   System.out.println("Enter your second number: ");
							   num2 = input.nextDouble();
							   answer = num1 - num2;
							   break;
						   }
						   
						   case "*":
						   {
							   System.out.println("Enter your second number: ");
							   num2 = input.nextDouble();
							   answer = num1 * num2;
							   break;
						   }

						   case "/":
						   {
							   System.out.println("Enter your second number: ");
							   num2 = input.nextDouble();
							   answer = num1 / num2;
							   break;
						   }
						}
						
						// Displays the answer
						System.out.println("Answer: " + answer);
						
						Scanner final1 = new Scanner ( System.in );
						System.out.println("Would you like to convert another number? If yes, type yes. If no, type no to go back to the main menu. Otherwise if you would like to exit the program, please type exit.");
						String final1c = final1.nextLine();
						    
						
					    switch (final1c) 
					    {
						    case "yes":
							      task1(); //will run the operation again
							      break;
							    
						    	
						    case "no":
								  menu(); //will call the menu
								  break;
								    
							    
							 case "exit":
							   	   System.out.println("Thank you for using the calculator. You may now close the console.");
								   System.exit(0); //will terminate the program
								   break;
					    }
			}
						
						
				public static void task2() { // Olivia's task
					
						System.out.println("2: Power, modulo, and square/cube roots");
						
						System.out.println("Calculate modulo, square root, or square? Please enter a valid number:");
				        System.out.println("1. Modulo");
				        System.out.println("2. Square root");
				        System.out.println("3. Square");
				        System.out.println("4. Go back");
				        
				        Scanner INPUT = new Scanner( System.in );
				       
				        int INPUTINT = INPUT.nextInt();
				        
				        switch (INPUTINT) {
				        
				        case 1:
				        { 
				            System.out.println("Modulo is the remainder of a division. Input an integer to divide:");
				            Integer DIVISION = INPUT.nextInt();
				            
				            if (DIVISION instanceof Integer == true)
				            {
				                	System.out.println("Input a divisor integer:");
				                	int DIVISOR = INPUT.nextInt();
				                	int REM = DIVISION % DIVISOR;
				                	System.out.println(DIVISION + " % " + DIVISOR + " = " + REM);
				            }  
				        break;
				        }
				        
				        
				        case 2:
				        {    
				            System.out.println("Input a positive number to find the square root:");
				            String SQUARESTRING = INPUT.next();
				            Double SQUARE = null;
				            
				            try {
				                SQUARE = Double.parseDouble(SQUARESTRING);
				                
				            } catch (Exception e) {
				                System.out.println("Invalid input.");
				           
				            }
				            
				            if (SQUARE < 0)
				                System.out.println("Invalid input.");
				             
				                
				            Double SQUAREROOT = null;
				            SQUAREROOT = Math.sqrt(SQUARE);
				            System.out.println("The square root of " + SQUARE + " is " + SQUAREROOT);
				          break;
				             }
				        
				        
				        
				        case 3:
				        {    
				        	System.out.println("Input a number number to find the square:");
				            String SQUARERTSTRING = INPUT.next();
				            Double SQUARERT = null;
				            
				            try {
				                SQUARERT = Double.parseDouble(SQUARERTSTRING);
				                
				            } catch (Exception e) {
				                System.out.println("Invalid input.");

				            }
				            
				            Double SQR = SQUARERT * SQUARERT;
				            System.out.println(SQUARERT + "^2 is " + SQR);
				            break;
				        }   
				        
				        case 4:
				        {   
				            menu(); 
				            break;
				        }   

				        }
				        
				        Scanner final2 = new Scanner ( System.in );
						System.out.println("Would you like to convert another number? If yes, type yes. If no, type no to go back to the main menu. Otherwise if you would like to exit the program, please type exit.");
						String final2c = final2.nextLine();
						
					    switch (final2c) 
					    {
						    case "yes":
							      task2(); //will run the operation again
							      break;
							    
						    	
						    case "no":
								  menu(); //will call the menu
								  break;
								    
							    
							 case "exit":
							   	   System.out.println("Thank you for using the calculator. You may now close the console.");
								   System.exit(0); //will terminate the program
								   break;
					    }
				        
				        
				        }
				

				
				public static void task3() { //Gabriel's task
						System.out.println("3: Conversions between temperature units (Celsius/Fahrenheit");
						
						// Declaring variables
						double celsius, fahrenheit, answer = 0;
						int temp;
						String z;
						
						// Ask user if they want to convert from °C to °F (or vice versa)
						System.out.println("Enter 1 to convert from Celsius to Fahrenheit");
						System.out.println("Enter 2 to convert from Fahrenheit to Celsius");
						// Created scanner to allow for input in the console
						Scanner input = new Scanner(System.in);
						// Now allows user to input from keyboard
						temp = input.nextInt();
						
						// Switch statement looks for user input '1' or '2' to carry out appropriate method
						switch (temp)
						{
						   case 1:
						   {
							   // User requested to input their value - (Same process for other case)
							   System.out.println("Enter Celsius value: ");
							   celsius = input.nextDouble();
							   // Answer is calculated and stored in the variable 'answer'
							   answer = (celsius * 9/5) + 32;
							   break;
						   }
						   
						   case 2:
						   {
							   System.out.println("Enter Fahrenheit value: ");
							   fahrenheit = input.nextDouble();
							   answer = (fahrenheit - 32) * 5/9;
							   break;
						   }
						}
						
						// Displays the answer
						System.out.println("Answer: " + answer);
						
						
						Scanner final3 = new Scanner ( System.in );
						System.out.println("Would you like to convert another number? If yes, type yes. If no, type no to go back to the main menu. Otherwise if you would like to exit the program, please type exit.");
						String final3c = final3.nextLine();
						
					    switch (final3c) 
					    {
						    case "yes":
							      task3(); //will run the operation again
							      break;
							    
						    	
						    case "no":
								  menu(); //will call the menu
								  break;
								    
							    
							 case "exit":
							   	   System.out.println("Thank you for using the calculator. You may now close the console.");
								   System.exit(0); //will terminate the program
								   break;
					    }
			}
				
				
				public static void task4() { //Ahelal's task
					System.out.println("4: Conversions between Metric and Imperial units for mass (g/oz) and length (cm/inches)");
					
					Scanner task4m = new Scanner( System.in );
				    System.out.print("Please select which conversion you would like to use:");
				    System.out.println();
				    
				    System.out.println("1) Centimetres to Inches");
				    System.out.println("2) Inches to Centimetres");
				    System.out.println("3) Grams to Ounces");
				    System.out.println("4) Ounces to Grams");
				    
				    int task4c = task4m.nextInt();
				    
				    switch (task4c) 
				    {
					    case 1:
					    {
					    	System.out.println("1) Centimetres to Inches");
					    	
					    	//Variables
					    	Double Centimeters;
					    	Double Inches;
					    	
					    	//scanner object 
					    	Scanner input1 = new Scanner(System.in);
					    	
					    	//input from the user
					    	System.out.println("Enter the value of Centimeters:");
					    	Centimeters = (Double) input1.nextDouble();
					    	
					    	//One centimeter is equal to 0.39 inches
					    	Inches = Centimeters / 2.54;
					    	
					    	//Result needs to be displayed to the user
					    	System.out.println(Centimeters + " is " + Inches + "inches");
					    	break;
					    }		 
					    	
					    	
					    case 2:
					    {
					    	System.out.println("2) Inches to Centimetres");
					    	//Variables
					    	Double Centimeters;
					    	Double Inches;
					    		
					    	//scanner object
					    	Scanner input2 = new Scanner(System.in);
					    			
					    	//input from the user
					    	System.out.println("Enter the value of inches");
					    	Inches = (Double) input2.nextDouble();
					    			
					    	//One inches is equal to 2.54cm
					    	Centimeters = Inches * 2.54;
					    			
					    	//Result needs to be displayed to the user
					   		System.out.println(Inches + " is " + Centimeters + "cm");
					     	break;
					    }	
					     	
					     	
					    case 3:
					    {
					    	System.out.println("3) Grams to ounces");
					    	
					    	//Variables
					    	Double Gram;
					    	Double Ounce;
					    	
					    	//Scanner object 
					    	Scanner input3 = new Scanner(System.in);
					    	
					    	//Input from the user
					    	System.out.println("Enter the value of Gram:");
					    	Gram = (Double) input3.nextDouble();
					    	
					    	//One gram is equal to 0.035
					    	Ounce = Gram / 28.35;
					    	
					    	//Result must be displayed to the user
					    	System.out.println(Gram + " is " + Ounce + " oz ");	
					    	break;
					    }	
					    	
					    case 4:
					    {
					    	System.out.println("4) Ounces to grams");
					    	//Variables
					    	Double Gram;
					    	Double Ounce;
					    	
					    	
					    	
					    	//Scanner object 
					    	Scanner input4 = new Scanner(System.in);
					    	
					    	//input from the user
					    	System.out.println("Enter the value of Ounce:");
					    	Ounce = (Double) input4.nextDouble();
					    	
					    	//One ounce is equal to 28.3
					    	Gram = Ounce * 28.35;
					    	
					    	//Result will be displayed to the user 
					    	System.out.println(Ounce + " is " + Gram + "gram");
					    	break;
					    }	
					    	
						    }
				    
				    Scanner final4 = new Scanner ( System.in );
					System.out.println("Would you like to convert another number? If yes, type yes. If no, type no to go back to the main menu. Otherwise if you would like to exit the program, please type exit.");
					String final4c = final4.nextLine();
					    
					
				    switch (final4c)
						    
				    {	
				    	case "yes":
				    		 task4(); //will run the operation again
				    		 break;	
					      
					      
					    case "no":
							  menu(); //will call the menu
							  break;
							    
						    
						 case "exit":
						   	   System.out.println("Thank you for using the calculator. You may now close the console.");
							   System.exit(0); //will terminate the program
							   break;
							   
						    
					    }		
				}

					
				public static void task5() { //Jaskirat's task
					
						System.out.println("5: Conversion of a decimal number to binary");
						
						  int number,i=0;
					        int binary []= new int [100];
					        Scanner user_input=new Scanner(System.in); // Created scanner to allow for input in the console
					        System.out.print("Enter decimal number :"); //Taking input from the user
					        number=user_input.nextInt();
					        
					        while(number!=0) // only does it when the value inputed is greater than 0. once it reaches 0, it'll stop
					        {
					            binary[i]=number%2;
					            number=number/2;
					            i++;
					        }
					        
					        System.out.print("Binary value is : "); //will display the result
					        for(int j=i-1;j>=0;j--)
					        {
					            System.out.print(""+binary[j]);
					        }
					        
						System.out.println("");
						System.out.println("");
						
							Scanner final5 = new Scanner ( System.in );
							System.out.println("Would you like to convert another number? If yes, type yes. If no, type no to go back to the main menu. Otherwise if you would like to exit the program, please type exit.");
							String final5c = final5.nextLine();
							    
							
						    switch (final5c) 
						    {
							    case "yes":
								      task5(); //will run the operation again
								      break;
								    
							    	
							    case "no":
									  menu(); //will call the menu
									  break;
									    
								    
								 case "exit":
								   	   System.out.println("Thank you for using the calculator. You may now close the console.");
									   System.exit(0); //will terminate the program
									   break;
						    }
				
				}
				
				
				public static void task6() { //Ahmed's task
						System.out.println("6: Conversion of a binary number to decimal");
						int binaryNumber,decimalNumber=0,reminder,i=1; //only the following integers will be used, other than that it wont work
						Scanner user_input;
						
						              
							user_input=new Scanner(System.in);
							System.out.print("enter a binary number - "); // the software asks the user to type in a binary number
							binaryNumber=user_input.nextInt(); // this is where the user types the binary number
							
							
						
							while(binaryNumber!=0) { // while loop is used to calculate binary to decimal
								
								reminder=binaryNumber%10;  //calculate the remainder
								System.out.print("modulo:"+reminder); //show the remainder
								
			
								
						System.out.print("Previous Decimal value="+decimalNumber+"+"+reminder+"*"+i); // this shows the previous decimal value
						
								decimalNumber=decimalNumber+reminder*i; //this is used to calculate the current decimal number
								System.out.print("Current decimal value"); //this is to print the previous code
								
								i=i*2;
								binaryNumber=binaryNumber/10;
								System.out.println("binary number: "+binaryNumber); //this code is to show binary number after division
							}
							System.out.print("Decimal Value is:"+decimalNumber); //this code shows the final outcome
							System.out.println("");
							
							
							Scanner final6 = new Scanner ( System.in );
							System.out.println("Would you like to convert another number? If yes, type yes. If no, type no to go back to the main menu. Otherwise if you would like to exit the program, please type exit.");
							String final6c = final6.nextLine(); //prompts user input
							   
						    switch (final6c) 
						    {
							    case "yes":
							       	  task6(); //will run the operation again
							    	  break;
								    
							    	
							    case "no":
								      menu(); //will call the menu
								      break;
								    
								    
								 case "exit":
									   System.out.println("Thank you for using the calculator. You may now close the console.");
								       System.exit(0); //will terminate the program
								       break;  
						    }
											}
			
				
				
				public static void task7() { // Asmahaan's task
					
						System.out.println("7: Conversion of a decimal number to hexadecimal");
							
						Scanner task7 = new Scanner( System.in ); //new scanner for later input
						System.out.print("Please enter a decimal number to convert into hexadecimal");
						System.out.println();
						    
						    
						   	int decimalvalue = task7.nextInt(); //will only let integers be typed in, anything else and an error will show
						   	int remainder; // this is to store the remainder and use for later
						   	String result=""; // this is to store the result
						   
						    char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'}; // these are the digits in the hexadecimal system
					
						    
						    while(decimalvalue>0) // only does it when the value inputed is greater than 0. once it reaches 0, it'll stop
						    {
						      remainder=decimalvalue%16; // to get the remainder, we need to divide the inputed value by 16
						      result=hex[remainder]+result; //this will begin to convert the remainder to hexadecimal
						      decimalvalue=decimalvalue/16; // this will repeat until the value we initially input becomes 0
						    }
						    
						    
						System.out.println("The hexadecimal value is " +result); //will display result
						System.out.println("");
						    
						    
							Scanner final7 = new Scanner ( System.in );
							System.out.println("Would you like to convert another number? If yes, type yes. If no, type no to go back to the main menu. Otherwise if you would like to exit the program, please type exit.");
							String final7c = final7.nextLine();
							    
							
						    switch (final7c) 
						    {
							    case "yes":
							          task7(); //will run the operation again
							    	  break;
								    
							    	
							    case "no":
								      menu(); //will call the menu
								      break;
								    
								    
								 case "exit":
									   System.out.println("Thank you for using the calculator. You may now close the console.");
								       System.exit(0); //will terminate the program
								       break;
						    }
				  
				}
			
			
				public static void task8() { //Asmahaan's task
						System.out.println("8: Conversion of a hexadecimal number to decimal");
						
						Scanner task8 = new Scanner( System.in );
					    System.out.print("Please enter a hexadecimal number to convert into decimal");
					    System.out.println("");
					    
					    
					    	String hexvalue = task8.nextLine(); // numbers and letters can be typed.
					    	
					    	String hex= "0123456789ABCDEF"; //hex values 
					    	int decimal = 0;
					    	hexvalue = hexvalue.toUpperCase();			
					    	for // used for instead of while as it'll know exactly how many times it needs to loop itself
					    	(int i = 0; i < hexvalue.length(); i++) //used .length() to know the length of the hex value.  i++ will increase the value by 1    int i to loop
					    	{											
					    		char storevalue = hexvalue.charAt(i); // storevalue stores the character. charAt puts storevalue in required index 
					    		int in = hex.indexOf(storevalue); //.indexOf will convert the storevalue to the hex value 
					    		decimal = 16*decimal+in; // will times decimal by 16 and in which is the index of the value
					    	}
				
					    	System.out.println("The decimal value is: " +decimal);
						
						
						
							Scanner final8 = new Scanner ( System.in );
						    System.out.println("Would you like to convert another number? If yes, type yes. If no, type no to go back to the main menu. Otherwise if you would like to exit the program, please type exit.");
						    String final8c = final8.nextLine();
						    
						    switch (final8c) 
						    {
							    case "yes":
							    	  task8();
							          break;
			
							    case "no":
							    	  menu();
							          break;
							        
							    case "exit":
							    	  System.out.println("Thank you for using the calculator. You may now close the console.");
							    	  System.exit(0); 	//will terminate the program
							    	  break;
						    }
									}
	}


