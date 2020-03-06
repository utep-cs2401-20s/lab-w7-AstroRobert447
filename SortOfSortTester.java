import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SortOfSortTester {
	public int []board1 = 
		{1,2,6,3,9,8};
	
	public int [] board2 = 
		{3,8,10,2,9,7};
	
	public int [] board3 = 
		{1,2,6,23,9,38,22};
	
	public int [] board4 = 
		{98,8,-10,3,9,-7};
	
	public int [] board5 = 
		{8,-10,-7};
	
	@Test
	public void test1() {
		SortOfSort array = new SortOfSort(board1);
		
	}
	
	@Test
	public void test2() {
		SortOfSort array = new SortOfSort(board2);
	}
	
	@Test
	public void test3() {
		SortOfSort array = new SortOfSort(board3);
	}
	
	@Test
	public void test4() {
		SortOfSort array = new SortOfSort(board4);
	}
	
	@Test
	public void test5() {
		SortOfSort array = new SortOfSort(board5);
	}
}
