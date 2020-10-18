package ObserverPattern.MailingService;

public class Alice extends MailingService{

	private String name;
	
	public Alice(String name, MailTransmission mailTransmission) {
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
	
	
}
