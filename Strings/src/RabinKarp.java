class RabinKarp {
    public int d = 256;
    void Search(String pat, String txt, int q){
        int M  = pat.length();
        int N = txt.length();
        int i, j;
        int p =0, t = 0; //p = hashvalue of pat, t = hashvalue of txt
        int h = 1;

        // value of h would be pow(d, M-1) %q
        for(i = 0; i < M-1; i++)
            h = (h*d)%q;
        
        // calculating the value of p and t
        for(i = 0; i < M ; i++){
            p = (d*p + pat.charAt(i))%q;
            t = (d*t + txt.charAt(i))%q;
        }

        // main algo sliding the pattern on to the text and matching hash value if not found following some operations
        for(i = 0; i <= N-M; i++){
            // Check the hash values of current window of
            // text and pattern. If the hash values match
            // then only check for characters one by one
            
            if(p == t){
                for(j = 0; j < M ; j++){
                    if(txt.charAt(i + j) != pat.charAt(j)) break;
                }
                if(j == M)
                System.out.println("pattern found at " + i);
            }

            // if not matches then we calculate t for the next window
            // for this we subtract the hashvalue of leading and add the trailing
            if(i < N-M){
                t = (d*(t - txt.charAt(i)*h) + txt.charAt(i + M))%q;

                // we might get t as negative then we make it pos by adding the q
                if(t < 0)
                    t = t +q;
            }
        }
    }
}
