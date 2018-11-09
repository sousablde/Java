package com.sousablde;
/*
shell sort is a variation of the insertion sort
insertion sort chooses which element to insert using a gap of 1
shell sort uses a larger gap value at the comparison points
the gap is reduced as the algorithm runs
the goal is to reduce the amount of shifts that have to be made
the gap is based on the length of the array (using array.length/2 as a starting point)
on each iteration we divide the gap value by 2 to get the next gap value
in this example the array has 7 elements starting the gap at 3, om the second iteration it will be 1 similar to
insertion sort

it is an unstable algorithm

author was Donald Shell
 */

public class Main {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        //this first loop initializes the gap value that we will reduce with each iteration
        for (int gap = intArray.length / 2; gap > 0; gap /= 2) {
            System.out.println("Outer for loop, gap size = " + gap);


            for (int i = gap; i < intArray.length; i++) {
                int newElement = intArray[i];

                int j = i;

                //j is used to traverse the array
                //while j is greater than the gap we have not it the front of the array
                while (j >= gap && intArray[j - gap] > newElement) {
                    intArray[j] = intArray[j - gap];
                    j -= gap;
                }

                intArray[j] = newElement;

                System.out.println("Inner loop, i is " + intArray[i] + " j is " + intArray[j] + " newElement is " + newElement);


            }

        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

}

/*
output
"C:\Program Files\Java\jdk1.8.0_102\bin\java.exe" -javaagent:C:\Users\sousa\AppData\Local\JetBrains\Toolbox\apps\IDEA-C\ch-0\182.4505.22\lib\idea_rt.jar=60911:C:\Users\sousa\AppData\Local\JetBrains\Toolbox\apps\IDEA-C\ch-0\182.4505.22\bin -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_102\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_102\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_102\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_102\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_102\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_102\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_102\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_102\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_102\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_102\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_102\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_102\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_102\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_102\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_102\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_102\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_102\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_102\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_102\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_102\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_102\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_102\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_102\jre\lib\rt.jar;C:\Users\sousa\Desktop\github\Java\ShellSort-variation of insertion sort\out\production\ShellSort-variation of insertion sort" com.sousablde.Main
Outer for loop, gap size = 3
Inner loop, i is 20 j is 7 newElement is 7
Inner loop, i is 55 j is 55 newElement is 55
Inner loop, i is 1 j is 1 newElement is 1
Inner loop, i is 20 j is -22 newElement is -22
Outer for loop, gap size = 1
Inner loop, i is 35 j is 35 newElement is 35
Inner loop, i is 35 j is -15 newElement is -15
Inner loop, i is 35 j is 7 newElement is 7
Inner loop, i is 55 j is 55 newElement is 55
Inner loop, i is 55 j is 1 newElement is 1
Inner loop, i is 55 j is 20 newElement is 20
-22
-15
1
7
20
35
55

Process finished with exit code 0
 */