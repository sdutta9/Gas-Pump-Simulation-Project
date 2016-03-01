public class GasPump2 {
    private MDA_EFSM m;
    private Data d;
    private AbstractFactory af;

    public GasPump2(MDA_EFSM mobj) {
        m = mobj;
        af = new ConcreteFactory2();
        d=af.getDataObj();
        m.setAbstractFactory(af);
    }    
    public void Activate(float a, float b){
        if((a>0)&&(b>0)){
            d.setTemp_A(a);//Storing value of a in TempA
            d.setTemp_B(b);//Storing value of b in TempB
            m.Activate();//Calling Activate function of mda-efsm
        }
        else
            System.out.println("Price should be a positive number");
    }
    public void Start(){
        m.Start();//Calling Start function of mda-efsm
    }
    void PayCredit(){
        m.PayCredit();//Calling PayCredit function of mda-efsm
    }
    void Reject(){
        m.Reject();//Calling Reject function of mda-efsm
    }
    void Cancel(){
        m.Cancel();//Calling Cancel function of mda-efsm
    }
    void Approved(){
        m.Approved();//Calling Approved function of mda-efsm
    }
    void Super(){
        m.SelectGas(2);//Calling SelectGas function of mda-efsm
    }
    void Regular(){
        m.SelectGas(1);//Calling SelectGas function of mda-efsm
    }
    void StartPump(){
        m.StartPump();//Calling StartPump function of mda-efsm
    }
    void PumpGallon(){
        m.Pump();//Calling Pump function of mda-efsm
    }
    void StopPump(){
        m.StopPump();//Calling StopPump function of mda-efsm
        m.Receipt();//Calling Receipt function of mda-efsm
    }
}
