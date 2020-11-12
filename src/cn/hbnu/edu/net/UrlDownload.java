package cn.hbnu.edu.net;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author 陈迪凯
 * @date 2020-11-12 9:08
 */
public class UrlDownload {

    public static void main(String[] args) {
        try {
            URL url = new URL("https://m801.music.126.net/20201112094407/b85b56df15c3ddb257108cae45095b1c/jdyyaac/obj/w5rDlsOJwrLDjj7CmsOj/4632083309/49bd/3213/dc79/22eb68377214e187d38b4328286b0dea.m4a");

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

            InputStream in = httpURLConnection.getInputStream();

            FileOutputStream fos = new FileOutputStream("E:\\DingLi\\1808.m4a");

            byte[] buf = new byte[1024];
            int len = 0;
            while ((len = in.read(buf)) != -1) {
                fos.write(buf, 0, len);
            }

            fos.close();
            httpURLConnection.disconnect();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
