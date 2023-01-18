import org.junit.Test;


public class WhenWorkingWithFloatingPointNumbers {
    @Test
     public void convertFah(){

        float Cels = 34.5F;
        float Fahr = 0;

        Fahr = (Cels* 9/5)+ 32;
        System.out.println("Fahrenhait Degree is " + Fahr);




    }
}
