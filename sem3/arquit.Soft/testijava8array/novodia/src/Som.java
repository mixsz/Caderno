public class Som{
    private int qntd;
    private boolean bluetooth;
    public int getQntd() {
        return qntd;
    }
    public void setQntd(int qntd) {
        this.qntd = qntd;
    }
    public boolean isBluetooth() {
        return bluetooth;
    }
    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }
    @Override
    public String toString() {
        return "Som [qntd=" + qntd + ", bluetooth=" + bluetooth + "]";
    }

    
}