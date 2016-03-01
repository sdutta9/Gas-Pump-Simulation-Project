public class OutputProcessor {
    private AbstractFactory af;
    Data ds;    
    //MDA_EFSM Actions
    void StoreData(){
        StoreData sd = af.getStoreDataObj();
        sd.StoreData();
        System.out.println("\n\tGAS PUMP IS ACTIVATED\n");
    }
    void PayMsg(){ //add menu for selecting cash or credit
       DisplayMsgs dm = af.getDisplayMsgObj();
       dm.PayMsg();
    }
    void StoreCash(){
        StoreCash sc = af.getStoreCashObj();
        sc.StoreCash();
    }
    void RejectMsg(){
        DisplayMsgs dm = af.getDisplayMsgObj();
        dm.RejectMsg();
    }
    void DisplayMenu(){
        DisplayMsgs dm = af.getDisplayMsgObj();
        dm.DisplayMsg();
    }
    void CancelMsg(){
        System.out.println("\n\tTRANSACTION CANCELLED.\n");
    }    
    void SetW(int w){
        Data ds = af.getDataObj();
        ds.W =w;
    }
    void SetPrice(int g){
        Data ds = af.getDataObj();
        ds.setPrice(g);
    }
    void ReadyMsg(){
        System.out.println("\n\tSTART PUMPING:\n");
    }
    void SetInitialValues(){
        Data ds = af.getDataObj();
        ds.setG(0);
        ds.setL(0);
    }
    void PumpGasUnit(){
        PumpGasUnit pgu = af.getPumpGasUnitObj();
        pgu.PumpGasUnit();
    }
    void GasPumpedMsg(){
        DisplayMsgs dm = af.getDisplayMsgObj();
        dm.GasPumpedMsg();
    }
    void StopMsg(){
        DisplayMsgs dm = af.getDisplayMsgObj();
        dm.StopMsg();
    }
    void PrintReceipt(){
        DisplayMsgs dm = af.getDisplayMsgObj();
        dm.PrintReceipt();
    }
    void setAbstractFactory(AbstractFactory afactory){
        af = afactory;
    }
}
