package webDriver_Arch;

public interface WebDRiverj extends searchContext   {
	
	public void get (String url);
	
	public String getTittle();
	
	public  String getUrl();
	
	public void click (String eleName);
	
	public void sendkeys (String eleName, String Value );
	
	public void close();
	
	// We can override interface method
	@Override
    public void findElement (String ElementName);
	
	@Override
	public void findElements();
	
	
	

}
