public class StoreCash1 extends StoreCash {
    public StoreCash1(Data d) {
        super(d);
    }
    @Override
    void StoreCash() {
        int cash = ds.getTempC();
        ds.setCash(cash);
    }    
}