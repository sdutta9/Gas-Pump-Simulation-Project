
public class S1 extends State{
    public S1(MDA_EFSM mda, OutputProcessor op) {
        super(mda,op);
    }
    @Override
    public void PayCash() {
        op.SetW(0);//Calling OutputProcessor's SetW method.
        op.StoreCash(); //Calling OutputProcessor's Storecash method.
        op.DisplayMenu();//Calling OutputProcessor's DisplayMenu method.
        mda.ChangeState(4);//Changing the state to point to S3
    }
    @Override
    public void PayCredit() {
        System.out.println("\n\tWaiting for approval:\n");
        mda.ChangeState(3);//Changing the state to point to S2
    }    
}
