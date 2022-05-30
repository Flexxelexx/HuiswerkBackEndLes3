import java.util.HashMap;

public class Translator {

    HashMap<Integer, String> numericAlpha = new HashMap<Integer, String>(); {

        numericAlpha.put(1, "een");
        numericAlpha.put(2, "twee");
        numericAlpha.put(3, "drie");
        numericAlpha.put(4, "vier");
        numericAlpha.put(5, "vijf");
        numericAlpha.put(6, "zes");
        numericAlpha.put(7, "zeven");
        numericAlpha.put(8, "acht");
        numericAlpha.put(9, "negen");
        numericAlpha.put(0, "nul");
    }


    public Translator(String[] alphabetic, Integer[] numeric) {


        for (int i = 0; i < alphabetic.length; i++) {

            numericAlpha.put(numeric[i], alphabetic[i]);

            System.out.println(alphabetic[i]);
        }
    }

    public String translate(Integer number) {
        return numericAlpha.get(number);
    }


}

