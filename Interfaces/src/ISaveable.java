
import java.util.List;

//this interface allows for object to be saved to some sort of storage medium
//only needs 2 methods one to return array list of values to be saved and one to populate the objects fields in the
//arraylist
public interface ISaveable {
    List<String> write();

    void read(List<String> savedValues);

}
