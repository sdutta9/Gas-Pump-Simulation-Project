public class S2 extends State{
    public S2(MDA_EFSM m, OutputProcessor p) {
        super(m, p);
    }   
    @Override
    public void Approved() {
        op.SetW(1);//Calling OutputProcessor's SetW method.
        op.DisplayMenu();//Calling OutputProcessor's DisplayMenu method.
        mda.ChangeState(4);//Changing the state to point to S3
    }
    @Override
    public void Reject() {
        op.RejectMsg();//Calling OutputProcessor's SetW method.
        mda.ChangeState(1);//Changing the state to point to S0
    }    
}
