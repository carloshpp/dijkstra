/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dijkstraimplementation.Dijkstra;
import dijkstraimplementation.Edge;
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

/**
 *
 * @author Kaike
 */
public class DijkstraTest {
    
    public DijkstraTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void ShouldSetDistanceInfinity() {
        //ARRANGE
        Vertex vertex = new Vertex();
        List<Vertex> vertices = new ArrayList<Vertex>();
        vertices.add(vertex);
        Dijkstra dijkstra = new Dijkstra();
        int infinityDistance = 9999999;
        
        //ACT
        dijkstra.setInfiniteDistance(vertices);
        
        //ASSERT
        assertEquals("Should have infinity distance", vertex.getTraveledDistance(), infinityDistance);
        
    }
    
    @Test
    public void ShouldDoDijkstra(){
    Vertex A = new Vertex(1);
        Vertex B = new Vertex(2);
        Vertex C = new Vertex(3);
        Vertex D = new Vertex(4);
        Vertex E = new Vertex(5);
        
        Edge AB = new Edge(A,B,1);
        Edge BA = new Edge(B,A,1);
        Edge AC = new Edge(A,C,5);
        Edge CA = new Edge(C,A,5);
        Edge BD = new Edge(B,D,2);
        Edge DB = new Edge(D,B,2);
        Edge CD = new Edge(C,D,2);
        Edge DC = new Edge(D,C,2);
        Edge CE = new Edge(C,E,3);
        Edge EC = new Edge(E,C,3);
        Edge DE = new Edge(D,E,1);
        Edge ED = new Edge(E,D,1);
        Edge BE = new Edge(B,E,4);
        Edge EB = new Edge(E,B,4);
        
        
        A.addEdge(AB);
        A.addEdge(AC);
        B.addEdge(BA);
        B.addEdge(BD);
        B.addEdge(BE);
        C.addEdge(CA);
        C.addEdge(CD);
        C.addEdge(CE);
        D.addEdge(DB);
        D.addEdge(DC);
        D.addEdge(DE);
        E.addEdge(EB);
        E.addEdge(EC);
        E.addEdge(ED);
        
        Graph graph = new Graph();
        graph.addVertex(A);
        graph.addVertex(B);
        graph.addVertex(C);
        graph.addVertex(D);
        graph.addVertex(E);
        
        Dijkstra dijkstra = new Dijkstra();
        Graph result = new Graph();
        result = dijkstra.doDijkstra(A, E, graph);
        
        List<Vertex> vertices = new ArrayList<Vertex>();
        vertices = result.getGraph();
        
        for(Vertex v: vertices){
            System.out.println(v.getId());
        }
        
        assertEquals("Size should be 4",4,vertices.size());
    
    
    
    }
    
}
