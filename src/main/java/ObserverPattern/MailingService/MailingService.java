package ObserverPattern.MailingService;

abstract public class MailingService {
	protected MailTransmission mailTransmission;
	abstract void update();
}
