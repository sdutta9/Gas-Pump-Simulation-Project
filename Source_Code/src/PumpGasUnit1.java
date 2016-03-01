public class PumpGasUnit1 extends PumpGasUnit{
    public PumpGasUnit1(Data d) {
        super(d);
    }
    @Override
    void PumpGasUnit() {
        ds.setG(ds.getG()+1);
    }
}
