package ps3.graph;

import java.util.*;
import junit.framework.Test;

public class Graph{
	
	/**
	* add a node into the graph graphName
	* @param nodeName, graphName 
	* @modifies a new node will be added to the graph
	* @requires the added node should not be in the graph 
	**/
	public void AddNode (graphName ,nodeName);

	

	/**
	* add an edge between parentNode and childNode
	* @param graphName, parentNode, childNode
	* @modifies a new edge will be added to the graph
	* @requires the added edge should not be in the graph 
	**/
	public void AddEdge (graphName ,parentNode ,childNode);




	/**
	* list all nodes in the graph
	* @param graphName
	* @modifies none
	**/
	public void ListNodes (graphName);




	/**
	* list all chidren nodes of the parentNode
	* @param graphName, parentNode
	* @modifies none
	**/
	public void ListChildren (graphName ,parentNode);



}






