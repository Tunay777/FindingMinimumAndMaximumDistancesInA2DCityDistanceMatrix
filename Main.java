public class Main {
    public static void main(String[] args) {
        int [][]cityDistances={ { 0, 455, 480, 694}, {455, 0, 587, 475}, {480, 587, 0, 457}, {694, 475, 457, 0} };
        int minDistCalc=minDistance(cityDistances);
        int maxDistCalc=maxDistance(cityDistances);
        System.out.println("Minimum distance is: "+minDistCalc);
        System.out.println("Maximum distance is: "+maxDistCalc);
    }
    public static int minDistance (int distance2D[][]){
        int minDist=distance2D[0][1];
        int i=0;
        while (i<distance2D.length){
            int j=i+1;
            while(j<distance2D[i].length){
                if(distance2D[i][j]<minDist)
                    minDist=distance2D[i][j];
                j++;
            }
            i++;
        }
        return minDist;
    }
    public static int maxDistance (int distance2D[][]){
        int maxDist=distance2D[0][1];
        int i=0;
        while (i<distance2D.length){
            int j=i+1;
            while(j<distance2D[i].length){
                if(distance2D[i][j]>maxDist)
                    maxDist=distance2D[i][j];
                j++;
            }
            i++;
        }
        return maxDist;
    }
    }
