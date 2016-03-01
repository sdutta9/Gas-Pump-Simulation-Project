public class S5 extends State{
    public S5(MDA_EFSM mda, OutputProcessor op) {
        super(mda,op);
    }
     @Override
    public void Pump() {
        op.PumpGasUnit();//Calling OutputProcessor's PumpGasUnit method.
        op.GasPumpedMsg();//Calling OutputProcessor's GasPumpedMsg method.
    }    
    @Override
    public void StopPump() {
        op.StopMsg();//Calling OutputProcessor's StopMsg method.
        mda.ChangeState(7);//Changing the state to point to S6
    }    
}
