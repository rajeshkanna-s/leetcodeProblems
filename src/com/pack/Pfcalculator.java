package com.pack;

import java.text.DecimalFormat;

public class Pfcalculator {

	public static void main(String[] args) {
		
		double monthly_salary = 15000;
		double ee_epf=(12*monthly_salary)/100;
		double er_epf=(3.67*monthly_salary)/100;
		double eeander= (ee_epf+er_epf)*12;
		double fixed_Interest=8.10;
		int age_btn= 1;
		double pf_interest= 0.0;
		double pf_final_amt=0;
		
		
		System.out.println("ee_epf ---"+ ee_epf);
		System.out.println("er_epf ---"+ er_epf);
		System.out.println("eeander for 1 year ---"+ eeander);
		
		double ffAMT= 0;
		
		for (int i=1; i<=age_btn; i++) {
			
			if (i==1){
				pf_interest = (fixed_Interest*eeander)/100;
				
				pf_final_amt =(pf_interest+eeander);
				
				System.out.println("pf_interest for 1 year ---"+ pf_interest);
				
				ffAMT=pf_final_amt;
				
				//System.out.println("pf_final_amt ---"+ pf_final_amt);
			}
			else {
            pf_interest = (fixed_Interest*(eeander+ffAMT))/100;
            
           
			pf_final_amt =(pf_interest+ffAMT+eeander);
			ffAMT= pf_final_amt;
			
}
		}
		
		
			
		System.out.println("pf_final_amt for "+age_btn+ " Years " + pf_final_amt);
		
		
		double pf_bal=0;
		double pf_balance=0;
		for (int i=1; i<=age_btn; i++) {
			
			if (i==1){
			
			pf_interest = (fixed_Interest*pf_bal)/100;
			
			pf_balance =(pf_interest+pf_bal);
			
			}
			else {
				
				pf_interest = (fixed_Interest*pf_balance)/100;
				
				pf_balance =(pf_interest+pf_balance);
				
				
			}

		}

		System.out.println("pf_balance ---"+ pf_balance);
		
		double total_pf_amount=0;
		DecimalFormat df = new DecimalFormat("#.##");
		if (pf_bal!=0) {
			total_pf_amount= pf_final_amt+pf_balance;
			String formatted3 = df.format(total_pf_amount);
			System.out.println("TOTAL_PF_AMOUNT (Final Pf and Pf Balance)-------------------------------"+ formatted3);
			
		}else {
			String formatted3 = df.format(pf_final_amt);
			System.out.println("pf_final_amt for "+age_btn+ " Years " + formatted3);
		
		}
	
}
	}

	