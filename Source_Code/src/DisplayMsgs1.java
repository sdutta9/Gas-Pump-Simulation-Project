public class DisplayMsgs1 extends DisplayMsgs {
    public DisplayMsgs1(Data ds) {
        super(ds);
    }    
    void PayMsg() {
        System.out.println("\n\tSelect Payment:");
        System.out.println("\t2. Credit");
        System.out.println("\t3. Cash\n");
    }
    @Override
    void DisplayMsg() {
        if(ds.W == 1)
            System.out.println("\n\t The Credit Card is approved.\n");
    } 
    @Override
    void RejectMsg() {
        System.out.println("\n\t The Credit Card is not approved.\n");
    }
    @Override
    void GasPumpedMsg() {
        int G = ds.getG();
        System.out.println("\n\t"+G+" GALLONS PUMPED\n");
    }
    @Override
    void StopMsg() {
        if(ds.W == 0){
            int cash = ds.getCash();
            int G = ds.getG();
            int price = ds.getPrice();
            if(cash < (G +1)*price){
                System.out.println("\n\tPUMP STOPPED - NOT SUFFICIENT AMOUNT OF CASH\n");
                return;
            }
        }        
        System.out.println("\n\tPUMP IS STOPPED\n");       
    }
    @Override
    void PrintReceipt() {
        int total = ds.getPrice() * ds.getG();
        System.out.println("\n\tRECEIPT");
        System.out.println("\t# OF GALLONS: "+ds.getG());
        System.out.println("\tTOTAL: $"+total+"\n");
    }
}
