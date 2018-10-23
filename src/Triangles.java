public class Triangles
{
    /*
We have triangle made of blocks.
The topmost row has 1 block, the next row down has 2 blocks, the next row has 3 blocks, and so on.
Compute recursively (no loops or multiplication) the total number of blocks in such a triangle with the given number of rows.
     */

    public static void main(String args[])
    {
        for (int i = 0; i < 10; i++)
            System.out.println(i+" How many blocks? "+triangles(i));
    }

    public static int triangles(int x)
    {
        if (x < 0)
            return 0;
        if (x == 1)
            return 1;
        else
            return x + triangles(x-1);
    }

}
