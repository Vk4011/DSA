public class Prime extends Main {
    public static int  sieve(int n,boolean p[]){
        int v=0;
        for(int i=2;i+i<=n;i++){
        if( !p[i]){
            for(int j=i*2;j<=n;j+=i){
                p[i]=true;
            }
        }
    }
    for(int i=2;i<=n;i++){
        if(!p[i]){
            System.out.print(" "+i+" ");
            v+=i;
        }
    }
    
    return v;
    }
    
}
    // 21  22  23  24  25  26  27  28  29  30  31  32  33  34  35  36  37  38  39  40 
    //      Sum of prime numbers : 610




    // Time complexcity :
    
    // Hp => n(1/2+1/3+1/5+1/7------)
    // log(log N)
    // TC = O(N*(log log(N))


    