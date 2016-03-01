public class ConcreteFactory2 extends AbstractFactory {
    public ConcreteFactory2() {
        ds = new Data2();
    }
    @Override
    Data getDataObj() {
        return ds;
    }    
    @Override
    StoreData getStoreDataObj() {
        sd = new StoreData2(ds);
        return this.sd;
    }
    @Override
    DisplayMsgs getDisplayMsgObj() {
        dm = new DisplayMsgs2(ds);
        return dm;
    }
    @Override
    StoreCash getStoreCashObj() {
        sc = new StoreCash2(ds);
        return sc;
    }
    @Override
    PumpGasUnit getPumpGasUnitObj() {
        pgu =new PumpGasUnit2(ds);
        return pgu;
    }
}
