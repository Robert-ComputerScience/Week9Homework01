public class Homework01
{
    // ToDo 01:  Write an algorithm to solve the following problem
    /*
    The sequence of triangle numbers is generated by adding the natural numbers. So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:

1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...

Let us list the factors of the first seven triangle numbers:

 1: 1
 3: 1,3
 6: 1,2,3,6
10: 1,2,5,10
15: 1,3,5,15
21: 1,3,7,21
28: 1,2,4,7,14,28
We can see that 28 is the first triangle number to have over five divisors.

What is the value of the first triangle number to have over one hundred divisors?

    */

    // 1, 3, 6, 10, 15, 21, 28, 36, 45, 55..
    // index: 1, 2, 3, 4,  5,  6,  7,  8,  9,  10

        /*
        3 = 1 + 2 (second number, so thats why we go up to 2)
        6 = 1 + 2 + 3 (third number in list, thats why we go up to 3)
        10 = 1 + 2 + 3 + 4 (fourth number.. etc)
        15 = 1 + 2 + 3 + 4 + 5
        21 = 1 + 2 + 3 + 4 + 5 + 6
        28 = 1 + 2 + 3 + 4 + 5 + 6 + 7
        ...
         */

        public static int divisor(int triangleNum) {
        int sumOfTriangleNumber = 0;
        int triangleCount = 0;
        for (int i = 1; i <= triangleNum; i++) {
            sumOfTriangleNumber += i;
            triangleCount++;
            System.out.println("Count: " + triangleCount + " | Value: " + sumOfTriangleNumber);
        }
        return sumOfTriangleNumber;
    }

// The answer is 5253 over 100 divisors
    public static void main(String[] args)
    {
    divisor(102);

    }




}
