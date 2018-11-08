package com.sousablde;
/*
we traverse the sorted partition from right to left and compare the elements in the unsorted partition
to the ones in the sorted partition, we try to find values that are less than or equal to what we are
trying to insert
it is an in-place algorithm and it is a stable algorithm
 */

public class Main {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};


        //this implementation assumes that the element in position 0 is in fact sorted
        //it also shifts elements instead of swapping them
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length;
             firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];
            int i;

            //looking for the insertion position,if we haven't hit the front of the array (meaning the element we
            //are trying to insert is the smallest
            /*
            to walk through what is happening: when we want to insert -15 (assuming first iteration is done and 20 and
            35 are in the sorted partition) -15 has an i=2 in the unsorted partition, we check if i>0 (true), i-1
            corresponds to 35 in the sorted partition and this is greater than -15,  so we will assign 35 to i=2
            in the sorted partition, do it again for 20 and assign i=1 to 20, since we drop out fo the loop
             here (is i>0? (false) putting -15 in the i=0 position through the newElement

             */
            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }

            intArray[i] = newElement;
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }

}
/*
output
"C:\Program Files\Java\jdk1.8.0_102\bin\java.exe" -javaagent:C:\Users\sousa\AppData\Local\JetBrains\Toolbox\apps\IDEA-C\ch-0\182.4505.22\lib\idea_rt.jar=60633:C:\Users\sousa\AppData\Local\JetBrains\Toolbox\apps\IDEA-C\ch-0\182.4505.22\bin -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_102\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_102\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_102\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_102\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_102\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_102\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_102\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_102\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_102\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_102\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_102\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_102\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_102\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_102\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_102\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_102\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_102\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_102\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_102\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_102\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_102\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_102\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_102\jre\lib\rt.jar;C:\Users\sousa\Desktop\github\Java\InsertionSort\out\production\InsertionSort" com.sousablde.Main
-22
-15
1
7
20
35
55

Process finished with exit code 0
 */

