class Bank{
    private int amt = 10000;
    int pin=12345;
    public void setAmt(int p, int a){
        if(pin==p){
            amt=a;
        }else{
            System.out.println("\n\t Invalid pin \n");
            System.exit(0);
        }
    }
    public int getAmt(int p){
        if(pin!=p){
            System.out.println("\n\t Invalid Pin \n");
            System.exit(0);
        }
        return amt;
    }
}