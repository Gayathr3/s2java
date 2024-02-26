import java.util.Arrays;
public class StringSorter {
public static void main(String[] args) {
System.out.println("Gayathri suresh\n 23mca028\n 26-feb-2024");
String[] strings = {"banana", "apple", "cherry", "date"};
System.out.println("Original array: " + Arrays.toString(strings));
Arrays.sort(strings);
System.out.println("Sorted array: " + Arrays.toString(strings));
}
}
