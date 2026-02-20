package webDriver_Arch;

public class FireFoxDriver implements WebDRiverj 
{
	public FireFoxDriver() {
		System.out.println("FireFox is launched ");
	}
	@Override
	public void get(String url) {
		System.out.println("Launch Url : " +url);
		
	}

	@Override
	public String getTittle() {
		return "amazon" ;
	}

	@Override
	public String getUrl() {
		// TODO Auto-generated method stub
		return "https://www.amazon.com";
	}

	@Override
	public void click(String eleName) {
		System.out.println("Click on element: "+ eleName);
		
	}

	@Override
	public void sendkeys(String eleName, String Value) {
		System.out.println("entering value  in : "+ eleName + " value " + Value);
		
	}

	@Override
	public void close() {
		System.out.println("browser is closed ");
		
	}

	@Override
	public void findElement(String ElementName) {
		System.out.println("Find the element:" + ElementName);
		
	}

	@Override
	public void findElements() {
		System.out.println("find element on the page ");
		
	}

}
