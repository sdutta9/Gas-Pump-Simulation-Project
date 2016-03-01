
public class S0 extends State{
    public S0(MDA_EFSM mda, OutputProcessor op) {
        super(mda,op);
    }
    @Override
    public void Start() {
        op.PayMsg();//Calling OutputProcessor's StoreData method.
        mda.ChangeState(2);//Changing the state to point to S1
    }
    
}
