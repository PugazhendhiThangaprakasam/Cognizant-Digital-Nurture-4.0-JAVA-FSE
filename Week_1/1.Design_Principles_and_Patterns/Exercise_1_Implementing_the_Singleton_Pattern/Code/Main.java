package Exercise_1_Implementing_the_Singleton_Pattern.Code;

public class Main {
    public static void main(String[] args ) {
		Logger logger1 = Logger.getInstance();
		logger1.log("Message from logger1");
		
		Logger logger2 = Logger.getInstance();
		logger2.log("Message from logger2");
		
		if(logger1 == logger2) {
			System.out.println("Both Logger objects point to same memory!!");
		}
		else {
			System.out.println("Both Logger objects points to different memory!!");
		}
	}
    
}
