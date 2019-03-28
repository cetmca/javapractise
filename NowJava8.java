import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.*;
import java.util.HashMap;
import java.util.Map;


public class NowJava8 {

    public static void main(String[] args) {

        List<String> lines = Arrays.asList("spring", "node", "mkyong","anilal");
        List<Integer> number = Arrays.asList(10,20,3,4,50,6);

        List<String> result = lines.stream()                // convert list to stream
                .filter(line -> !"anilal".equals(line))     // we dont like mkyong
                .collect(Collectors.toList());              // collect the output and convert streams to a List

        result.forEach(System.out::println);                //output : spring, node
        Stream numbers = Stream.of(lines);
        numbers.forEach(System.out::println);
        System.out.println(sumStream(number));
//
String expectation = "this java python nodejs ruby lll";
//List<String> listOfValues = new ArrayList(<String>); 
//List<String> listOfValues = new ArrayList<String>();

List<Character> listOfValues = new ArrayList<Character>();

listOfValues.add('c');
listOfValues.add('d');
listOfValues.add('e');

List<String> items = new ArrayList<>();
	items.add("A");
	items.add("B");
	items.add("C");
	items.add("D");
	items.add("E");

	//lambda
	//Output : A,B,C,D,E
	//items.forEach(item->System.out.println(item));

    items.forEach(item->{
		if("A".equals(item)){
			//System.out.println(item);
		}
	});

    //
    

List<String> alpha = Arrays.asList("aa", "bb", "cc", "dd");
List<String> collect = alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
      //  System.out.println(collect); //[A, B, C, D]

        List<Integer> num = Arrays.asList(1,2,3,4,5);
        List<Integer> collect1 = num.stream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println(collect1); //[2, 4, 6, 8, 10]




HashMap<Character,Integer> hashmap = new    HashMap<Character,Integer>();
char c;

for (int i = 0, n = expectation.length(); i < n; i++) {
    c =  expectation.charAt(i);
    if (hashmap.containsKey(c))
    {
    int temp= hashmap.get(c);
    hashmap.put(c,++temp);
    }
    else
    {
        hashmap.put(c,1);
    }
}


Iterator it = hashmap.entrySet().iterator();
    while (it.hasNext()) {
        Map.Entry pair = (Map.Entry)it.next();
       // System.out.println(pair.getKey() + " = " + pair.getValue());
        it.remove(); // avoids a ConcurrentModificationException
    }




//



    }

//


private static int sumStream(List<Integer> list) {
	return list.stream().filter(i -> i > 10).mapToInt(i -> i).sum();
}

//


}
