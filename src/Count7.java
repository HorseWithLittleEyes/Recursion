public class Count7
{
    /*
    Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2. (no loops).
    Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
    */

    public static void main(String args[])
    {
        for (int i = 0; i < 10000; i++)
            System.out.println(i+" How many 7s? "+count7(i));
    }

    public static int count7(int x)
    {
        if (x <= 0)
            return 0;
        if (x == 1)
            return 1;
        else
        {
            if (x%10 == 7)
                return 1 + count7((x/10));
            else
                return 0;
        }
    }
}
