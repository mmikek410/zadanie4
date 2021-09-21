
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class JsonSimpleParser {

    private static final String TAG_NAME_MAIN = "name";
    private static final String TAG_CARDS = "cards";
    private static final String TAG_NAME = "name";
    private static final String TAG_CARD = "card";

    public Root parse() {

        Root root = new Root();

        JSONParser parser = new JSONParser();

        try(FileReader reader = new FileReader("test.json")) {

            JSONObject rootJsonObject =(JSONObject) parser.parse(reader);

            String name = (String) rootJsonObject.get(TAG_NAME_MAIN);

            JSONArray cardsJsonArray =(JSONArray) rootJsonObject.get(TAG_CARDS);

            List<cards> cardsList = new ArrayList<>();
            for(Object it: cardsJsonArray){

                JSONObject cardsJsonObject = (JSONObject) it ;

                String nameCards = (String)cardsJsonObject.get(TAG_NAME);
                long card = (Long)cardsJsonObject.get(TAG_CARD);

                cards cards = new cards(nameCards, (int) card);
                cardsList.add(cards);



            }





            root.setName(name);
            root.setcards(cardsList);





            return root;
        } catch (Exception e) {
            System.out.println("Parsing error" + e);
        }
        return null;


    }




}
