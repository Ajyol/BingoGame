import java.util.Arrays;

public class Bingostuff {
    int[][] bingo = new int[5][5];
    boolean[] num = new boolean[75];

    public Bingostuff() {
        int j = 0, a = 0, b = 15;
        while (j < 5) {
            int i = 0;
            while (i < 5) {
                int z = (int) Math.random()*b+1+a;
                num[z-1] = true;
                while (num[z-1]){
                    z = (int) Math.random()*b+1+a;}
                    bingo[j][i] = z;
            }
            System.out.println();
            a += 15;
            b += 15;
            j++;
        }
        bingo[2][2] = 0;
    }
    Bingostuff(int a){
            for (int k = 0; k<5; k++){
                for(int l =0; l<5; l++){
                    if (bingo[k][l] == a){
                        bingo[k][l] = 0;
                        break;
                    }
                }
            }
        cardOut();
    }
    public void cardOut(){
        System.out.println("B\tI\tN\tG\tO");
        for (int i2 = 0; i2<5; i2++){
            for(int j2 = 0; j2<5; j2++){
                if (bingo[i2][j2]==0){
                    System.out.println("X\t");
                }else{
                    System.out.println(bingo[i2][j2]+"\t");
                }
            }
            System.out.println();
        }
    }
//    static boolean check(int[][] arr, int value){
//        if (Arrays.asList(arr).contains(value))
//            return false;
//        else
//            return true;
//        }
   }


