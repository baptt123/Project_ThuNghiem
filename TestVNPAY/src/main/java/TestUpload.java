import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

@MultipartConfig(
        fileSizeThreshold = 1024 * 1024 * 2,  // 2MB
        maxFileSize = 1024 * 1024 * 100,       // 10MB
        maxRequestSize = 1024 * 1024 * 100     // 50MB
)
@WebServlet("/testupload")
public class TestUpload extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
        // Lấy phần tải lên từ request
        Part part = req.getPart("file");

        // Lấy tên của tệp được tải lên
        String fileName = part.getSubmittedFileName();

        // Khởi tạo một mảng byte để lưu dữ liệu từ phần tải lên
        byte[] data = new byte[(int) part.getSize()];

        // Đọc dữ liệu từ phần tải lên vào mảng byte
        InputStream is = part.getInputStream();
        is.read(data);
        is.close();

        // Khởi tạo Cloudinary object
        Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
                "cloud_name", "dvarqsigv",
                "api_key", "312676887848818",
                "api_secret", "mDYfyME8asyBQJJe6VFENakGoOc"));

        // Upload ảnh lên Cloudinary
        cloudinary.uploader().upload(data, ObjectUtils.emptyMap());

        // Gửi thông báo thành công về client
        resp.getWriter().println("Đã gửi ảnh lên Cloudinary thành công: " + fileName);
    } catch (Exception e) {
        e.printStackTrace();
        resp.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Lỗi khi gửi ảnh lên Cloudinary");
    }
}
}
