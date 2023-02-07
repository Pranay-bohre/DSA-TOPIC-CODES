class NaiveSearchAlgo{
    // Naive pattern searching is the simplest method among other pattern-searching algorithms. 
    // It checks for all characters of the main string to the pattern. 
    // This algorithm is helpful for smaller texts. 
    // It does not need any pre-processing phases. We can find the substring by checking once for the string.
    //  It also does not occupy extra space to perform the operation.

    // The time complexity of Naive Pattern Search method is O(m*n). 
    // The m is the size of pattern and n is the size of the main string.

    public void Search(String main, String pattern){
        char []mains = main.toCharArray(); 
        char []patterns = pattern.toCharArray();

        int M = mains.length;
        int P = patterns.length;
        for(int i = 0; i< M-P; i++){
            int j;
            for(j = 0; j < P; j++){
                if(patterns[j] != mains[i+j])
                    break;
            }
            if(j == P)
            System.out.println("Pattern found at " + i);
        }
    }
}