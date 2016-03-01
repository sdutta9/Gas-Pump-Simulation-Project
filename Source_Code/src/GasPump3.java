public class GasPump3 {
    private MDA_EFSM m;
    private Data d;
    private AbstractFactory af;
    
    public GasPump3(MDA_EFSM mobj) {
        m = mobj;
        af = new ConcreteFactory3();
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
            System.out.println("\tPrice should be a positive number");
    }
    public void Start(){
        m.Start();//Calling Start function of mda-efsm
    }
    void PayCash(float c){
        if(c>0){
            d.setTemp_C(c);//Storing value of c in TempC
            m.PayCash();//Calling PayCash function of mda-efsm
        }
        else System.out.print("Cash amount should be a positive number");            
    }
    void Cancel(){
        m.Cancel();//Calling Cancel function of mda-efsm
    }
    void Premium(){
        m.SelectGas(2);//Calling SelectGas function of mda-efsm
    }
    void Regular(){
        m.SelectGas(1);//Calling SelectGas function of mda-efsm
    }
    void StartPump(){
        m.StartPump();//Calling StartPump function of mda-efsm
    }
    void PumpLiter(){
        float cash = d.get_Cash();//Getting Cash value from DataStore
        int L = d.getL();//Getting # of Liters from DataStore
        float price = d.get_Price();//Getting price per Gallon from DataStore
        if(cash < (L +1)*price)
                m.StopPump();//Calling StopPump function of mda-efsm
        else            m.Pump();//Calling Pump function of mda-efsm
    }
    void StopPump(){
        m.StopPump();//Calling StopPump function of mda-efsm
    }
    void Receipt(){
        m.Receipt();//Calling Receipt function of mda-efsm
    }
    void NoReceipt(){
        m.NoReceipt();//Calling NoReceipt function of mda-efsm
    }
}
