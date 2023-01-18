import org.junit.Test;

public class WhenWorkingWithStrings {
@Test
    public  void LowerCase(){

        String MyName = "YASMEEN KH";
        System.out.println("check my name in Lower case = "+ MyName.toLowerCase());
    }
    @Test

    public  void UpperCase(){
    String Name = "yasmeen kh";
        System.out.println("Check my name in upper case = " + Name.toUpperCase());
    }

    @Test

    public void RemoveSpace(){
    String Country = " Palestine ";
        System.out.println("This is my country :"+ Country.trim());
    }

    @Test
    public void StrinLength(){

    String Role = "System admin";
        System.out.println("check the length of the string:"+Role.length());
    }
}
