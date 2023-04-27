package task_2;

public class Main {
    public static void main(String[] args) {
        Device instanceD = new Device("Samsung", 120, "AB1234567CD");
        Device instanceD2 = new Device("Samsung", 120, "AB1234567CD");
        Monitor instanceM = new Monitor(1280, 1024);
        Monitor instanceM2 = new Monitor(1280, 1024);
        EthernetAdapter instanceE = new EthernetAdapter(12356, "mac");
        EthernetAdapter instanceE2 = new EthernetAdapter(12356, "mac");

        System.out.println(instanceD);
        System.out.println(instanceM);

        System.out.println(instanceD.equals(instanceD2));
        System.out.println(instanceM.equals(instanceM2));
        System.out.println(instanceE.equals(instanceE2));

        System.out.println(instanceD.hashCode());
        System.out.println(instanceM.hashCode());
        System.out.println(instanceE.hashCode());
    }
}
