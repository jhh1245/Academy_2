package study._08_Sort;
import study._08_Sort.util.MyMergeSort;
import study._08_Sort.util.MyQuickSort;
import study._08_Sort.util.MySort;

public class Main {
    public static void main(String[] args) {
       int [] ar = { 5, 4, 3, 8, 7, 6, 2, 1 };

        MySort.insertionSortAsc(ar);
        System.out.println("----insertionSortAsc----");
        for(int n : ar){
            System.out.printf("%3d", n);
        }
        System.out.println();

        MySort.insertionSortDesc(ar);
        System.out.println("----insertionSortDesc----");
        for(int n : ar){
            System.out.printf("%3d", n);
        }
        System.out.println();

        MySort.insertionSortAsc(ar,2,6);
        System.out.println("----insertionSortAsc(2,6)----");
        for(int n : ar){
            System.out.printf("%3d", n);
        }
        System.out.println();
        MySort.insertionSortDesc(ar,2,6);
        System.out.println("----insertionSortDesc(2,6)----");
        for(int n : ar){
            System.out.printf("%3d", n);
        }
        System.out.println();


        MySort.selectionSortAsc(ar);
        System.out.println("----selectionSortAsc(ar)----");
        for(int n : ar){
            System.out.printf("%3d", n);
        }
        System.out.println();


        MySort.selectionSortDesc(ar);
        System.out.println("----selectionSortDesc----");
        for(int n : ar){
            System.out.printf("%3d", n);
        }
        System.out.println();


        MySort.selectionSortAsc2(ar,2,6);
        System.out.println("----selectionSortAsc2(ar,2,6)----");
        for(int n : ar){
            System.out.printf("%3d", n);
        }
        System.out.println();


        System.out.println("----MergeSortAsc(ar)----");
        ar = MyMergeSort.mergeSortAsc(ar);
        for(int n : ar){
            System.out.printf("%3d", n);
        }
        System.out.println();

        System.out.println("----MergeSortDesc(ar)----");
        ar = MyMergeSort.mergeSortDesc(ar);
        for(int n : ar){
            System.out.printf("%3d", n);
        }
        System.out.println();

        System.out.println("----QuickSortAsc(ar)----");
        MyQuickSort.quickSortAsc(ar);
        for(int n : ar){
            System.out.printf("%3d", n);
        }
        System.out.println();

        System.out.println("----QuickSortDesc(ar)----");
        MyQuickSort.quickSortDesc(ar);
        for(int n : ar){
            System.out.printf("%3d", n);
        }
        System.out.println();


        System.out.println("----QuickSortAsc(ar,2,5)----");
        MyQuickSort.quickSortAsc(ar,2,5);
        for(int n : ar){
            System.out.printf("%3d", n);
        }
        System.out.println();


        System.out.println("----QuickSortDesc(ar,2,5)----");
        MyQuickSort.quickSortDesc(ar,2,5);
        for(int n : ar){
            System.out.printf("%3d", n);
        }
        System.out.println();


    }
}