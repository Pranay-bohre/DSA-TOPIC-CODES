class isSorted{
    public void isSorted(int []array){
        int size = array.length;
        int prev = 0;
        isSortedUtil(array, size, prev);
    }

    void isSortedUtil(int []array,int size,int prev){
        int next = prev+1;
        if(next < size){
            if(array[prev] <= array[next]){
                isSortedUtil(array, size, next);
            }
            else    
                {
                    System.out.print("Unsorted");
                    return;
                }
        }
        else{
            System.out.println("Sorted");
            System.out.println();
        }
    }
}

// return arr[index] < arr[index + 1] && isSorted(arr, index + 1);