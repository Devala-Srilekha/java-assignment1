package omniwyse.Assignments;
import java.util.ArrayList;
import java.util.List;
public class Assign2Prgm2 {
	public static List<String> reverseList(List<String> list) {

		ArrayList<String> reverseList = new ArrayList<String>();
		for (int i = list.size() - 1; i >= 0; i--) {
			reverseList.add(list.get(i));
		}
		return reverseList;
	}

}


