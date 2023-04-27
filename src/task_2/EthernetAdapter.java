package task_2;

public class EthernetAdapter extends Device{
    private int speed;
    private String mac;
    public EthernetAdapter( int speed, String mac) {
        this.speed = speed;
        this.mac = mac;
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        EthernetAdapter adapter = (EthernetAdapter) obj;
        if (speed != adapter.speed && !mac.equals(adapter.mac)) return false;
        return true;
    }
    @Override
    public int hashCode(){
        int result = 17;
        result = 37 * result + speed;
        result = 37 * result + (mac == null ? 0 : mac.hashCode());
        return result;
    }
}
