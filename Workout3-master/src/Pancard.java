import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class InvalidPanException extends Exception {
    public InvalidPanException(String s)
    {

        super(s);
    }
}
public class Pancard {
    public static void main(String[] args) throws IOException {

        String pno =new String();

        String n=new String();

        System.out.println("Enter the name of the pan card holder:");

        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        n=bf.readLine();

        System.out.println("Enter the pan card number:");

        pno = bf.readLine();


        try
        {
            if(n.charAt(0)== pno.charAt(4))
            {
                System.out.println("First char in name "+n.charAt(0));

                System.out.println("fifth char in pan card "+ pno.charAt(4));

                System.out.println("Valid pan card no");
            }
            else {
                throw new InvalidPanException("invalid pan card number");
            }
        }
        catch (InvalidPanException e)
        {
            System.out.println(e);

        }



    }
}
