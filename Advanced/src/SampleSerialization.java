import java.io.*;

public class SampleSerialization {
    public static void main(String[] args) {
        class Employee implements Serializable {
            String name;
            String address;
            transient int SSN;
            int number;

            void mailCheck() {
                System.out.println("Mailing a check to " + name + " " + address);
            }
        }

        Employee e = new Employee();
        e.name = "Tom";
        e.address = "Beijing";
        e.SSN = 100;
        e.number = 111;

        try {
            FileOutputStream fileOut = new FileOutputStream("employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();

            FileInputStream fileIn = new FileInputStream("employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Employee serE = (Employee) in.readObject();
            in.close();
            fileIn.close();
            System.out.print(serE.name + " " + serE.address + " " + serE.SSN + " " + serE.number);
        } catch (IOException | ClassNotFoundException i) {
            i.printStackTrace();
        }
    }
}
