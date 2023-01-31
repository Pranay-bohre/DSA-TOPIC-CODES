class BubbleSort {
    public void Sort(int []array){
        int end = array.length-1;
        int result[]= BSortv(array, end);
        for(int i : result){
            System.out.print(i + " ");
        }
    }   
    int[] BSortv(int []arr, int end){
        int start = 0;
        if(end == 0){
            return arr;
        }
        BSorth(arr, start, end);
        BSortv(arr, end-1);
        return arr;
    }
    int[] BSorth(int []arr, int start, int end){
        if(start == end)
            return null;
        if(arr[start] > arr[start + 1])
            {
                int temp = arr[start];
                arr[start] = arr[start+1];
                arr[start+1] =temp;
            }
            BSorth(arr, start+1, end);
        return arr;
    }   
}
