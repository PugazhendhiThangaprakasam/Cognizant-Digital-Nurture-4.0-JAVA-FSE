package Exercise_1_Implementing_the_Singleton_Pattern.Code;

public class Logger {
    private static Logger logger = new Logger();
	
	private Logger() {
		System.out.println("Logger Object Created!");
	}
	
	public static Logger getInstance() {
		return logger;
	}
	
	public void log(String message) {
        System.out.println("Log: " + message);
    }
}
