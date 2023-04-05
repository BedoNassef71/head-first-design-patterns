/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package header.first.design.patterns.chapter3.files;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author hp
 */
public class InputTest {

    public static void main(String[] args) {
        int c;
        try {
            String path = "E:\\BEDO\\UNIVERSITY\\FCAI-HU\\LEVEL 3\\SECOND TERM\\SW2\\Java Spring\\BOOT\\1 - [Create Project & Controller].txt";
            InputStream in = new LowerCaseInputStream(new FileInputStream(path));
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
