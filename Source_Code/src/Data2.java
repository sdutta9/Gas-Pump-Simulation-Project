public class Data2 extends Data{
    @Override
    void setTemp_A(float a) {temp_A = a;}    
    @Override
    void setTemp_B(float b) {temp_B = b;}
    @Override
    void setPrice(int gastype) {
        if(gastype == 2){ //if gastype is super
            price = temp_B;
            System.out.println("\tSUPER GAS IS SELECTED:\n");
        }
        else{    //if gastype is regular
            price = temp_A;
            System.out.println("\tREGULAR GAS IS SELECTED:\n");
        }
    }
    @Override
    float get_Price() {return price;}
    @Override
    void setG(int g) {G = g;}
    @Override
    int getG() { return G; }
    @Override
    void setL(int L) {}
    @Override
    int getL() {return -1;}
}
