import java.util.HashMap;

public class IDandPasswords {

    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDandPasswords(){

        logininfo.put("Anton", "Student");
        logininfo.put("Marjorie", "Student");
        logininfo.put("Micah", "Professor");
    }

    protected HashMap getLoginInfo(){
        return logininfo;
    }
}
