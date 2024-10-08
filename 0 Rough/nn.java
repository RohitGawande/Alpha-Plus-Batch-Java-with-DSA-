public class nn {
    public static float getShortestPath(String path){
        int x=0;
        int y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            if(dir=='E'){
                x++;
            }
           else if(dir=='W'){
                x--;
            }
            if(dir=='N'){
                y++;
            }
            if(dir=='S'){
                x--;
            }
        }
        int X2=x*x;
        int Y2=y*y;
        return (float)(Math.sqrt(Y2+X2));

    }
    public static void main(String[] args) {
        String path="WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}
