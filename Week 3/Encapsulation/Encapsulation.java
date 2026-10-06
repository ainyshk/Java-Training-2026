public class Encapsulation {
    public static void main(String[] args) {
        Information person1 = new Information();
        Information person2 = new Information();

        person1.setName("John");
        person1.setGender("Male");
        person1.setAge(17);
    
        person2.setName("Zack");
        person2.setGender("Male");
        person2.setAge(300);

        System.out.println(person1.getName() + " is " + person1.getGender() + " and is " + person1.isOver21() + " over 21.");
        System.out.println(person2.getName() + " is " + person2.getGender() + " and is " + person2.isOver21() + " over 21.");
    }
}

class Information {
    private String name; // Create private variables
    private int age;
    private String gender;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isOver21() {
        if (age > 21) {
            return true;
        }
        else {
            return false;
        }
    }
}