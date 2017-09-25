package ye.practice.batch;

import java.util.ArrayList;
import java.util.List;

public class practiceLambdaBatch {
	public static void main(String[] args){
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.removeIf(s -> "C".equals(s));
		System.out.println(list);
	}
}
