import java.util.Scanner;

class ExceptionShort extends Exception
{
    ExceptionShort(String s)
    {
        super(s);
    }
}

class ExceptionLong extends Exception
{
    ExceptionLong(String s)
    {
        super(s);
    }
}

public class StringLength {
    public static int find_length(String word)
    {
        char[] a=word.toCharArray();
        int len=0;

        for(char ch:a)
        {
            len++;
        }
        return len;
    }

    public static int check(int len)
    {
        if(len<5)
        {
            return 0;
        }
        else if (len>10)
        {
            return 2;
        }
        else
        {
            return 1;
        }
    }

    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);

        System.out.println("Reading lines from user to check exception");


        try
        {

            String c =new String();
            c =sc.nextLine();

            String[] words = c.split(" ");

            for(String word:words)
            {
                int len = find_length(word);

                int n = check(len);

                if (n == 0)
                {
                    throw new ExceptionShort("The input "+word+" is too short");

                }
                else if (n == 2)
                {
                    throw new ExceptionLong("The input "+word+" is too long");

                }

                else
                {
                    System.out.println("The input "+word+" is neither too long nor too short");
                }

            }
        }
        catch (ExceptionShort e)
        {
            System.out.println(e);
        }
        catch (ExceptionLong e)
        {
            System.out.println(e);
        }

    }
}
