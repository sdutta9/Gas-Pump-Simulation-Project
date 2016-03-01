public class StoreData1 extends StoreData{
    public StoreData1(Data d) {
        super(d);
    }    
    @Override
    void StoreData() {
        int price = ds.getTempA();
        ds.setPrice(price);
    }   
}
