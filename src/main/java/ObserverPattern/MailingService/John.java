package ObserverPattern.MailingService;

public class John extends MailingService{

	private String name;
	public John(String name,MailTransmission mailTransmission) {
		this.name = name;
		this.mailTransmission = mailTransmission;
		this.mailTransmission.register(this);
	}
	@Override
	void update() {
		System.out.println(this.name + " recived an email");
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "John [name=" + name + "]";
	}
	
	
	
}
