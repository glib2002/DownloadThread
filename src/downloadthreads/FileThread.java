/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package downloadthreads;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author Глеб
 */
public class FileThread {

    public static File fileDownload;
    public static URL url;
    public static Scanner scanner = new Scanner(System.in);

    public static void downloadFile() throws IOException {
        String urls[] = new String[12];
        urls[0] = "http://www.ex.ua/get/535647";//1
        urls[1] = "http://www.ex.ua/get/535644";//2
        urls[2] = "http://www.ex.ua/get/535655";//3
        urls[3] = "http://www.ex.ua/get/535656";//4
        urls[4] = "http://www.ex.ua/get/535658";//5
        urls[5] = "http://www.ex.ua/get/535659";//6
        urls[6] = "http://www.ex.ua/get/535660";//7
        urls[7] = "http://www.ex.ua/get/535661";//8
        urls[8] = "http://www.ex.ua/get/535663";//9
        urls[9] = "http://www.ex.ua/get/535666";//10
        urls[10] = "http://www.ex.ua/get/535654";//11
        urls[11] = "http://www.ex.ua/get/535653";//12
        for (int x = 0; x < 11; x++) {
            url = new URL(urls[x]);

            String nameFile = "File" + x;
            String extension = ".mp3";
            System.out.println("Now downloading " + nameFile + " ...");
            String fullNameFile = nameFile + extension;
            fileDownload = new File("c:\\Users\\Глеб\\Documents\\NetBeansProjects\\ThreadDownloader\\src\\Downloads\\" + fullNameFile);
            try (FileOutputStream fos = new FileOutputStream(fileDownload); BufferedInputStream bis = new BufferedInputStream(url.openStream())) {
                byte[] buffer = new byte[1024];
                int count = 0;

                while ((count = bis.read(buffer)) != -1) {
                    fos.write(buffer, 0, count);
                }//while 2
            }//try
        }
    }

    public static void main(String[] args) throws IOException {
        downloadFile();
    }
}
