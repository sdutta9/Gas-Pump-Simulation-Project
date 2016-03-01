public class S4 extends State{
    public S4(MDA_EFSM mda, OutputProcessor op) {
        super(mda,op);
    }
    @Override
    public void StartPump() {
        op.SetInitialValues();//Calling OutputProcessor's SetInitialValues method.
        op.ReadyMsg();//Calling OutputProcessor's ReadyMsg method.
        mda.ChangeState(6);//Changing the state to point to S5
    }   
}
