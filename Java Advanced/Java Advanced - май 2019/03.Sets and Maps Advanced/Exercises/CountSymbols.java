import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class CountSymbols {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        TreeMap<Character,Integer> symbolsCount = new TreeMap<>();

        for (int i = 0; i <line.length() ; i++) {
            char symbol = line.charAt(i);

            if (!symbolsCount.containsKey(symbol)){
                symbolsCount.put(symbol, 1);
            }else{
                symbolsCount.put(symbol, symbolsCount.get(symbol)+1);
            }
        }

        for (Map.Entry<Character, Integer> keyValuePair : symbolsCount.entrySet()) {
            System.out.printf("%c: %d time/s%n", keyValuePair.getKey(),keyValuePair.getValue());

        }


    }
}
