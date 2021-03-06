import java.io.*;

public class DemoReadWriteObject implements Serializable {

    String cardName;
    String cardPhase;

    public DemoReadWriteObject(String cardName, String cardPhase) {
        this.cardName = cardName;
        this.cardPhase = cardPhase;
    }

    public class WriteTest {
        DemoReadWriteObject first = new DemoReadWriteObject("The Moon (Reversed)", "Before switch");

        {
            try {
                OutputStream writeExample = new FileOutputStream(new File("testWrite.txt"));
                ObjectOutputStream writeObjectExample = new ObjectOutputStream(writeExample);
                writeObjectExample.writeObject(first);
                writeObjectExample.close();
                writeExample.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                FileInputStream readExample = new FileInputStream(new File("testWrite.txt"));
                ObjectInputStream readObjectExample = new ObjectInputStream(readExample);
                DemoReadWriteObject first = (DemoReadWriteObject) readObjectExample.readObject();
                System.out.println(first.toString());
                readObjectExample.close();
                readExample.close();

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }}




