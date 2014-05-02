

import dijkstraimplementation.Graph;
import dijkstraimplementation.Vertex;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class GraphTest {
    
    public GraphTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

 
    @Test
    public void ShouldSortGraph() {
        //ARRANGE
        Graph graph = new Graph();
        Vertex firstVertex = new Vertex();
        firstVertex.setTraveledDistance(1);
        firstVertex.setId(1);
        
        Vertex secondVertex = new Vertex();
        secondVertex.setTraveledDistance(2);
        secondVertex.setId(2);
        
        Vertex thirdVertex = new Vertex();
        thirdVertex.setTraveledDistance(3);
        thirdVertex.setId(3);
        
        graph.addVertex(secondVertex);
        graph.addVertex(thirdVertex);
        graph.addVertex(firstVertex);
        
        //ACT
        graph.orderByTraveledDistance();
    
        
        //ASSERT
        assertSame("Should be ordered",firstVertex, graph.getGraph().get(0));
        
        
    }
    
    @Test
    public void ShouldRemoveVertex(){
        //ARRANGE
        Graph graph = new Graph();
        Vertex firstVertex = new Vertex();
        firstVertex.setTraveledDistance(1);
        firstVertex.setId(1);
        
        graph.addVertex(firstVertex);
        
        //ACT
        graph.removeVertex(firstVertex);
        List<Vertex> vertices = new ArrayList<Vertex>();
        vertices = graph.getGraph();
        
        //ASSERT
        assertSame("Should the graph be empty",0, vertices.size());
    
    
    }
    
    
    
}
