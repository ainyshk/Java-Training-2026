public class Inheritance {
    public static void main(String[] args) {

    }
}
class Parent {
    String last_name; // Initializing last_name variables
    String eye_color;

    public Parent(String last_name, String eye_color) { // Create DefineVariables constructor to set the last_name and eye_color variables
        this.last_name = last_name; // Setting variables to new values
        this.eye_color = eye_color;
    }

    public String getLastName() { // Return last name using a method
        return last_name;
    }
}

class Child extends Parent { // Create child class
    String first_name; // Initiallizing variables

    public Child(String first_name, String last_name, String eye_color) { // Creating constuctor to define variables
        super(last_name, eye_color);
        this.first_name = first_name;
    }

    public String getFullName() { // Return full name method
        return (first_name + " " + super.getLastName());
    }

    public String getEyeColor() { // Return eye color method
        return super.eye_color;
    }
}