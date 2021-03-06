package Adapters;

import java.rmi.RemoteException;

import abstracts.CustomerCheckService;
import entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		
	
	
	KPSPublicSoap soapClient = new KPSPublicSoapProxy();
	boolean result=false;
	 try {
		  result = soapClient.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName(),
				  customer.getLastName(), customer.getDateOfBirth().getYear());
				  
	 
			   
	  } catch (RemoteException e) {
		  
	       e.printStackTrace();
	  }
	 return result;
  
}
}