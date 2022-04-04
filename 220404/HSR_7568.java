import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HSR_7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Info[] info = new Info[k];
        int[] rank = new int[k];
        for (int i = 0; i < k; i++) {
            rank[i] = 1;
        }
        int max = 1;
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            info[i] = new Info();
            info[i].setWeight(Integer.parseInt(st.nextToken()));
            info[i].setTall(Integer.parseInt(st.nextToken()));

        }

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                if(info[i].getWeight() > info[j].getWeight() &&
                        info[i].getTall() > info[j].getTall()) {
                    info[i].setBigger(info[i].getBigger()+1);
                }
            }
        }

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                if(info[i].getBigger() < info[j].getBigger()){
                    rank[i]++;
                }
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.print(info[i].getBigger() +" ");
        }
        System.out.println();
        for (int i = 0; i < k; i++) {
            System.out.print(rank[i] +" ");
        }


    }
}
class Info{
    private int weight;
    private int tall;
    private int bigger;

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public int getTall() {
        return tall;
    }

    public void setTall(int tall) {
        this.tall = tall;
    }

    public int getBigger() {
        return bigger;
    }

    public void setBigger(int bigger) {
        this.bigger = bigger;
    }
}
