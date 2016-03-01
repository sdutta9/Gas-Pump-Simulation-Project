public class StoreData2 extends StoreData{
    public StoreData2(Data d) {
        super(d);
    }    
    @Override
    void StoreData() {
        float regular = ds.getTemp_A();
        ds.setRegular(regular);
        float superorpremium = ds.getTemp_B();
        ds.setSuperOrPremium(superorpremium);
    }    
}
