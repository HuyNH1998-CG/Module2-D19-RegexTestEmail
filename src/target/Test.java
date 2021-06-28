package target;

public class Test {
    private static EmailPattern emailPattern;
    public static final String[] validEmail = new String[] { "a@gmail.com", "ab@yahoo.com", "abc@hotmail.com","1@gmail.com" };
    public static final String[] invalidEmail = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };

    public static void main(String[] args) {
        emailPattern = new EmailPattern();
        for (String e : validEmail){
            boolean isValid = emailPattern.validate(e);
            System.out.println(e + " is valid: " + isValid);
        }
        for (String e : invalidEmail){
            boolean isValid = emailPattern.validate(e);
            System.out.println(e + " is valid: " + isValid);
        }
    }
}
