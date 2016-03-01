public class ConcreteFactory1 extends AbstractFactory {
    public ConcreteFactory1() {
        ds = new Data1();
    }
    @Override
    Data getDataObj() {
        return ds;
    }    
    @Override
    StoreData getStoreDataObj() {
        sd = new StoreData1(ds);
        return this.sd;
    }
    @Override
    DisplayMsgs getDisplayMsgObj() {
        dm = new DisplayMsgs1(ds);
        return dm;
    }
    @Override
    StoreCash getStoreCashObj() {
        sc = new StoreCash1(ds);
        return sc;
    }
    @Override
    PumpGasUnit getPumpGasUnitObj() {
        pgu =new PumpGasUnit1(ds);
        return pgu;
    }
}
