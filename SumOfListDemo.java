import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
public class SumOfListDemo {
    public static void main(String[] args) {
      List<Integer> list1 = Arrays.asList(1, 2, 3, 4);	
    
  	  IntSummaryStatistics stats = list1.stream()
  			     .collect(Collectors.summarizingInt(i -> i + i));

  	  System.out.println("Sum:"+stats.getSum());
    //
		List<String> list = Arrays.asList("Ram","Shyam","Shiv","Mahesh");
		String result=  list.stream().collect(Collectors.joining("-->"));
		System.out.println("Joining Result: "+ result);

    //

//2+4+6+8

        List<Integer> list2 = Arrays.asList(1,2,3,4);
        Double result1 = list2.stream().collect(Collectors.averagingInt(v->v*v));
        System.out.println("Average: "+result1);

//
        List<Integer> list3 = Arrays.asList(1,2,3,4,5,6,7,8);
        long result3=  list3.stream().collect(Collectors.counting());
        System.out.println("Count: "+ result3);
//       


   }
} 