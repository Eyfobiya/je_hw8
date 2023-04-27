package task_2;

public class Monitor extends Device{
    private int resolutionX;
    private int resolutionY;

    Monitor(int resolutionX, int resolutionY) {
        super("Samsung", 120, "AB1234567CD");
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString(){
        return String.format("Monitor: manufacturer = %s, price = %d, serialNumber = %s, X = %d, Y = %d",
                getManufacturer(), (int)getPrice(), getSerialNumber(), resolutionX, resolutionY);
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Monitor monitor = (Monitor) obj;
        if (resolutionX != monitor.resolutionX && resolutionY != monitor.resolutionY) return false;
        return true;
    }
    @Override
    public int hashCode(){
        int result = 17;
        result = 37 * result + resolutionX;
        result = 37 * result + resolutionY;
        return result;
    }
}
