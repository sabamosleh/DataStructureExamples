package recursion;

public class HanoiTower {

    public void move(int n,char from,char to ,char using){




            if(n>=2) {
                move(n - 1, from, using, to);
                System.out.println("moving disc " + n + " from " + from + " to" + to);
                move(n - 1, using, to, from);

            }
            else
                System.out.println("moving disc " + n + " from " + from + " to " + to);




    }

}
