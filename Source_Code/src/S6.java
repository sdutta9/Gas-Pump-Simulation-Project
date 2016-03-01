public class S6 extends State{
    public S6(MDA_EFSM mda, OutputProcessor op) {
        super(mda,op);
    }
    @Override
    public void NoReceipt() {
        System.out.println("\n\tNO RECEIPT:\n");
        mda.ChangeState(1);//Changing the state to point to S0
    }
    @Override
    public void Receipt() {
        op.PrintReceipt();//Calling OutputProcessor's PrintReceipt method.
        mda.ChangeState(1);//Changing the state to point to S0
    }    
}
