package org.smce;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;


public class Main {

    public static void main(String[] args) throws IOException {
        File movieFolder = new File("C:");
        for (File folder : movieFolder.listFiles((File file) -> file.isDirectory())) {
            processFolder(folder);
        }
    }

    private static void processFolder(File movieFolder) throws IOException {
        File[] files = movieFolder.listFiles((File file) -> file.isDirectory());
        if (files.length == 0) {
            deleteFileOrFolder(movieFolder);
            return;
        }
        for (File folder : files) {
            System.out.println("Looking in folder: "+folder.getAbsolutePath());
            File[] folderFiles = folder.listFiles();
            for (File folderFile : folderFiles) {
                if (folderFile.isDirectory()) {
                    processFolder(folderFile);
                    continue;
                }
                processFile(folderFile);
            }
            if (folderFiles.length == 0) {
                deleteFileOrFolder(folder);
            }
        }
        for (File file : movieFolder.listFiles(File::isDirectory)) {
            processFile(file);
        }
    }

    private static void processFile(File folderFile) throws IOException {
        String absolutePath = folderFile.getAbsolutePath();
        if (absolutePath.toLowerCase().endsWith(".txt")
                || absolutePath.toLowerCase().endsWith(".nfo")
                || absolutePath.toLowerCase().endsWith(".mp3")
                || absolutePath.toLowerCase().endsWith(".gif")
                || absolutePath.toLowerCase().endsWith(".jpg")
                || absolutePath.toLowerCase().endsWith(".jpeg")
                || absolutePath.toLowerCase().endsWith(".png")
                || absolutePath.toLowerCase().endsWith(".smi")
                || absolutePath.toLowerCase().endsWith(".idx")
                || absolutePath.toLowerCase().endsWith(".sub")
                || absolutePath.toLowerCase().endsWith(".m4a")
                || absolutePath.toLowerCase().endsWith(".txt")
                || absolutePath.toLowerCase().indexOf("sample") >= 0
                || absolutePath.toUpperCase().indexOf("README") >= 0) {
            deleteFileOrFolder(folderFile);
            return;
        }
        if (absolutePath.endsWith(".avi") || absolutePath.endsWith(".mkv") || absolutePath.endsWith(".mp4") || absolutePath.endsWith(".srt")) {
            Path toPath = new File("t:\\" + folderFile.getName()).toPath();
            System.out.println("Moving "+absolutePath+" to "+toPath);
            Files.move(folderFile.toPath(), toPath, StandardCopyOption.ATOMIC_MOVE);
        }
    }

    private static void deleteFileOrFolder(File folderFile) {
        System.out.println("Deleting "+folderFile);
        folderFile.deleteOnExit();
    }

}
