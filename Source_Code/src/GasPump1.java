public class GasPump1 {
    private MDA_EFSM m;
    private Data d;
    private AbstractFactory af;

    public GasPump1(MDA_EFSM mobj) {
        m = mobj;
        af = new ConcreteFactory1();
        d=af.getDataObj();
        m.setAbstractFactory(af);
    }    
    void Activate(int a){
        if(a>0){
            d.setTempA(a); //Storing value of a in TempA 
            m.Activate(); //Calling activate function of mda-efsm
        }
        else
            System.out.print("Price should be a positive number");            
    }    
    void Start(){
        m.Start();//Calling Start function of mda-efsm
    } 
    void PayCredit(){
        m.PayCredit();//Calling PayCredit function of mda-efsm
    }
    void PayCash(int c){
        if(c>0){
            d.setTempC(c);//Storing value of c in TempC
            m.PayCash();//Calling PayCash function of mda-efsm
        }
        else System.out.print("Cash amount should be a positive number");            
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
    void StartPump(){
        m.SelectGas(1);//Calling SelectGas function of mda-efsm
        m.StartPump();//Calling StartPump function of mda-efsm
    }
    void PumpGallon(){
        if(d.W == 1)
            m.Pump();//Calling Pump function of mda-efsm
        else{
            int cash = d.getCash();//Getting Cash value from DataStore
            int G = d.getG();//Getting # of Gallons from DataStore
            int price = d.getPrice();//Getting price per Gallon from DataStore
            if(cash < (G +1)*price){
                m.StopPump();//Calling StopPump function of mda-efsm
                m.Receipt();//Calling Receipt function of mda-efsm
            }
            else
                m.Pump();//Calling Pump function of mda-efsm
        }
    }
    void StopPump(){
        m.StopPump();//Calling StopPump function of mda-efsm
        m.Receipt();//Calling Receipt function of mda-efsm
    }
}
