package Array;

public class Subarray
{

        void sub() {
            // int add = 0;

            int array[] = {6,7,8,9,10,11,12};

            for (int i = 0; i < array.length; i++) {

                for (int j = i; j < array.length; j++) {

                    for (int k = i; k <= j; k++) {
                        System.out.print(array[k] + " ");
                        //add = add + array1[k];

                    }
                    // System.out.println("your addition =    " + add);
                    System.out.println();

                }

            }
//            System.out.println();
//            System.out.println("your toatal addition of all sub set is = " + add);

        }

    public static void main(String[] args) {
        Subarray subarray =new Subarray();
        subarray.sub();
    }
    }

