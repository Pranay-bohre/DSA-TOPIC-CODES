class BinarySearch{
    public int BinarySearchUtil(int target, int []array, int start, int end){
        if(start >end)
        return -1;
        int mid = start + (end - start)/2;
        if(target> array[mid]){
            start = mid +1;
            return BinarySearchUtil(target, array, start, end);
        }
        else if(target == array[mid]){
            return mid;
        }
        else{
            end = mid -1;
            return BinarySearchUtil(target, array, start, end);
        }
        }
    
    public void binarysearch(int target, int []array){   
        int start = 0;
        int end = array.length;
        int result =  BinarySearchUtil(target, array, start, end);
        System.out.println(result==-1 ? "Not found" : result);
    }
}