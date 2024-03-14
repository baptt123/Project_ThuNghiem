import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

import java.io.IOException;
import java.nio.file.Paths;

public class QRCode {
    public static void main(String[] args) throws WriterException, IOException {
        String data="Tao là siêu nhân";
        String path="D:\\QRImage\\sieunhan.jpg";
        BitMatrix bitMatrix=new MultiFormatWriter().encode(data, BarcodeFormat.QR_CODE,200,200);
        MatrixToImageWriter.writeToPath(bitMatrix,"jpg", Paths.get(path));
        System.out.println("Build QRCode Successfully.Please check in your computer");
    }
}
