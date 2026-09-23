public class Arrays {
    public static void main(String[] args) {
        String[] array = {"Controls", "Ethel Caterham", "Up-A-Crek Robotics (FRC 1619)", "Destination: Deep Space"}; // Creating an array with all the desired values

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}