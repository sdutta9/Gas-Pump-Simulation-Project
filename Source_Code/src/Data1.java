public class Data1 extends Data{
    @Override
    void setTempA(int a) { temp_A = a; }
    @Override
    int getTempA() { return (int)temp_A; }
    @Override
    void setPrice(int gastype) {
        if(gastype == 1)
            price = (int)temp_A;
    }    
    @Override
    int getPrice() {return (int)price; }
    @Override
    void setTempC(int c) { temp_C = c; }
    @Override
    int getTempC() { return (int) temp_C; }
    @Override
    void setCash(int c) { cash = c; }
    @Override
    int getCash() { return (int) cash; } 
    @Override
    void setG(int g) { G = g; }
    @Override
    int getG() { return G; }
    @Override
    void setL(int L) {}
    @Override
    int getL() {return -1;}
}
