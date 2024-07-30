package Assignments;

public class Third_Max_Salary {
    public static void main(String[] args) {
        int[] salaries = {7, 10, 4, 13, 25, 18, 9, 8, 17};

        int highest = Integer.MIN_VALUE;
        int second_highest = Integer.MIN_VALUE;
        int third_highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        for (int i = 0; i < salaries.length; i++) {
            if (salaries[i] > highest) {
                third_highest = second_highest;
                second_highest = highest;
                highest = salaries[i];
            } else if (salaries[i] > second_highest && salaries[i] < highest) {
                third_highest = second_highest;
                second_highest = salaries[i];
            } else if (salaries[i] > third_highest && salaries[i] < second_highest) {
                third_highest = salaries[i];
            }

            if (salaries[i] < lowest) {
                lowest = salaries[i];
            }
        }

        System.out.println("Maximum Salary : " + highest);
        System.out.println("Second Maximum Salary : " + second_highest);
        System.out.println("Third Maximum Salary : " + third_highest);
        System.out.println("Lowest Salary : " + lowest);
    }
}
