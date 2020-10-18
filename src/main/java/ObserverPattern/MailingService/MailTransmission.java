package ObserverPattern.MailingService;

import java.util.ArrayList;
import java.util.List;

public class MailTransmission {
	private List <MailingService> subscribers = new ArrayList<MailingService>();;
	 
	public void register(MailingService subscriber){
		subscribers.add(subscriber);	
	   }
	
	public void unregister(MailingService subscriber){
		subscribers.remove(subscriber);	
	   }
	
	void sendMails(){
		for(MailingService subscriber : subscribers ) {
			subscriber.update();
		}
	}
}
