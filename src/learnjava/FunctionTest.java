package learnjava;

import java.util.ArrayList;

public class FunctionTest {

	// function :getStudentmark
	// input parameter sudentName(string)
	// return mark (int)
	public int getStudentMark (String studentname) 
	{
		int mark=-1;
		System.out.println("pass the student name:" + studentname);
		if (studentname.equalsIgnoreCase("devika")) {
			//return 90;
			mark=90;
		}
		else if (studentname.equalsIgnoreCase("richa")) {
			//return 95;
			mark=95;
		}
		else if (studentname.equalsIgnoreCase("mahesh")) {
			//return 60;
			mark =60;
		}
		else {
			System.out.println("pass the right student name:"+studentname);
			
		}
		return mark;
		
	}
	
	// switch 
	public int getMark (String studentname) {
		System.out.println("pass the studentname"+studentname);
		int mark =-1;
		switch (studentname.toLowerCase().trim()) {
		
		case ("devika"):
			//return 40;
			mark=90;
		break;
		case ("ravi"):
			//return 95;
			mark= 95;
		break;
		case ("monika"):
			//return 55;
			mark=55;
		break;
		default:
			System.out.println("pass the right student name"+ studentname);
			break;
		}
		return mark;
	}
	//WAF= Launch browser
	// input param;string browserName
	// return ; true false 
	public boolean launchBrowser (String browsername) {
		System.out.println("launch the browser:"+browsername);
		if (browsername.equalsIgnoreCase("edge")) {
			return true;
			}
		else if(browsername.equalsIgnoreCase("chrome")) {
			return true;
			}
		else if(browsername.equalsIgnoreCase(" opera")) {
			return true;
			}
		else {
			System.out.println("pass the right browser"+browsername);
			return false;
		}
	}// waf = getDeviceList , input parameter = empname
	//return: =  ArrayList<String> devicelist
	public ArrayList<String> getDeviceList (String empname) {
		System.out.println("get the device list for emp: " +empname);
		
		ArrayList<String> device= new ArrayList<String>();
		switch (empname.toLowerCase().trim()) {
		case "tanya":
			device.add("mac");
			device.add("windows");
			device.add("oneplus");
			break;
		case "ashok":
			
			device.add("redmi");
			break;
		case "anu":
			device.add("mi");
			device.add("lenovo");
			
			break;

		default:
			System.out.println("pass the right empname ... not found:"+ empname);
			break;
		}
		return device;
	}
	
         
	public static void main(String[] args) {
      FunctionTest obj = new FunctionTest();
      int s=obj.getStudentMark("devika");
      System.out.println(s);
      if(s==-1) {
    	  System.out.println("no need to print marksheet");
      }
      else {
    	  System.out.println("print the marksheet");
      }
      
		int s1=obj.getMark("monika");
		System.out.println(s1);
		 if(s1==-1) {
	    	  System.out.println("no need to print marksheet");
	      }
		 else {
			 System.out.println("marksheet");
		 }
		boolean isLaunched= obj.launchBrowser("safari"); 
		System.out.println(isLaunched);
		if(isLaunched) {
			System.out.println("enter the url");
		}
		ArrayList<String> acTualDevice = obj.getDeviceList("tanya");
		System.out.println(acTualDevice.size());
		System.out.println(acTualDevice);
//		acTualDevice.set(0,"m34");
//		System.out.println(acTualDevice);
	}

}
