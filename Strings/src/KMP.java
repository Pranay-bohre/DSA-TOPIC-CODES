import java.util.Arrays;

class KMP {
    void KMPSearch(String pat, String txt){
        int M = txt.length();
        int N = pat.length();
        int lps[] = new int[N];
        completeLPSarray(pat, N, lps);

        System.out.println("lps array " + Arrays.toString(lps));    

        int j = 0, i = 0; //i= index for txt, j = index for pat
        while((M-i) >= (N-j)){
            if(pat.charAt(j) == txt.charAt(i)){ // at 4 it should StringIndexOutOfBoundsException but it doesnt give how?
                i++; j++;
            }
            if(j == N){
                System.out.println("found at " + (i-j));
                j = lps[j-1];
            }
            else if(i < M && pat.charAt(j) != txt.charAt(i)){
                if(j!=0){
                    j = lps[j-1];
                }
                else 
                i = i+1;
            }

        }
    }
    void completeLPSarray(String pat, int N, int []lps){
        // this i will tell us the length of pattern we've taken.
        // len tells us tht length of subpattern matched in the pattern 
        int len = 0;
        lps[0] = 0;
        int i = 1;

        while(i < N){
            if(pat.charAt(len) == pat.charAt(i)){
                len++;
                lps[i] = len;
                i++;
            }
            else{

                if(len != 0){
                    len = lps[len-1];
                }
                else {
                    lps[i] = len;
                    i++;
                }
            }
        }
    }
}
