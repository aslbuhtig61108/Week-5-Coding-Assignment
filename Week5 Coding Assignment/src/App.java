
public class App {

	public static void main(String[] args) {
		// When using an interface, you benefit in terms of
		// switching classes because they classes share the same methods
		Logger Logger = new SpacedLogger();
		
		Logger.Log("Happy");
		Logger.Error("Sunday");

	}

}
