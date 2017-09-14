
public class HelloWorld implements Greeter {
	private String message;
	private String autherName;

	public void setMessage(String message){
	      this.message  = message;
	}
	  
	@Override
	public void setName(String name) {
		this.autherName = name;
		
	}
	@Override
	public void getGreeting() {
		System.out.println(" " + message +" "+ autherName + "!");
		
	}
}
