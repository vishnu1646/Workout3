package sport;

abstract class OutdoorGame
{
    abstract void team();
}

class Football extends OutdoorGame
{
    void team()
    {
        System.out.println("Argentina");
    }
}

class Cricket extends OutdoorGame
{
    void team()
    {
        System.out.println("India");
    }
}


public class DriverClass1 {
    public static void main(String args[])
    {
        System.out.println("Package Sports");

        Football f=new Football();
        f.team();

        Cricket c=new Cricket();
        c.team();
    }
}
