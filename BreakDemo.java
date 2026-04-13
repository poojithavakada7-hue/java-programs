class BreakDemo 
{
    public static void main(String args[]) 
    {
        System.out.println("Before the break");

        boolean t = true;

        first:
        {
            second:
            {
                third:
                {
                    if (t) break second; // break out of second block

                    System.out.println("This won't execute");
                }

                System.out.println("This won't execute");
            }

            System.out.println("This is after second block");
        }
    }
}