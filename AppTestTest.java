package Test.Java.cellpointTest.src.test.java.Test.cellpointTest;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;

import org.testng.annotations.Test;



  @Test
  
  public class AppTestTest {    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] Inputwords = {"banana", "apple", "orange", "banana"};
		  
		Collection<String> wdSet = new LinkedHashSet<String>(Arrays.asList(Inputwords));		  	      
	    System.out.println("List after short"+wdSet);      

    
    
  }
}



