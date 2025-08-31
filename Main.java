import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> num =new ArrayList<>();

        num.add(1);
        num.add(68);
        num.add(50);
        num.add(0);
        num.add(3);
        num.add(80);

        int s = 0;
        for (int x: num) s+= x;
        System.out.println("Suma: " + s);

        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Sandra");
        nombres.add("Yised");
        nombres.add("Wilson");
        nombres.add("Deicy");
        nombres.add("Andres");
        nombres.add("Oliva");

        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        for (String nombre : nombres) {
            System.out.println(nombre);
        }
        int i = 0;
        while (i < nombres.size()) {
            System.out.println(nombres.get(i));
            i++;
        }
    }
}