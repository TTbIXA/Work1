import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        List<Stream> streams = new ArrayList<>();

        Stream stream1 = new Stream();
        stream1.addGroup(new StudyGroup("Group A"));
        stream1.addGroup(new StudyGroup("Group B"));

        Stream stream2 = new Stream();
        stream2.addGroup(new StudyGroup("Group C"));

        streams.add(stream1);
        streams.add(stream2);

        System.out.println("Before sorting:");
        System.out.println("Stream 1 groups count:" + stream1.getGroups().size());
        System.out.println("Stream 2 groups count:" + stream2.getGroups().size());

        controller.sortStreams(streams);

        System.out.println("\nAfter sorting:");
        for (Stream stream : streams){
            System.out.println("Stream groups count: " + stream.getGroups().size());
        }
    }
}