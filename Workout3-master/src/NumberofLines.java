import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NumberofLines {
    public static void main(String[] args)
    {
        BufferedReader reader = null;
        int v = 0;
        int w = 0;
        int l = 0;

        try
        {
            reader = new BufferedReader(new FileReader("C:\\Users\\alvin\\IdeaProjects\\Workout 3\\src\\hi.txt"));
            String currentLine = reader.readLine();
            while (currentLine != null)
            {
                l++;
                String[] words = currentLine.split(" ");
                w = w + words.length;

                for (int i=0 ; i<currentLine.length(); i++)
                {
                    char ch = currentLine.charAt(i);
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A'|| ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                    {
                        v++;
                    }
                }

                currentLine = reader.readLine();
            }
            System.out.println("Number of vowels in file : "+ v);
            System.out.println("Number of words in file : "+ w);
            System.out.println("Number of lines in file : "+ l);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                reader.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}
