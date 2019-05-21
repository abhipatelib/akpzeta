import java.util.ArrayList;

public class IndividualEmail {
	
	private String message, user_RECEIVE, user_SEND;
	
	
	
	public IndividualEmail(String from, String to, String message) {
		this.user_SEND = from;
		this.user_RECEIVE = to;
		this.message = message;
		
	}
	
	//getter user sending
	public String getUserFrom(String sender) {
		return user_SEND;
	}
	
	//getter user going to receive	
	public String getUserTo() {	
		return user_RECEIVE;
	}
	
	//getter message
	public String message() {
		return message;
	}
	
	//message setter
	public void writeMessage(String message) {
		this.message = message;
		
	}
	
	//setter sender
	public void setSenderCC(String sendingFrom) {
		this.user_SEND = sendingFrom;
	}
	
	public void setReciever(String receivingend) {
		this.user_RECEIVE = receivingend;
	}
	
}
