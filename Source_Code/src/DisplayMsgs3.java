public class DisplayMsgs3 extends DisplayMsgs {
    public DisplayMsgs3(Data ds) {
        super(ds);
    }    
    void PayMsg() {
        System.out.println("\nPAY BY CASH:");
    } 
    @Override
    void DisplayMsg() {
        System.out.println("\n\tSELECT TYPE OF GAS");
        System.out.println("\t4. REGULAR");
        System.out.println("\t5. PREMIUM\n");
    }
    @Override
    void RejectMsg() {}
    @Override
    void GasPumpedMsg() {
        int L = ds.getL();
        System.out.println("\n\t"+L+" LITERS PUMPED\n");
    }
    @Override
    void StopMsg() {
        if(ds.W == 0){
            float cash = ds.get_Cash();
            int L = ds.getL();
            float price = ds.get_Price();
            if(cash < (L +1)*price){
                System.out.println("\n\tPUMP STOPPED - NOT SUFFICIENT AMOUNT OF CASH\n");
                System.out.println("\n\tDO YOU WANT A RECEIPT?\n");
                return;
            }
        }
        System.out.println("\n\tPUMP IS STOPPED");
        System.out.println("\tDO YOU WANT A RECEIPT?\n");
    }
    @Override
    void PrintReceipt() {
        float total = ds.get_Price() * ds.getL();
        System.out.println("\n\tRECEIPT");
        System.out.println("\t# OF LITERS: "+ds.getL());
        System.out.println("\tTOTAL: $"+total+"\n");
    }
}
