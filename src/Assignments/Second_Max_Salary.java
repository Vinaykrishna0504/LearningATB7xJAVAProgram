package Assignments;

public class Second_Max_Salary {
    public static void main(String[] args) {
        int[] salaries = {7, 10, 4, 13, 25, 18, 9, 8, 17};

        int highest = salaries[0];
        int second_highest = salaries[0];
        int lowest = salaries[0];

        for (int i = 0; i < salaries.length; i++) {

            if(salaries[i]>highest){
                highest = salaries[i];
            }else if(salaries[i]>second_highest){
                second_highest = salaries[i];
            }else if(salaries[i]<lowest){
                lowest = salaries[i];
            }

        }
        System.out.println("Maximum Salary : " + highest);
        System.out.println("Second Maximum Salary : " + second_highest);
        System.out.println("Lowest Salary : " + lowest);



    }
}
