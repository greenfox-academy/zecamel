import java.util.*;

public class ElementFinder{
    public static void main(String... args){
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        boolean var1 = arrayList.contains(7);
        if (var1==true)
            System.out.println("Hooray");

        else
        System.out.println("Nooooo");
        // Check if the arrayList contains "7" if it contains print "Hoorray" otherwise print "Noooooo"
        // Do this again with a different solution using different list functions!

    }
}