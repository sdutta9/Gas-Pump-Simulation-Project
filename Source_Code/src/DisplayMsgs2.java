public class DisplayMsgs2 extends DisplayMsgs {
    public DisplayMsgs2(Data ds) {
        super(ds);
    }    
    void PayMsg() {
        System.out.println("\n\tPAY BY CREDIT:\n");
    }
    @Override
    void DisplayMsg() {
        System.out.println("\n\tSELECT TYPE OF GAS");
        System.out.println("\t6. REGULAR");
        System.out.println("\t7. SUPER\n");
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
       System.out.println("\n\tPUMP IS STOPPED\n");
    }
    @Override
    void PrintReceipt() {
        float total = ds.get_Price() * ds.getG();
        System.out.println("\n\tRECEIPT");
        System.out.println("\t# OF GALLONS: "+ds.getG());
        System.out.println("\tTOTAL: $"+total+"\n");
    }
}
