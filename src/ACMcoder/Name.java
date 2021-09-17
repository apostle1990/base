package ACMcoder;

import java.util.*;

public class Name {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int len = input.nextInt();
        Map<String, Integer> hashMap = new TreeMap<String, Integer>();
        String name =null;
        int x,y,score;
        for (int i=0; i<len; i++){
            name = input.next();
            x = input.nextInt();
            y = input.nextInt();
            score = score(x,y);
            hashMap.put(name,score);
        }
        String[] strings = hashMap.keySet().toArray(new String[0]);
        String str =null;
        for (int i=0; i<len; i++){
            str =strings[i];
            System.out.println(str +" "+ hashMap.get(str));
        }
    }

    public static int score(int x, int y){
        float score = (float) y/x;
        if (0.0<=score && score<=0.3) return 5;
        if (0.3<score && score<=0.6) return 4;
        if (0.6<score && score<=1.0) return 3;
        else return 0;
    }
}
