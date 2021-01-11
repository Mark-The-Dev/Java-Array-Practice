import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        int[] newArr = SortedArray.getIntegers(5);
//        // SortedArray.printArray(newArr);
//        int[] sorted = SortedArray.sortIntegers(newArr);
//        SortedArray.printArray(sorted);
//        int min = MinimumElement.findMin(MinimumElement.readElements(MinimumElement.readInteger()));
//        System.out.println(min);

//        int[] array = new int[] {0,-2,38,42,15};
//
//        int [] reversedArray = ReverseArray.reverse2(array);
//
//        System.out.println(Arrays.toString(reversedArray));

        MobilePhone phone = new MobilePhone("607-768-6698");

        Contact Jim = new Contact("Jim", "777-777-7777");
        Contact Jim2 = new Contact("Jim", "777-777-7777");

        phone.addNewContact(Jim);
        System.out.println(phone.findContact("Jim"));
        System.out.println(phone.addNewContact(Jim2));
    }
}
