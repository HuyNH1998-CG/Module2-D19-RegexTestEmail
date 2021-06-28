package target;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailPattern {
    private static Pattern pattern;
    private Matcher matcher;
//    private static final String emailRegex = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-za-z0-9]+)$";
    private static final String emailRegex = "^[0-9]+[0-9]*@[A-Za-z0-9]+(\\.[A-za-z0-9]+)$";

    public EmailPattern(){
        pattern = Pattern.compile(emailRegex);
    }
    public boolean validate(String emailRegex){
        matcher = pattern.matcher(emailRegex);
        return matcher.matches();
    }
}
