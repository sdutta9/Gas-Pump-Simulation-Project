public class PumpGasUnit2 extends PumpGasUnit{
    public PumpGasUnit2(Data d) {
        super(d);
    }
    @Override
    void PumpGasUnit() {
        ds.setG(ds.getG()+1);
    }
}
