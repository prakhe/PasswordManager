import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class IDandPasswords {

	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPasswords(){
		
		logininfo.put("Marcus","Mar10");
		logininfo.put("Procode","PRO+");
		logininfo.put("SDS","2001");
	}
	
	public HashMap getLoginInfo(){
		return logininfo;
	}
}
