class LinearSearch {
    public void LS(int []array, int target){
        int index  = 0;
        boolean isFound = LSUtil(array, index, target);
        System.out.println(isFound ? "Found" : "Not Found");
    }
    boolean LSUtil(int []array, int index, int target){
        if(index >= array.length-1)
            return false;
        
        else if(target == array[index])
            return true;
        else
        return LSUtil(array, index +1, target);
    }
}
