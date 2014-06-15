package ps3.test;
import java.util.*;
import org.junit.*;
import ps3.graph.*;


public class MyTest{
	private Graph newgraph = new Graph();


	@Before
	public void setup(){
		WeightedNode node1 = new WeightedNode(10);
		WeightedNode node2 = new WeightedNode(8);
		newgraph.addNode(node1);
		newgraph.addNode(node2);
	}


	@Test
	public void testAddNode(){
		WeightedNode new_node = new WeightedNode(6);
		newgraph.addNode(new_node);
		assertEquals(newgraph.size(), 24);
	}
	
	public void testAddEdge(){
		newgraph.addEdge(node1, node2);
		newgraph.addEdge(node1, new_node);
		newgraph.addEdge(node2, new_node);
	}
	
	public void testListNodes(){
		
	}
	
	public void testListChildren(){
	
	}
}






