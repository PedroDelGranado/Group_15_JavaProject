package AliDemir;

public class Week2_Qall {
    public static void main(String[] args) {

        swapTwoNumbers(1,2);

        System.out.println("===============================================");

        DivisibleBy3_5_15(100);

        System.out.println("===============================================");

        ConsecutiveNumbers(30);

    }

    public static void swapTwoNumbers(int number1, int number2){

        //use the simple algebra
        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;

        System.out.println("number1 = "+number1);
        System.out.println("number2 = "+ number2);

    }

    public static void DivisibleBy3_5_15(int range){
        String DivisibleBy3 = ":";
        String DivisibleBy5 = ":";
        String DivisibleBy15 = ":";

        for (int i = 1; i <= range; i++) {
            if(i%15 == 0){
                DivisibleBy15 = DivisibleBy15 + " "+i;
            } else if (i%5 == 0) {
                DivisibleBy5 = DivisibleBy5 + " "+i;
            } else if (i%3 == 0) {
                DivisibleBy3 = DivisibleBy3 + " "+i;
            }


        }
        System.out.println("DivisibleBy15 = " + DivisibleBy15);
        System.out.println("DivisibleBy5 = " + DivisibleBy5);
        System.out.println("DivisibleBy3 = " + DivisibleBy3);
    }


    public static void ConsecutiveNumbers(int range){
        for (int i = 1; i <= range; i++) {
            String result = "";

            if(i%2 ==0){
                result += "Condility";
            }
            if(i%3 ==0){
                result += "Test";
            }
            if (i%5 == 0){
                result += "Coders";
            }
            if(result.isEmpty()){
                System.out.println(i);
                continue;
            }else {
                System.out.println(result);
            }
        }
    }
}


/*
🏆 **JAVA CODING TASKS - WEEK02**🏆 <@&1139215120678006850>

1️⃣ **Numbers -- Swap Numbers**
Swap two variable values without using a third variable

2️⃣ **Numbers -- Divisible by 3, 5, 15**
Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
-if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15 section
-if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3 section
-if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5 section
ex:
OutPut:
Divisible By 15 15 30 45 60 75 90
Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99

3️⃣ **Numbers -- print consecutive numbers**
Write a function that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line. However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively. If a number is divisible by more than one of the numbers: 2,3 or 5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order. For example, numbers divisible by both 2 and 3 should be replaced by CodilityTest and numbers divisible by all three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.

For example, here is the output for N = 17:
1
Codility
Test
Codility
Coders
CodilityTest
7
Codility
Test
CodilityCoders
11
CodilityTest
13
Codility
TestCoders
Codility
17
🎉 Happy Coding to all 🥳
 */
