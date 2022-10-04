import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Willkommen {

    private static String prefix = "Regierung: ";

    //Hier ist ein Beispiel, um diesen prefix bzw. String von anderen Klassen aufrufen zu können. Dieser muss natürlich Public sein. siehe Hallo.java
    public static String hallo = "Hallo, Java";

    public static void main(String[] args) {

        //Loop
        for (int i = 0; i < 51; i++) { //<-- Es wird ein neuer Integer erstellt, und wenn dieser kleiner als 51 ist, dann zählt er hoch!
            if (i == 51) { //<-- Wenn der Integer die Zahl 51 ist bzw erreicht hat, dann soll er stoppen
                break;
                //return; geht auch
            } else { //<--- Wenn er die Zahl 51 nicht erreicht hat, dann macht er weiter, und führt das aus was in den Klammern steht!
                System.out.println(i); //<-- gibt den endwert aus!
            }
        }
        System.out.println("Fertig!"); //<--- wenn die schleife beendet ist, dann wird das hier ausgegeben!

        //2 Integer
        int a = 5;
        int b = 3;
        int ergebniss = a+b;
        System.out.println("Die Zahlen a + b ergeben = " + ergebniss + " Simpel oder? :)");

        //HashMap
        HashMap<String, Double> teuer = new HashMap<>(); //<-- Ist eine art Liste wo gewisse Daten gespeichert werden!
        teuer.put("Super Tank", 1.60);
        HashMap<String, Integer> auchteuer = new HashMap<>();
        auchteuer.put("Kugel Eis", 5);
        System.out.println(teuer);
        System.out.println(auchteuer);

        //ArayList

        List<String> Städte = new ArrayList<>(); //<-- ist eine Liste die mehere Werte abspeichert!

        Städte.add("Bochum");
        Städte.add("Dortmund");
        Städte.add("Essen");
        Städte.add("Köln");
        Städte.add("Berlin");
        System.out.println(Städte);

        List<Integer> Zahlen = new ArrayList<>();
        Zahlen.add(1);
        Zahlen.add(2);
        Zahlen.add(3);
        Zahlen.add(4);
        Zahlen.add(5);
        Zahlen.add(6);
        Zahlen.add(7);
        Zahlen.add(8);
        Zahlen.add(9);
        Zahlen.add(10);
        System.out.println(Zahlen);

        //if abfrage ob die Liste Städte Bochum beinhält!
        //wenn dies der fall ist, dann wird dieser String von der Liste entfernt!

        if (Städte.contains("Bochum")) {
            Städte.remove("Berlin");
            System.out.println(prefix + "Wir haben Berlin entfernt!"); //<-- Prefix von oben in der Klasse!
        }
    }
}
