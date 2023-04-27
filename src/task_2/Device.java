package task_2;
/**Створити класи:
 * 1) Основний клас Device (manufacturer(String), price(float), serialNumber(String));
 * 2) Сабклас Monitor (resolutionX(int), resolutionY(int)) і EthernetAdapter (speed(int), mac(String));
 * Додати методи доступу. Конструктор.
 * В обох класах перевизначити метод toString, щоб виведення було наступним:
 * Device: manufacturer =Samsung, price=120, serialNumber=AB1234567CD
 * Monitor: manufacturer =Samsung, price=120, serialNumber=AB1234567CD, X=1280, Y=1024
 * Перевизначити методи equals & hashCode у кожному класі.
 * Створити клас Main, де створити об'єкти класів і продемонструвати перевизначені методи.
 */
public class Device {
   private String manufacturer;
   private float price;
   private String serialNumber;
    public Device() {}
    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public float getPrice() {
        return price;
    }
    public String getSerialNumber() {
        return serialNumber;
    }
    @Override
    public String toString(){
        return String.format("Device: manufacturer = %s, price = %s, serialNumber = %s",
                manufacturer, (int)price, serialNumber);
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Device device = (Device) obj;
        if (!manufacturer.equals(device.manufacturer) && price != device.price &&
                !serialNumber.equals(device.serialNumber)) return false;
        return true;
    }
    @Override
    public int hashCode(){
        int result = 17;
        result = 37 * result + (manufacturer == null ? 0 : manufacturer.hashCode());
        result = 37 * result + Float.floatToIntBits(price);
        result = 37 * result + (serialNumber == null ? 0 : serialNumber.hashCode());
        return result;
    }
}
