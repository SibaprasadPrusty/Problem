class Employee{
    String Name;
    int Mark;
}



public class tricky {
    public static void main (String[] args){

        Employee emp = new Employee();
        emp.Name= "Siba";
        emp.Mark=100;

        Employee emp2 = new Employee();
        emp2.Name= "Sibba";
        emp2.Mark=100;

        System.out.println("Objects were created");

        if(emp==emp2)
            System.out.println("== is true for both the objects");
        else
            System.out.println("== is false for both the objects");

        if(emp.equals(emp2))
            System.out.println(".equals is true for both the objects");
        else
            System.out.println(".equals is false for both the objects");

        if((emp.Name).equals(emp2.Name))
            System.out.println("(emp.Name).equals(emp2.Name) is true for both the objects");
        else
            System.out.println("(emp.Name).equals(emp2.Name) is false for both the objects");

    }
}
