package base;

public class App {

    public static String browser = System.getProperty("browser", "chrome");
    public static String stage = System.getProperty("stage", "qa");
    public static String validUserName = System.getProperty("validUserName", "standard_user");
    public static String validPassword = System.getProperty("validPassword", "secret_sauce");
    public static String inValidpassword = System.getProperty("inValidpassword", "chrome");

}
