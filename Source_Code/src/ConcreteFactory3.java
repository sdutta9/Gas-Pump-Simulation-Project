public class ConcreteFactory3 extends AbstractFactory {
    public ConcreteFactory3() {
        ds = new Data3();
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
        dm = new DisplayMsgs3(ds);
        return dm;
    }
    @Override
    StoreCash getStoreCashObj() {
        sc = new StoreCash3(ds);
        return sc;
    }
    @Override
    PumpGasUnit getPumpGasUnitObj() {
        pgu =new PumpGasUnit3(ds);
        return pgu;
    }
}

