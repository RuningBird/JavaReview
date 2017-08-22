/**
 * Created by hr on 2017/8/22.
 */

import java.util.*;

class Programer {
    int ftime = 0;
    boolean busy = false;
//    public isBusy(Idea p;){
//
//    }
}

class Idea implements Comparable {
    int id;
    int postTime;
    int lv;
    int needTime;
    boolean busy = false;

    public Idea(int id, int pt, int lv, int nt) {
        this.id = id;
        this.postTime = pt;
        this.lv = lv;
        this.needTime = nt;
    }

    @Override
    public int compareTo(Object obj) {
        Idea b = (Idea) obj;

        if (this.lv > b.lv) {
            return 1;
        } else if (this.lv == b.lv) {
            if (this.needTime >= b.needTime)
                return 1;
            else {
                return -1;
            }
        } else {
            return -1;
        }
    }
}

public class PM {
    /**
     * 1，首先实现优先级高的
     * 2，相同优先级，所需时间少的
     * N：PM数量
     * M：程序员数量
     * P：idea数量
     * 输入：
     * 2 2 5 //N,M,P
     * 1 1 1 2 //PM序号，提出时间，优先等级，所需时间
     * 1 2 1 1
     * 1 3 2 2
     * 2 1 1 2
     */
    public static void job() {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String[] nmp = s.split(" ");
        System.out.println(s);

        int N = Integer.parseInt(nmp[0]);
        int M = Integer.parseInt(nmp[1]);
        int P = Integer.parseInt(nmp[2]);

        List<Idea> idaList = new ArrayList<Idea>();
        for (int i = 0; i < P; i++) {
            String record = sc.nextLine();
            String[] arrString = record.split(" ");

            int id = Integer.parseInt(arrString[0]);
            int pt = Integer.parseInt(arrString[1]);
            int lv = Integer.parseInt(arrString[2]);
            int nt = Integer.parseInt(arrString[3]);

            Idea tmp = new Idea(id, pt, lv, nt);
            idaList.add(tmp);
        }

        List<Programer> pList = new ArrayList<Programer>();
        for (int i = 0; i < M; i++) {
            pList.add(new Programer());
        }
        showJob(idaList, pList);
    }

    public static void showJob(List<Idea> il, List<Programer> pl) {
        int newTime = 0;
        Collections.sort(il);
        while (!il.isEmpty()) {
            for (Programer p : pl) {
                if (!p.busy) {
                    Idea rec = il.get(0);
                    il.remove(rec);
                    newTime = rec.postTime;
                    System.out.println(rec.id + " " + newTime);
                    newTime += rec.needTime;
                    p.busy = true;
                }
            }
        }
    }
}
