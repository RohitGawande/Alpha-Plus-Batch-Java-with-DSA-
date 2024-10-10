//Given a route containing 4 direction(E,W,N,S),
//find the Shortest path to reach destination
public class Q2 {                                         //          N
    public static float  getShortestPath(String path) {   //          |
        int x=0,y=0;                                      //          |
        for(int i=0;i<path.length();i++){                 //          |
            char dir=path.charAt(i);                      // W -------|------- E
                                                          //          |
                                                          //          |
                                                          //          |
                                                          //          S
            //S
            if(dir=='S'){
                y--;
            }
            else if(dir=='N'){
                y++;
            }
            else if(dir=='E'){
                x++;
            }
            else if(dir=='W'){
                x--;
            }
        }
        int x2=x*x,y2=y*y;
        return (float)Math.sqrt(y2+x2);
    }
    public static void main(String[] args) {
        //Given a route containing four direction (E,W,N,S),find the shortest path to reach destination.
       // "WNEENESENN"
       String path="WNEENESENNN";
    System.out.println(getShortestPath(path));
    }
}
