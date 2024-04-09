import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {
        String URL = "https://online-gateway.ghn.vn/shiip/public-api/master-data/district";
        String TOKEN = "8e0806eb-e910-11ee-983e-5a49fc0dd8ec";
        String province_id = "205";
        URL url = new URL(URL + "?province_id=" + province_id);

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("token", TOKEN);

        int responsecode = connection.getResponseCode();
        if (responsecode != 200) {
            throw new RuntimeException("HttpResponseCode: " + responsecode);
        } else {
            StringBuilder informationString = new StringBuilder();
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;

            while ((inputLine = in.readLine()) != null) {
                informationString.append(inputLine);
            }

            in.close();
            connection.disconnect();

            System.out.println(informationString);

            // Không cần thực hiện parsing JSON nếu chỉ muốn in ra dữ liệu là đủ.
            // Tuy nhiên, nếu bạn muốn sử dụng đối tượng JSON, hãy thực hiện việc này.
            // Sử dụng thư viện json-simple hoặc các thư viện JSON phổ biến khác.
        }
    }
}
