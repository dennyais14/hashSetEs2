import java.util.HashSet;

//Scrivere una funzione che restituisca un hashset riempito
//Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
//Verificare che l'elemento sia parte del Set e stampare il risultato
public class Main {
    public static void main(String[] args) {
        //Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
        Frutta fruit1 = new Frutta("mela");
        checkElement(readFruitSet(), fruit1);
    }
    //Scrivere una funzione che restituisca un hashset riempito
    public static HashSet<String> readFruitSet(){
        HashSet<String> fruitSet = new HashSet<>();
        fruitSet.add("mela");
        fruitSet.add("pera");
        fruitSet.add("pesca");
        fruitSet.add("fragola");
        fruitSet.add("lampone");
        fruitSet.add("mirtillo");
        return fruitSet;
    }

    public static void checkElement(HashSet<String> readFruitSet, Frutta fruit1){
        if (readFruitSet.contains(fruit1.text1)) {
            System.out.println("elemento parte del Set");
        }
        else {
            System.out.println("elemento NON parte del Set");
        }
    }
}