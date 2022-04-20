import java.util.Scanner;

public class DikUcgendeHipotenusBulanProgram {
    public static void main(String[] args) {
        System.out.println("Dik ucgenin kenarlarini sirasiyla yaziniz.");
        Scanner input= new Scanner(System.in);
        double dikKenar,dikKenar2,hipotenus;
        dikKenar=input.nextDouble();
        dikKenar2=input.nextDouble();
        hipotenus=Math.sqrt(dikKenar*dikKenar+dikKenar2*dikKenar2);
        System.out.println("Hipotenus:"+hipotenus);

    }
}
