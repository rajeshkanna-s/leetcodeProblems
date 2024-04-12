package com.pack;

public class TNEBcalculator {


	public static void main(String[] args) {
		
//		Domestic , Multitenements, Old age homes,Handlooms
//		Consumption upto 500 units bi-monthly
//
//		(100 units free scheme) 
//
//		0-100 units       4.50   0   0      0
//		101-200 units     4.50   0   2.25   0
//		201-400 units     4.50   0   4.50   0
//		401-500 units     6.00   0   6.00   0
//
//		Consumption above 500 units bi-monthly
//		(100 units free scheme) 
//
//		0-100 units       4.50   0   0        0
//		101-400 units     4.50   0   4.50     0
//		401-500 units     6.00   0   6.00     0
//		501-600 units     8.00   0   8.00     0
//		601-800 units     9.00   0   9.00     0
//		801-1000 units   10.00   0   10.00    0
//		Above 1000 units 11.00   0   11.00    0


        
    	
       System.out.println("TNEB Bill Calculator - 2022");
       System.out.println("\nFor Domestic Usage Only(Bi-monthly)\n");
       
		int Consumed_units=10000;
		int consumed_units=Consumed_units;
		double net_Amount=0;
		
		long bill_Amount =(long)net_Amount;
		System.out.println("Consumed_Units = " +Consumed_units );
		
		if (Consumed_units<=500) {
		
		 switch (Consumed_units/100) {
		 case 0:
			 
			 if (Consumed_units>0 && Consumed_units<=100 )
			       
		       {
		           net_Amount= Consumed_units * 4.50;
		           net_Amount=0;
		          
		           bill_Amount =(long)net_Amount;
		           
		           System.out.println("Net_Amount 1 to 100 = " +net_Amount );
		           
		       }
			 
			 break;
        case 1:
       	 if (Consumed_units>=100 && Consumed_units<=200)
       	       
            {  Consumed_units= Consumed_units-100;
                net_Amount= Consumed_units * 2.25; 
                bill_Amount =(long)net_Amount;
                System.out.println("Net_Amount 100 to 200 = " +net_Amount );
                
            }
            break;

        case 2:
       	 if (Consumed_units>=200 && Consumed_units<=300)
     	       
            {  Consumed_units= Consumed_units-200;
                net_Amount= Consumed_units * 4.50; 
                net_Amount= net_Amount+225;// 101 to 200 --100*2.25 =225
                bill_Amount =(long)net_Amount;
                System.out.println("Net_Amount 200 to 300 = " +net_Amount );
                
            }
            break;

        case 3:
       	 if (Consumed_units>=300 && Consumed_units<=400)
       	       
            {  Consumed_units= Consumed_units-200;
                net_Amount= Consumed_units * 4.50;
                net_Amount= net_Amount+225;// 101 to 200 --100*2.25 =225
                bill_Amount =(long)net_Amount;
                System.out.println("Net_Amount 301 to 400 = " +net_Amount );
                
            }
            break;

        case 4:
       	 if (Consumed_units>=400 && Consumed_units<=500)
     	       
            {  Consumed_units= Consumed_units-400;
                net_Amount= Consumed_units * 6;
                net_Amount= net_Amount+225; // 101 to 200 --100*2.25 =225
                net_Amount= net_Amount+900;// 200 to 400 --200*4.50 =900
                bill_Amount =(long)net_Amount;
                System.out.println("Net_Amount 401 to 500 = " +net_Amount );
                
            }
            break;
        case 5:
       	 if (Consumed_units==500)
     	       
            {  Consumed_units= Consumed_units-400;
                net_Amount= Consumed_units * 6;
                net_Amount= net_Amount+225; // 101 to 200 --100*2.25 =225
                net_Amount= net_Amount+900; // 200 to 400 --200*4.50 =900
                bill_Amount =(long)net_Amount;
                System.out.println("Net_Amount 401 to 500 = " +net_Amount );
                
            }
            break;
        default:
            System.out.println("Please the units below 900000");
    }
		}
		
		 else if(Consumed_units>1000) {
			 
			 if (Consumed_units>1000 && Consumed_units<=9999999)
	      	       
            {  Consumed_units= Consumed_units-1000;
                net_Amount= Consumed_units * 11;
                net_Amount= net_Amount+1350;// 201 to 400 --300*4.5 =1,350
                net_Amount= net_Amount+600;// 401 to 500 100*6 =600
                net_Amount= net_Amount+800;// 501 to 600 100*8  =800
                net_Amount= net_Amount+1800;// 601 to 800 200*9  =900
                net_Amount= net_Amount+2000;// 801 to 1000 200*10  =900
                bill_Amount =(long)net_Amount;
                System.out.println("Net_Amount above 1000 = " +net_Amount );
                
            }
			 
		 }
			
		else {
			switch (Consumed_units/100) {
			 case 0:
				 
				 if (Consumed_units>0 && Consumed_units<=100)
				       
			       {
			           net_Amount= Consumed_units * 4.50;
			           net_Amount=0;
			           bill_Amount =(long)net_Amount;
			           System.out.println("Net_Amount 0 to 100 = " +net_Amount );
			           
			       }
				 
				 break;
				 
				 
				 
				 
	         case 1:
	        	 if (Consumed_units>=101 && Consumed_units<=200)
	        	       
	             {  Consumed_units= Consumed_units-100;
	                 net_Amount= Consumed_units * 4.50;
	                 bill_Amount =(long)net_Amount;
	                 System.out.println("Net_Amount 101 to 400 = " +net_Amount );
	                 
	             }
	             break;

	         case 2:
	        	 if (Consumed_units>=201 && Consumed_units<=300)
	      	       
	        	 {  Consumed_units= Consumed_units-100;
                net_Amount= Consumed_units * 4.50;
                bill_Amount =(long)net_Amount;
                System.out.println("Net_Amount 101 to 400 = " +net_Amount );
                
            }
	             break;

	         case 3:
	        	 if (Consumed_units>=301 && Consumed_units<=400)
	        	       
	        	 {  Consumed_units= Consumed_units-100;
                net_Amount= Consumed_units * 4.50;
                bill_Amount =(long)net_Amount;
                System.out.println("Net_Amount 101 to 400 = " +net_Amount );
                
            }
	             break;
	             
	             
	             

	         case 4:
	        	 if (Consumed_units>=401 && Consumed_units<=500)
	      	       
	             {  Consumed_units= Consumed_units-400;
	                 net_Amount= Consumed_units * 6;        
	                 net_Amount= net_Amount+1350;// 300*4.5 =1,350
	                 bill_Amount =(long)net_Amount;
	                 
	                 System.out.println("Net_Amount 401 to 500 = " +net_Amount );
	                 
	             }
	             break;
	         case 5:
	        	 if (Consumed_units>=501 && Consumed_units<=600)
	      	       
	             {  Consumed_units= Consumed_units-500;
	                 net_Amount= Consumed_units * 8;
	                 net_Amount= net_Amount+1350;// 101 to 400 -- 300*4.5 =1,350
	                 net_Amount= net_Amount+600;// 100*6 =600
	                 bill_Amount =(long)net_Amount;
	                 System.out.println("Net_Amount 501 to 600 = " +net_Amount );
	                 
	             }
	             break;
	         case 6:
	        	 if (Consumed_units>=600 && Consumed_units<=700)
	      	       
	             {  Consumed_units= Consumed_units-600;
	                 net_Amount= Consumed_units * 9;
	                 net_Amount= net_Amount+1350;// 101 to 400 --300*4.5 =1,350
	                 net_Amount= net_Amount+600;// 401 to 500 100*6 =600
	                 net_Amount= net_Amount+800;// 501 to 600 100*8  =800
	                 bill_Amount =(long)net_Amount;
	                 System.out.println("Net_Amount 601 to 700 = " +net_Amount );
	                 
	             }
	             break;
	         case 7:
	        	 if (Consumed_units>=700 && Consumed_units<=800)
	      	       
	             {  Consumed_units= Consumed_units-600;
	                 net_Amount= Consumed_units * 9;
	                 net_Amount= net_Amount+1350;// 101 to 400 --300*4.5 =1,350
	                 net_Amount= net_Amount+600;// 401 to 500 100*6 =600
	                 net_Amount= net_Amount+800;// 501 to 600 100*8  =800
	                 bill_Amount =(long)net_Amount;
	                 System.out.println("Net_Amount 701 to 800 = " +net_Amount );
	                 
	             }
	             break;
	         case 8:
	        	 if (Consumed_units>=800 && Consumed_units<=901)
	      	       
	             {  Consumed_units= Consumed_units-800;
	                 net_Amount= Consumed_units * 10;
	                 net_Amount= net_Amount+1350;// 201 to 400 --300*4.5 =1,350
	                 net_Amount= net_Amount+600;// 401 to 500 100*6 =600
	                 net_Amount= net_Amount+800;// 501 to 600 100*8  =800
	                 net_Amount= net_Amount+1800;// 601 to 800 200*9  =900
	                 bill_Amount =(long)net_Amount;
	                 System.out.println("Net_Amount 801 to 901 = " +net_Amount );
	                 
	             }
	             break;
	         case 9:
	        	 if (Consumed_units>=900 && Consumed_units<=1000)
	      	       
	             {  Consumed_units= Consumed_units-800;
	                 net_Amount= Consumed_units * 10;
	                 net_Amount= net_Amount+1350;// 201 to 400 --300*4.5 =1,350
	                 net_Amount= net_Amount+600;// 401 to 500 100*6 =600
	                 net_Amount= net_Amount+800;// 501 to 600 100*8  =800
	                 net_Amount= net_Amount+1800;// 601 to 800 200*9  =900
	                 bill_Amount =(long)net_Amount;
	                 System.out.println("Net_Amount 901 to 1000 = " +net_Amount );
	                 
	             }
	             break;
	             
	         case 10:
	        	 if (Consumed_units==1000)
		      	       
	             {  Consumed_units= Consumed_units-800;
	                 net_Amount= Consumed_units * 10;
	                 net_Amount= net_Amount+1350;// 201 to 400 --300*4.5 =1,350
	                 net_Amount= net_Amount+600;// 401 to 500 100*6 =600
	                 net_Amount= net_Amount+800;// 501 to 600 100*8  =800
	                 net_Amount= net_Amount+1800;// 601 to 800 200*9  =900
	                 bill_Amount =(long)net_Amount;
	                 System.out.println("Net_Amount 901 to 1000 = " +net_Amount );
	                 
	             }
	             break;
    
	         default:
	        	 
	             System.out.println("Please the units below 900000");
	     }
			}
		
		
		
		if (consumed_units>100) {
			System.out.println("Total Current Charges Rs."+(bill_Amount+450));
			System.out.println("CC New Subsidy (100 units cost is free) Rs.(-)450.0 ");
					
		}else{
			System.out.println("BILL AMOUNT IS = "+ bill_Amount);
		}

		}

	}

