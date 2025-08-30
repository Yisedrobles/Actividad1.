import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> num =new ArrayList<>();

        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);

        int s = 0;
        for (int x: num) s+= x;
        System.out.println("Suma: " + s);

        int c = 0;
        for (int x : num)
            if (x % 2 == 0) c++;
        System.out.println("Cantidad de pares: " + c);


        boolean esta = false;
        for (int x : num) {
            if (x == 10) {
                esta = true;
                break;
            }
        }

        if (esta) {
            System.out.println("El número " + 10 + " está en la lista.");
        } else {
            System.out.println("El número " + 10 + " NO está en la lista.");
        }

    }
}