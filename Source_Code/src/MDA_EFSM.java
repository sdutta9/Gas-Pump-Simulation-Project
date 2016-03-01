public class MDA_EFSM {
    private State[] s = new State[8];
    private State sobj;
    private OutputProcessor op;
    public MDA_EFSM() {
        op = new OutputProcessor();
        s[0] = new Start(this, op);
        s[1] = new S0(this, op);
        s[2] = new S1(this, op);
        s[3] = new S2(this, op);
        s[4] = new S3(this, op);
        s[5] = new S4(this, op);
        s[6] = new S5(this, op);
        s[7] = new S6(this, op);
        sobj=s[0]; 
    }
    
    //MDA_EFSM Events
    void Activate(){ sobj.Activate(); }
    void Start(){ sobj.Start(); }
    void PayCredit(){ sobj.PayCredit(); }
    void PayCash(){ sobj.PayCash(); }
    void Reject(){ sobj.Reject(); }
    void Cancel(){ sobj.Cancel(); }
    void Approved(){ sobj.Approved(); }
    void StartPump(){ sobj.StartPump(); }
    void Pump(){ sobj.Pump(); }
    void StopPump(){ sobj.StopPump(); }
    void SelectGas(int g){ sobj.SelectGas(g); }
    void Receipt(){ sobj.Receipt(); }
    void NoReceipt(){ sobj.NoReceipt(); }
    void ChangeState(int i){
        sobj=s[i];// changes state as per value of i
    }
    void setAbstractFactory(AbstractFactory af){
        op.setAbstractFactory(af);
    }
}
