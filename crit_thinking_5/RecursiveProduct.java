package crit_thinking_5;

public class RecursiveProduct {
    
    public static void main(String [] args) {
        UserArray userArray = new UserArray(); //instattiate array
        userArray.setNums(); //populate array
        int[] nums = userArray.getNums(); //sets nums array equal to userarray
        
        System.out.print("The numbers in the array are: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        int product = calculateProduct(nums, 0); //calcs product of nums starting at index 0
        System.out.println("The product of the elements in the array is: " + product);
    }

    //recursive calculation method
    private static int calculateProduct(int[] array, int index) {
        if (index == array.length) { //base case, index reaches array size
            return 1;
        }
        return array[index] * calculateProduct(array, index +1);
    }
}
