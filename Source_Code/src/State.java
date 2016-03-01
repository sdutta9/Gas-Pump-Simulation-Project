
public abstract class State {
    protected OutputProcessor op;
    protected MDA_EFSM mda;

    public State(MDA_EFSM m, OutputProcessor p) {
        mda = m;
        op = p;
    }
    public void Activate(){}
    public void Start(){}
    public void PayCredit(){}
    public void PayCash(){}
    public void Reject(){}
    public void Cancel(){}
    public void Approved(){}
    public void StartPump(){}
    public void Pump(){}
    public void StopPump(){}
    public void SelectGas(int g){}
    public void Receipt(){}
    public void NoReceipt(){}
}
