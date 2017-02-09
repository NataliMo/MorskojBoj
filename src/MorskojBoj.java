import java.util.Scanner;


public class MorskojBoj {
    private int pole1[][]= {
            {0,0,0,0,0,0,0,0,0,0},
            {0,4,4,4,4,0,0,0,0,0},
            {0,0,0,0,0,0,3,3,3,0},
            {0,3,3,3,0,0,0,0,0,0},
            {0,0,0,0,0,2,2,0,0,0},
            {0,1,0,0,0,0,0,0,2,2},
            {0,0,0,0,0,0,0,0,0,0},
            {0,1,0,0,0,2,2,0,0,0},
            {0,0,0,0,0,0,0,0,1,0},
            {0,1,0,0,0,0,0,0,0,0}
    };
    private int pole2[][]= {
            {1,0,0,0,0,0,0,2,2,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,3,3,3,0,0,0,1,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,2,2,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {2,2,0,0,0,3,3,3,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,4,4,4,4,0,0,0,0,1},
            {0,0,0,1,0,0,0,0,0,0}
    };

    MorskojBoj () {
        //pole1 = new int[10][10];
        //pole2 = new int[10][10];
        System.out.println("Заполнение поля первым игроком");
        //pole1= inputPole(pole1);
        print(pole1);
        System.out.println("Заполнение поля вторым игроком");
        //pole2= inputPole(pole2);
        print(pole2);
        game();



    }
    public void print(int pole[][]) {
        char simvol = 'а';
        System.out.println("  1 2 3 4 5 6 7 8 9 10");
        for (int i=0;i<pole.length;i++) {
            System.out.print(simvol+" ");
            simvol++;
            if (simvol == 'й')
                simvol++;
            for (int j=0;j<pole[i].length;j++)
                System.out.print(pole[i][j]+" ");
            System.out.println(" ");
        }

    }

    public int[][] inputPole(int pole[][]) {
        Scanner scan = new Scanner(System.in);
        for (int i=4;i>=1;i--) {
            System.out.println("Введите координаты корабля "+ i +" палубы");
            for (int j=i;j<=4;j++) {
                print(pole);
                for (int l = 1; l <= i; l++) {
                    System.out.println("Введите " + l + "-ую координату");
                    int y;
                    char x;
                    String k=scan.next();
                    x = k.charAt(0);
                    int q=0;
                    q=x-'а';
                    if (q==10)
                        q--;
                    if(k.length()==3)
                        y=9;
                    else
                        y = k.charAt(1)-'1';
                   pole[q][y] = i;
                    /*for (int z=1072;z<=1082;z++) {
                        if (x == z)
                            break;
                        q++;
                        if (z == 1081)
                            q--;
                    }
                    */
                }

            }

        }
        return pole;
    }

    public void game() {
        print2();
    }

    public void print2() {
        System.out.println("  1 2 3 4 5 6 7 8 9 10       1 2 3 4 5 6 7 8 9 10" );
        char simvol = 'а';
        for (int i=0;i<pole1.length;i++) {
            System.out.print(simvol+" ");
            simvol++;
            if (simvol == 'й')
                simvol++;
            for (int j=0;j<pole1[i].length;j++)
                System.out.print(pole1[i][j]+" ");
            /* часть кода закомментирована выводит второе поле
            System.out.print("     "+simvol+" ");
            for (int j=0;j<pole2[i].length;j++)
                System.out.print(pole2[i][j]+" ");
            System.out.println(" ");
            */
            System.out.print("     "+simvol+" ");
            for (int j=0;j<pole2[i].length;j++)
                System.out.print("*" + " ");

            System.out.println(" ");

        }


    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        MorskojBoj game = new MorskojBoj();

        System.out.println("сделайте ваш ход");
        char x;
        int y;
        String k=scan.next();
        x = k.charAt(0);
        int q=0;
        y = scan.nextInt();
        q=x-'а';
        if (q==10)
            q--;
        System.out.println(q+ " "+ y);
        



    }
}
