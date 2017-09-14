import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
	      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	      //((ClassPathXmlApplicationContext) context).close();
		
	      HelloWorld obj = (HelloWorld) context.getBean("greeter");
	      obj.getGreeting();
	     
	   }
}
