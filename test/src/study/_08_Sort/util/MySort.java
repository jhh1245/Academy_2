package study._08_Sort.util;

public class MySort {

    public static void insertionSortAsc(int [] ar){
        int k;
        for(int i=1;i<ar.length;i++){

            int key = ar[i];

            for(k=i-1;k>=0;k--){
                if(ar[k] > key){
                    ar[k+1] = ar[k];
                }else{
                    break;
                }
            }
            ar[k+1] = key;
        }

    }//end:insertionSortAsc()

    public static void insertionSortAsc(int [] ar,int beginIndex,int endIndex){
        int k;
        for(int i=beginIndex+1;i<endIndex;i++){

            int key = ar[i];

            for(k=i-1;k>=beginIndex;k--){
                if(ar[k] > key){
                    ar[k+1] = ar[k];
                }else{
                    break;
                }
            }
            ar[k+1] = key;
        }

    }//end:insertionSortAsc(beginIndex,endIndex)

    public static void insertionSortDesc(int [] ar){
        int k;
        for(int i=1;i<ar.length;i++){

            int key = ar[i];

            for(k=i-1;k>=0;k--){
                if(ar[k] < key){
                    ar[k+1] = ar[k];
                }else{
                    break;
                }
            }
            ar[k+1] = key;
        }

    }//end:insertionSortDesc()

    public static void insertionSortDesc(int [] ar,int beginIndex,int endIndex){
        int k;
        for(int i=beginIndex+1;i<endIndex;i++){

            int key = ar[i];

            for(k=i-1;k>=beginIndex;k--){
                if(ar[k] < key){
                    ar[k+1] = ar[k];
                }else{
                    break;
                }
            }
            ar[k+1] = key;
        }

    }//end:insertionSortDesc(beginIndex,endIndex)

    public static void selectionSortAsc(int [] ar){
        for(int i=0;i<ar.length-1;i++){
            for(int k=i+1;k<ar.length;k++){
                if(ar[i]>ar[k]){
                    int im = ar[i];
                    ar[i] = ar[k];
                    ar[k] = im;
                }
            }
        }
    }//end:selectionSortAsc(ar)

    public static void selectionSortDesc(int [] ar){

        for(int i=0;i<ar.length-1;i++){
            for(int k=i+1;k<ar.length;k++){
                if(ar[i] < ar[k]){
                    int im = ar[i];
                    ar[i] = ar[k];
                    ar[k] = im;
                }
            }
        }
    }//end:selectionSortDesc(ar)


    public static void selectionSortAsc(int [] ar,int beginIndex,int toIndex){
        for(int i=beginIndex;i<toIndex-1;i++){
            for(int k=i+1;k<toIndex;k++){
                if(ar[i]>ar[k]){
                    int im = ar[i];
                    ar[i] = ar[k];
                    ar[k] = im;
                }
            }
        }
    }//end:selectionSortAsc(ar,begin,to)

    public static void selectionSortDesc(int [] ar,int beginIndex,int toIndex){
        for(int i=beginIndex;i<toIndex-1;i++){
            for(int k=i+1;k<toIndex;k++){
                if(ar[i] < ar[k]){
                    int im = ar[i];
                    ar[i] = ar[k];
                    ar[k] = im;
                }
            }
        }
    }//end:selectionSortDesc(ar,begin,to)

    public static void selectionSortAsc2(int [] ar,int beginIndex,int toIndex){
        for(int i=beginIndex+1;i<toIndex;i++){

            for(int k=beginIndex; k < i ;k++){

                System.out.printf("(%d:%d):%d > %d\n", k, i, ar[k],ar[i]);

                if(ar[k] > ar[i]){
                    int im = ar[i];
                    ar[i] = ar[k];
                    ar[k] = im;
                }
            }
        }
    }//end:selectionSortAsc(ar,begin,to)


}
