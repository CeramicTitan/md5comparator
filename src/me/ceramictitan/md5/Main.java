package me.ceramictitan.md5;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.swing.JFrame;

import org.apache.commons.codec.digest.DigestUtils;

public class Main extends JFrame implements WindowListener {

    public static void main(String[] args) {
    }

    protected String checkMd5(File file) {
        String checksum = null;
        try {
            checksum = DigestUtils.md5Hex(new FileInputStream(file));
        } catch (IOException ex) {
            //Added JTextPane log here.
        }
        return checksum;
    }

    @Override
    public void windowActivated(WindowEvent event) {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowClosed(WindowEvent event) {

    }

    @Override
    public void windowClosing(WindowEvent event) {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowDeactivated(WindowEvent event) {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowDeiconified(WindowEvent event) {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowIconified(WindowEvent event) {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowOpened(WindowEvent event) {
        // TODO Auto-generated method stub

    }

}
