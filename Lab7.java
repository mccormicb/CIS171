public class Lab7{
    public static void main(String[] args){
        int salary = 50000;
        System.out.print("The tax on $" + salary + " is " + tax(salary));
    }
    public static double tax(int salary){
        double taxAmount = 0;
        int over = 0;
        int bracket = -1;
        if(salary <= 7150){
            bracket = 0;
        } else if (salary > 7150 && salary <= 29050){
            bracket = 1;
        }else if (salary > 29050 && salary <= 70350){
            bracket = 2;
        } else if (salary > 7350){
            bracket = 3;
        }

        else { return -1;}
        switch (bracket){
            case 0: taxAmount = (salary * 0.1);
                    break;
            case 1: over = salary - 7150;
                    taxAmount = 715 + (over * 0.15);
                    break;
            case 2: over = salary - 29050;
                    taxAmount = 4000 + (over * 0.25);
                    break;
            case 3: over = salary - 70350;
                    taxAmount = 14325 + (over * 0.28);
            default:
                    System.out.println("Please enter a valid salary.");
                    break;
        } 
        
        return taxAmount;
    }

}