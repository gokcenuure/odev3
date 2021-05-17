package main;



import java.util.Date;

import Adapters.MernisServiceAdapter;
import abstracts.BaseCustomerManager;
import concrete.NeroCustomerManager;
import concrete.StarbucksCustomerManager;
import entities.Customer;



public class Main {

	

	public static void main(String[] args) {
		
	 
	BaseCustomerManager customerManager= new StarbucksCustomerManager(new MernisServiceAdapter());
	
	Customer customer=new Customer(7,"Gökçenur","Ev", new Date(2000,12,25),"44500789922");
	customerManager.Save(customer);
	System.out.println();
	}}
