package class_08_08_controlFlow;

public class browser {

	public static void main(String[] args) {

		String browser = "No specific";

		switch (browser) {

		case "Chrome":
			System.out.println("Chrome is the most popular browser");
			break;
		case "Firefox":
			System.out.println("Firefox is the second popular browser");
			break;
		case "Edge":
			System.out.println("Mostly used by Federal Government");
			break;
		default:
			System.out.println("Use Safari browser");

		}

	}

}
