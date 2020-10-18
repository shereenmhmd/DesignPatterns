package ObserverPattern.MailingService;

public class ObserverDemo {

	public static void main(String[] args) {
		
		//create subject
		MailTransmission registration = new MailTransmission();
		//register observers
		new Alice("Alice", registration);
		new John("John", registration);
		//notify all
		registration.sendMails();

	}

}
