package task_5;
/** Створити клас Animal з ім'ям String, int віком, хвостом Boolean.
 * У класі перевизначити метод toString, щоб висновок був наступним «Ім'я: Васька, вік: 45, хвіст: ні».
 * У класі Animal перевизначити методи equals & hashCode.
 */
public class Animal {
    private String name;
    private int age;
    private boolean tail;
    public Animal(String name, int age, boolean tail) {
        this.name = name;
        this.age = age;
        this.tail = tail;
    }
    @Override
    public String toString(){
        return String.format("Ім'я: %s, вік: %d, хвіст: ні", name, age);
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Animal animal = (Animal) obj;
        if ((!name.equals(animal.name)) && (age != animal.age) && (tail != animal.tail)) return false;
        return true;
    }
    @Override
    public int hashCode(){
        int result = 17;
        result = 37 * result + (name == null ? 0 : name.hashCode());
        result = 37 * result + age;
        result = 37 * result + (tail ? 1 : 0);
        return result;
    }
}
class Main{
    public static void main(String[] args) {
        Animal animal1 = new Animal("Васька", 45, true);
        Animal animal2 = new Animal("Васька", 45, true);
        System.out.println(animal1);
        System.out.println(animal1.equals(animal2));
        System.out.println(animal1.hashCode());
    }
}
