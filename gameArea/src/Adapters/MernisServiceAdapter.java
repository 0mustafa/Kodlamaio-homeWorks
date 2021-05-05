package Adapters;

import java.rmi.RemoteException;

import Abstract.GamerCheckService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerCheckService{

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		
		try {
			return kpsPublic.TCKimlikNoDogrula
					(Long.parseLong(gamer.getNationalityId()), 
							gamer.getFirstName().toUpperCase(), 
							gamer.getLastName().toUpperCase(), 
							gamer.getYearOfBirth());
		} catch (NumberFormatException | RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}

}
