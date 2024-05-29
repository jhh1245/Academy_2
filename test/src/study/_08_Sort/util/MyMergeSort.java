package study._08_Sort.util;

public class MyMergeSort {

   static int [] mergeAsc (int [] left, int [] right) {
        //const result = [];
        int [] result = new int[left.length + right.length];
        int left_index = 0;
        int right_index = 0;
        int index = 0;
        while (left.length>left_index && right.length>right_index) {
            if (left[left_index] <= right[right_index]) {
                //result.push(left.shift());
                result[index] = left[left_index];
                index++;
                left_index++;
            }
            else {
                //result.push(right.shift());
                result[index] = right[right_index];
                index++;
                right_index++;
            }
        }

        while (left.length>left_index) {
            //result.push(left.shift());
            result[index] = left[left_index];
            index++;
            left_index++;
        }
        while(right.length>right_index) {
            //result.push(right.shift());
            result[index] = right[right_index];
            index++;
            right_index++;
        }
        return result;
    }

    public static int [] mergeSortAsc (int [] arr) {
        if (arr.length < 2) {
             return arr;
        }
        int  middle = arr.length / 2;
        int [] left = new int[middle];
        System.arraycopy(arr,0,left,0,middle);
        //int  left   = arr.slice(0, middle);
        int [] right = new int[arr.length-middle];
        System.arraycopy(arr,middle,right,0,right.length);
        //int  right  = arr.slice(middle, input.length);
        return mergeAsc(mergeSortAsc(left), mergeSortAsc(right));
    }



    static int [] mergeDesc (int [] left, int [] right) {
        //const result = [];
        int [] result = new int[left.length + right.length];
        int left_index = 0;
        int right_index = 0;
        int index = 0;
        while (left.length>left_index && right.length>right_index) {
            if (left[left_index] >= right[right_index]) {
                //result.push(left.shift());
                result[index] = left[left_index];
                index++;
                left_index++;
            }
            else {
                //result.push(right.shift());
                result[index] = right[right_index];
                index++;
                right_index++;
            }
        }

        while (left.length>left_index) {
            //result.push(left.shift());
            result[index] = left[left_index];
            index++;
            left_index++;
        }
        while(right.length>right_index) {
            //result.push(right.shift());
            result[index] = right[right_index];
            index++;
            right_index++;
        }
        return result;
    }

    public static int [] mergeSortDesc (int [] arr) {
        if (arr.length < 2) {
            return arr;
        }
        int  middle = arr.length / 2;
        int [] left = new int[middle];
        System.arraycopy(arr,0,left,0,middle);
        //int  left   = arr.slice(0, middle);
        int [] right = new int[arr.length-middle];
        System.arraycopy(arr,middle,right,0,right.length);
        //int  right  = arr.slice(middle, input.length);
        return mergeDesc(mergeSortDesc(left), mergeSortDesc(right));
    }
}
