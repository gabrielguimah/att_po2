import java.util.ArrayList;
import java.util.List;

public class WorkList {
    public List<String> ListCount(){
        List<String> list = new ArrayList<>();
        for(int i = 1; i < 11; i++){
            list.add("" + i);
        }
        return list;
    }
}
