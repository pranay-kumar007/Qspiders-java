public class Pattern5 {
    public static void main(String[] args) {
        for(int i = 1; i<=7;i++){
            if (i<3) {
                int j = 0;
                for(;j<3-i;j++){
                    System.out.print("  ");
                }
                for(;j<3;j++){
                    System.out.print("* ");
                }
            }
            if(i == 3){
                for(int j = 0;j<i;j++){
                    System.out.print("* ");
                }
                for(int j = i;j<2*i;j++){
                    System.out.print("e ");
                }
                for(int j = 2*i;j<3*i;j++){
                    System.out.print("* ");

                }
                for(int j = 3*i;j<4*i;j++){
                    System.out.print("  ");
                }
                System.out.println("* ");
            }
            if (i == 4) {
                System.out.println("  ");
                for(int j = 0;j<2;j++)
                    System.out.println("* ");
                for(int j = 3;j<2*3;j++){
                    System.out.println("  ");
                }
                for(int j = 2*3;j<3*3;j++){
                    System.out.println("* ");
                }
                for(int j = 3*3;j<4*3;j++){
                    System.out.println("  ");
                }
                System.out.println("  ");
                for(int j = 4*3+1;j<5*3;j++){
                    System.err.println("* ");
                }

            }
            System.out.println();
            
        }
    }
}
