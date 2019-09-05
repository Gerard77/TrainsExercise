package test;

import org.junit.Test;
import static org.junit.Assert.*;

import trains.Graph;

public class GraphTest {
    
    
    @Test
    public void testGetSource() {
        System.out.println("getSource");
        Graph instance = new Graph("A","B",15);
        String expResult = "A";
        String result = instance.getSource();
        assertEquals(expResult, result);
    
    }

    @Test
    public void testSetSource() {
        System.out.println("setSource");
        String Source = "D";
        Graph instance = new Graph();
        instance.setSource(Source);
        String expResult = "D";
        String result = instance.getSource();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDestination method, of class Graph.
     */
    @Test
    public void testGetDestination() {
        System.out.println("getDestination");
        Graph instance = new Graph("A","B",15);
        String expResult = "B";
        String result = instance.getDestination();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDestination method, of class Graph.
     */
    @Test
    public void testSetDestination() {
        System.out.println("setDestination");
        String Destination = "B";
        Graph instance = new Graph();
        instance.setDestination(Destination);
        String expResult = "B";
        String result = instance.getDestination();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCost method, of class Graph.
     */
    @Test
    public void testGetCost() {
        System.out.println("getCost");
        Graph instance = new Graph("A","B",15);
        int expResult = 15;
        int result = instance.getCost();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCost method, of class Graph.
     */
    @Test
    public void testSetCost() {
        System.out.println("setCost");
        int Cost = 7;
        Graph instance = new Graph();
        instance.setCost(Cost);
        int expResult = 7;
        int result = instance.getCost();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Graph.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Graph instance = new Graph("D","E",8);
        String expResult = "DE8";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}

