import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author manxingfu
 * @date 2023/5/16 18:07
 * @desc
 */
public class TempTest {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://192.168.20.101:18001/group3/fin-report-video/61_bgmed.mp4");
            URLConnection connection = url.openConnection();
            InputStream is = connection.getInputStream();
            BufferedInputStream bis = new BufferedInputStream(is);
            FileOutputStream fos = new FileOutputStream("D:\\1.mp4");
            byte[] buffer = new byte[1024];
            int len = 0;
            while ((len = bis.read(buffer)) > 0) {
                fos.write(buffer, 0, len);
            }
            fos.close();
            bis.close();
            is.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
