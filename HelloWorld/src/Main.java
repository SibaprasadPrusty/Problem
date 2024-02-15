import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
 class immutableClass{
    private final String name;
    private final List<String> address;

    public String getName() {
        return name;
    }

    public List<String> getAddress() {
        List<String> returnResult = new ArrayList<>();
        for(int i=0;i<address.size();i++)
        {
            returnResult.add(address.get(i));
        }
        return returnResult;

    }

    public immutableClass(String name, List<String> address) {
        this.name = name;
        this.address=address;
    }
}


public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       //Creation of immutable class which has two properties String and List of String
        //String[] arrayString = {"Odisha","WB"};
        List<String> listOfString = new ArrayList<>();//new ArrayList<>();
        listOfString.add("Odisha");
        listOfString.add("WB");

        //Address add=new Address(listOfString);

         immutableClass immutableCls =  new immutableClass("Siba",listOfString);

        immutableCls.getAddress().add("XYZ");

        System.out.println(immutableCls.getAddress());
    }
}