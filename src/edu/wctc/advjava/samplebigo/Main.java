package edu.wctc.advjava.samplebigo;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static Long START;
    static Long END;
    static Long diff;

    public static void main(String[] args)
    {
        String[] strArray;
        String someString;
        Boolean bResult;

        ArrayList<String[]> strArrays = new ArrayList();
        strArrays.add(new String[5]);
        strArrays.add(new String[50]);
        strArrays.add(new String[500]);
        strArrays.add(new String[5000]);
        strArrays.add(new String[5000]);
        strArrays.add(new String[50000]);
        strArrays.add(new String[50000]);
        strArrays.add(new String[51000]);
        strArrays.add(new String[52000]);
        strArrays.add(new String[53000]);

        // O(1)
        System.out.print("O(1): ");
        for (String[] anArray : strArrays)
        {
            START = System.nanoTime();
            bResult = IsFirstElementNull(anArray);
            END = System.nanoTime();
            diff = END - START;
            System.out.print(diff.toString() + " ");
        }
        System.out.println("\n");




        // O(N)
        System.out.print("O(N): ");
        strArray = new String[5];
        strArray[0] = "Hello";
        strArray[1] = "GOODBYE";
        strArray[2] = "SEE YA";
        strArray[3] = "Hello";
        strArray[4] = "Junk";
        someString = "Advanced Java";
        for (String[] anArray : strArrays)
        {
            START = System.nanoTime();
            bResult = ContainsValue(anArray, someString);
            END = System.nanoTime();
            diff = END - START;
            System.out.print(diff.toString() + " ");
        }
        System.out.println("\n");






        // O(N2)
        System.out.print("O(N2): ");
        strArray = new String[5];
        strArray[0] = "Hello";
        strArray[1] = "GOODBYE";
        strArray[2] = "SEE YA";
        strArray[3] = "Hello";
        strArray[4] = "Junk";
        for (String[] anArray : strArrays)
        {
            START = System.nanoTime();
            bResult = ContainsDuplicates(anArray);
            END = System.nanoTime();
            diff = END - START;
            System.out.print(diff.toString() + " ");
        }
        System.out.print("\n");




        // O(2N)
        Integer seed = 8;
        String theSequence = "";

        System.out.print("O(2N): ");
        for (int x = 0; x <= 20; x++)
        {
            START = System.nanoTime();
            seed = Fibonacci(x);
            END = System.nanoTime();
            diff = END - START;
            System.out.print(diff.toString() + " ");
            // theSequence += seed.toString() + ", ";
        }
        // System.out.println(theSequence);
        System.out.println("DONE");
    }

    /**
     * // O(1)
     * @param elements
     * @return
     */
    private static Boolean IsFirstElementNull(String[] elements)
    {
        return elements[0] == null;
    }

    /**
     * // O(N)
     * @param elements
     * @param value
     * @return
     */
    private static Boolean ContainsValue(String[] elements, String value)
    {
        for (String element : elements)
        {
            if(element != null)
            {
                if (element.equals(value)) return true;
            }
        }

        return false;
    }

    /**
     * // O(N2)
     * @param elements
     * @return
     */
    private static Boolean ContainsDuplicates(String[] elements)
    {
        for (int outer = 0; outer < elements.length; outer++)
        {
            for (int inner = 0; inner < elements.length; inner++)
            {
                // Don't compare with self
                if (outer == inner) continue;

                if (elements[outer] != null && elements[inner] != null)
                {
                    if (elements[outer] == elements[inner]) return true;
                }
            }
        }

        return false;
    }

    /**
     * // O(2N)
     * @param num
     * @return
     */
    private static Integer Fibonacci(Integer num)
    {
        if (num <= 1) {return num;}

        return Fibonacci(num - 2) + Fibonacci(num - 1);
    }
}


