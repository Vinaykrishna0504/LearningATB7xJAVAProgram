package Assignments;

public class Second_Max_Salary {
    public static void main(String[] args) {

        int[] salaries = {7, 10, 4, 13, 25, 18, 9, 8, 17};
        int max = Integer.MIN_VALUE;  // Initialize max to the smallest possible value
        int secondMax = Integer.MIN_VALUE; // Initialize second max to the smallest possible value

        for (int i = 0; i < salaries.length; i++) {
            if (salaries[i] > max) {
                secondMax = max; // Update second max before changing max
                max = salaries[i];
            } else if (salaries[i] > secondMax && salaries[i] != max) {
                secondMax = salaries[i];
            }
        }

        System.out.println("Second highest salary: " + secondMax);

    }
}
