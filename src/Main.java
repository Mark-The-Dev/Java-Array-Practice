public class Main {
    public static void main(String[] args) {

//        int[] newArr = SortedArray.getIntegers(5);
//        // SortedArray.printArray(newArr);
//        int[] sorted = SortedArray.sortIntegers(newArr);
//        SortedArray.printArray(sorted);
        int min = MinimumElement.findMin(MinimumElement.readElements(MinimumElement.readInteger()));
        System.out.println(min);
    }
}
