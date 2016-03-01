public abstract class AbstractFactory {
    protected Data ds; //Data_Store object that store all data specific to various GasPump
    protected StoreData sd; //StoreData object which provides StoreData function.
    protected DisplayMsgs dm;//DisplayMsgs obj provides all putput related display msgs.
    protected StoreCash sc; //StoreCash obj provides method to store cash
    protected PumpGasUnit pgu;//PumpGasUnit obj provides method to calculate #of gallons pumped.
    
    abstract Data getDataObj();
    abstract StoreData getStoreDataObj();
    abstract DisplayMsgs getDisplayMsgObj();
    abstract StoreCash getStoreCashObj();
    abstract PumpGasUnit getPumpGasUnitObj();
}
