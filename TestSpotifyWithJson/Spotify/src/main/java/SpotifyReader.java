import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class SpotifyReader {
    private static final String API_URL = "https://v1.nocodeapi.com/thanhtan/spotify/dLRHJVlVhqyRGneg/usersTop?type=tracks&time_range=short_term";

    public static void main(String[] args) {
        try {
            // Tạo URL và kết nối HTTP
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
            String contentresult=content.toString();
            Gson gson=new Gson();
            JsonObject jsonResponse = gson.fromJson(content.toString(), JsonObject.class);
            JsonArray tracks = jsonResponse.getAsJsonArray("items");
            System.out.println(tracks.toString());
            // Duyệt qua danh sách các track và in ra thuộc tính 'url' và 'name'
            for (int i = 0; i < tracks.size(); i++) {
                JsonObject track = tracks.get(i).getAsJsonObject();
                String name = track.get("name").getAsString();
                JsonArray urlStr = track.get("images").getAsJsonArray();
                for(int j=0;j<urlStr.size(); i++) {
                    String link_img=urlStr.get(i).getAsJsonObject().get("url").getAsString();
                    System.out.println("Đường dẫn ảnh"+ link_img);
                }
                System.out.println("Name: " + name + ", URL: " + urlStr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }

