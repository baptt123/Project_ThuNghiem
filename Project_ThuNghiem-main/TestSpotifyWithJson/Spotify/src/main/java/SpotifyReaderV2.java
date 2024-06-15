import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class SpotifyReaderV2 {


    private static final String API_URL = "https://v1.nocodeapi.com/thanhtan/spotify/dLRHJVlVhqyRGneg/usersTop?type=tracks&time_range=short_term";

    public static void main(String[] args) {
        try {
            // Tạo URL và thiết lập kết nối HTTP
            URL url = new URL(API_URL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            // Đọc phản hồi từ API
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }

            // Đóng các luồng
            in.close();
            connection.disconnect();

            // Sử dụng Gson để xử lý JSON
            Gson gson = new Gson();
            JsonObject jsonResponse = gson.fromJson(content.toString(), JsonObject.class);
            JsonArray tracks = jsonResponse.getAsJsonArray("items");

            // Duyệt qua danh sách các track và lấy ra thuộc tính 'images' của mỗi track
            for (int i = 0; i < tracks.size(); i++) {
                JsonObject track = tracks.get(i).getAsJsonObject();
                String name = track.get("name").getAsString();
                JsonArray images = track.getAsJsonObject("album").getAsJsonArray("images");
                JsonObject image = images.get(0).getAsJsonObject();
                String urlStr = image.get("url").getAsString();
                System.out.println("Name: " + name + ", Image URL: " + urlStr);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


