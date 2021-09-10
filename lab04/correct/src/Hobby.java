import java.util.ArrayList;
import java.util.List;

public class Hobby {

    List<String> hobbies = new ArrayList<String>();

    int addHobby(String hobby) {
        hobbies.add(hobby);
        return hobbies.size();
    }
}
