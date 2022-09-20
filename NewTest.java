package rest_assured_demo;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class NewTest {
		
	 
  @Test
  public  void  pagination() {
	  	List<Character> arr = new ArrayList<>();	
	        arr.add('a');arr.add('b');arr.add('c');arr.add('d');arr.add('e');arr.add('f');
	        PaginationHelper<Character> helper = new PaginationHelper<Character>(arr, 4);
	        System.out.println(helper.pageCount());
	        System.out.println(helper.itemCount());
	        System.out.println(helper.pageItemCount(0)); //should == 4
        System.out.println(helper.pageItemCount(1)); // last page - should == 2
        System.out.println(helper.pageItemCount(2)); // should == -1 since the page is invalid
	
        // pageIndex takes an item index and returns the page that it belongs on
	
        System.out.println(helper.pageIndex(5)); //should == 1 (zero based index)
	        System.out.println(helper.pageIndex(2)); //should == 0
	        System.out.println(helper.pageIndex(20)); //should == -1
        System.out.println(helper.pageIndex(-10)); //should == -1
	    }
}
	        
	        
  

	
