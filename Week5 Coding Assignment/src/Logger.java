
public interface Logger {

	// The classes that implements these abstract methods will use
	// the String parameter in the manner each class has been implemented
	// This means that both our AsteriskLogger and SpacedLogger classes 
	// access both methods, but their implementations can be completely different
	// 
	public void Log(String info);
	public void Error(String error);
	
}
