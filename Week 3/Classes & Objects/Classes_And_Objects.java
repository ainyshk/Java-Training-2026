public class Classes_And_Objects {

    public static void main(String[] args) {
        Me person = new Me("Me",100);

        System.out.println(person.returnAge());
        System.out.println(person.returnName());
    }
}

class Me {
    String name;
    int age;

    public Me(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String returnName() {
        return name;
    }

    public int returnAge() {
        return age;
    }
}