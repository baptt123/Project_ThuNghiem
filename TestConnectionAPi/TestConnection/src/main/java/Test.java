import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        String URL = "https://online-gateway.ghn.vn/shiip/public-api/master-data/province";
        String TOKEN = "8e0806eb-e910-11ee-983e-5a49fc0dd8ec";
        URL url = new URL(URL);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Authorization", "Bearer "+TOKEN);
        connection.connect();
        int responsecode = connection.getResponseCode();
        if (responsecode != 200) {
            throw new RuntimeException("HttpResponseCode: " + responsecode);
        } else {

            StringBuilder informationString = new StringBuilder();
            Scanner scanner = new Scanner(url.openStream());

            while (scanner.hasNext()) {
                informationString.append(scanner.nextLine());
            }
            //Close the scanner
            scanner.close();

            System.out.println(informationString);


            //JSON simple library Setup with Maven is used to convert strings to JSON
            JsonParser jsonParser = new JsonParser();
            JsonArray dataObject = (JsonArray) jsonParser.parse(String.valueOf(informationString));

            //Get the first JSON object in the JSON array
            System.out.println(dataObject.get(0));


        }


    }
}
