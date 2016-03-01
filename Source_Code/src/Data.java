public abstract class Data {
    protected int W, G, L;
    protected float temp_A, temp_B, temp_C, cash, price;
    
    void setTempA(int a){}
    void setTemp_A(float a){}
    void setTemp_B(float b){}
    void setPrice(int gastype){}
    void setRegular(float a){}
    void setSuperOrPremium(float b){}
    int getTempA(){return -1;}
    float getTemp_A(){return -1;}
    float getTemp_B(){return -1;}
    int getPrice(){return -1; }
    float get_Price() {return -1;}
    void setTempC(int c){}
    int getTempC(){return -1;}
    void setTemp_C(float c){}
    float getTemp_C(){return -1;}    
    void setCash(int c){}
    int getCash(){return -1;}
    void set_Cash(float c){}
    float get_Cash(){return-1;}
    
    abstract void setG(int g);
    abstract int getG();
    abstract void setL(int L);
    abstract int getL();
}
