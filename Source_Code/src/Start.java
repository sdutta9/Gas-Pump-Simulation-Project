
public class Start extends State {

    public Start(MDA_EFSM mda, OutputProcessor op) {
        super(mda,op);
    }
    
    @Override
    public void Activate() {
      op.StoreData(); //Calling OutputProcessor's StoreData method.
      mda.ChangeState(1); //Changing the state to point to S0
    }    
}
