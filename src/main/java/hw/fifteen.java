package hw;

public class fifteen {

                             // Question#1
         public static int getLastIndex(String[] names) {
        return names.length -1;
    }
                             // Question#2
        public static int getSecondToLastIndex(String[] names){
        return names.length -2;
    }
                            //Question#3
        public static String getFirstElement(String[] names) {
       return names[0];
    }
                          //Question#4
         public static String getLastElement(String[] names) {
        return names[names.length - 1];
    }
                            //Question#5
        public static String getSecondToLastElement(String[] names) {
        return names[names.length-2];
    }
                        //Question#6
        public static int getSum(int[] ints) {
            int Sum = 0;
            for (int a : ints) Sum += a;
            return Sum;
         }
                        //Question#7
        public static int getAverage(int[] ints) {
             return getSum(ints)/ints.length;
        }

                        //Question#8
       // public static int extractAllOddNumbers(int[] numbers) {
         //   for (int i = 0; i < extractAllOddNumbers.length(); i++)
          //      if (i % 2 != 0) ;
            //return 0;
        // }


        public static void main (String[] args){

             String[] cousinNames = {"Nusrat","Nirjona", "Nitu", "Niha", "Nafiz",};

             int[] icecreamNumber = {1,2,3,4,5,6,7,8,9,10};


            System.out.println(getLastIndex(cousinNames));

            System.out.println(getSecondToLastIndex(cousinNames));

            System.out.println(getFirstElement(cousinNames));

            System.out.println(getLastElement(cousinNames));

            System.out.println(getSecondToLastElement(cousinNames));

            System.out.println(getSum(icecreamNumber));

            System.out.println(getAverage(icecreamNumber));







         }


    }

