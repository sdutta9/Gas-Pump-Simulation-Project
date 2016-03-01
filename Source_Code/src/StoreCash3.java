public class StoreCash3 extends StoreCash {
    public StoreCash3(Data d) {
        super(d);
    }
    @Override
    void StoreCash() {
        float cash = ds.getTemp_C();
        ds.set_Cash(cash);
    }     
}
