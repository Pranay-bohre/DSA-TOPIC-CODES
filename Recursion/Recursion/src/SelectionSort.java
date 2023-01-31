class SelectionSort{
    public void Sort(int array[]){
        int end = array.length-1;
        int result[] = SortH(array, end);
        for(int i : result){
            System.out.print(i + " ");
        }
    }

    int[] SortH(int arr[], int end){
        int start = 0, maxindex = 0;
        if(end == 0)
            return arr;
        SortV(arr, end, start, maxindex);
        int temp = arr[start];
        arr[start] = arr[maxindex];
        arr[maxindex] = temp;
        SortH(arr, end-1);
        return arr;
    }
    int[] SortV(int arr[], int end, int index, int maxindex){
        if(index == end)
            return arr;
        int max =  arr[index];
        if(max < arr[index]){
            max = arr[index];
            maxindex = index;
        }
        SortV(arr, end, index+1, maxindex);
        return arr;
    }
}