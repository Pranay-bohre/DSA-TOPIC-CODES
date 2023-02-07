public class Main {
  public static void main(String[] args) {
    System.out.println("Naive Algorithm");
    NaiveSearchAlgo algo = new NaiveSearchAlgo();
    algo.Search("AABAACAADAABAAABAA", "AABA");

    System.out.println("KMP Algorithm");
    KMP kmp = new KMP();
    kmp.KMPSearch("AABA", "AABAACAADAABAAABAA");

    System.out.println("Rabin Karp");
    RabinKarp rKarp = new RabinKarp();
    rKarp.Search("AABA", "AABAACAADAABAAABAA", 11);
  }  
}
