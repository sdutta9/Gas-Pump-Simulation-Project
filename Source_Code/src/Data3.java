public class Data3 extends Data{
    @Override
    void setTemp_A(float a) { temp_A = a;}    
    @Override
    void setTemp_B(float b) {temp_B = b;}
    @Override
    void setTemp_C(float c) {temp_C = c;}
    @Override
    float getTemp_C() { return temp_C; }
    @Override
    void set_Cash(float c) {cash = c;}
    @Override
    float get_Cash() { return cash;} 
    @Override
    void setPrice(int gastype) {
        if(gastype == 2){ //if gastype is premium
            System.out.println("\tPREMIUM GAS IS SELECTED:\n");
            price = temp_B;
        }
        else{    //if gastype is regular
            System.out.println("\tREGULAR GAS IS SELECTED:\n");
            price = temp_A;
        }
    }
    @Override
    float get_Price() { return price;}
    @Override
    void setG(int g) {}
    @Override
    int getG() { return -1; }
    @Override
    void setL(int l) { L =l;}
    @Override
    int getL() {return L;}
}
