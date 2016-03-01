public class PumpGasUnit3 extends PumpGasUnit{
    public PumpGasUnit3(Data d) {
        super(d);
    }
    @Override
    void PumpGasUnit() {
        ds.setL(ds.getL()+1);
    }
}
