package ye.practice.batch;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class practiceCollectionStream {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(){
			{
				this.add("A");
				this.add("B");
				this.add("C");
				this.add("D");
			}
		};
		List<String> strList = list.stream().filter(s -> "B".equals(s)).collect(Collectors.toList());
		System.out.println(strList);

	}

}
