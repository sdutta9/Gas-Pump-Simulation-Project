public abstract class DisplayMsgs {
    protected Data ds;
    public DisplayMsgs(Data ds) {
        this.ds = ds;
    }    
    abstract void PayMsg();
    abstract void DisplayMsg();
    abstract void RejectMsg();
    abstract void GasPumpedMsg();
    abstract void StopMsg();
    abstract void PrintReceipt();
}
