package test;

import java.io.IOException;
import java.util.ArrayList;
import org.junit.Test;

import exception.IncorrectFileFormatException;
import trains.Graph;
import trains.Route;

import static org.junit.Assert.*;

public class RouteTest {

    /**
     * Test of readFile method, of class Route.
     */
    @Test
    public void testReadFile() throws Exception {
        System.out.println("readFile");
        Route instance = new Route();
        ArrayList<Graph> expResult = new ArrayList<>();
        expResult.add(new Graph("A","B",5));
        expResult.add(new Graph("B","C",4));
        expResult.add(new Graph("C","D",8));
        expResult.add(new Graph("D","C",8));
        expResult.add(new Graph("D","E",6));
        expResult.add(new Graph("A","D",5));
        expResult.add(new Graph("C","E",2));
        expResult.add(new Graph("E","B",3));
        expResult.add(new Graph("A","E",7));
        ArrayList<Graph> result = instance.readFile();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of findRoute method, of class Route.
     */
    @Test
    public void testFindRoute() {
        System.out.println("findRoute");
        Route r = new Route();
        ArrayList<Graph> graph = null;
        try {
            graph = r.readFile();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (IncorrectFileFormatException e) {
			e.printStackTrace();
		}
        String route = "A-B-C";
        //Route instance = new Route();
        String expResult = "9";
        String result = r.findRoute(graph, route);
        assertEquals(expResult, result);
    }

    
    
}

