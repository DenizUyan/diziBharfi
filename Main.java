public class Main {
    public static void main(String[] args) {

        String[][] isim = new String[7][4];

        for(int i = 0; i < isim.length; i++) {
            for (int j = 0; j < isim[i].length; j++) {

                if (i == 0 || i == 3 || i == 6) {
                    isim[i][j] = "* ";
                } else if (j == 0 || j == 3) {
                    isim[i][j] = "* ";

                } else {
                    isim[i][j] = "  ";
                }
            }
        }
                for(String[] row : isim){
                    for(String col : row){
                        System.out.print(col);
                    }
                    System.out.println();
                }



            }
        }