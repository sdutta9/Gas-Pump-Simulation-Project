public class S3 extends State{
    public S3(MDA_EFSM mda, OutputProcessor op) {
        super(mda,op);
    }
    @Override
    public void SelectGas(int g) {
        op.SetPrice(g);//Calling OutputProcessor's SetPrice method.
        mda.ChangeState(5);//Changing the state to point to S4
    }
    @Override
    public void Cancel() {
        op.CancelMsg();//Calling OutputProcessor's CancelMsg method.
        mda.ChangeState(1);//Changing the state to point to S0
    }
}
