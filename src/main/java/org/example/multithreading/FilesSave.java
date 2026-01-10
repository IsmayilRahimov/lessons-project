package org.example.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class FilesSave implements Callable<String> {

    private String fileName;
    private int size;

    public FilesSave(String fileName, int size) {
        this.fileName = fileName;
        this.size = size;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getSize() {
        return size;
    }


    public void setSize(int size) {
        this.size = size;
    }


    @Override
    public String call() throws Exception {
        System.out.println("-> " + fileName + " loading...(" + size + " MB)");
        Thread.sleep(size * 1000);
        return "Saved: " + fileName;
    }


    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Future<String>> futures = new ArrayList<>();

        futures.add(executor.submit(new FilesSave("video.mp4", 5)));
        futures.add(executor.submit(new FilesSave("photo.jpg", 2)));
        futures.add(executor.submit(new FilesSave("music.mp3", 3)));
        futures.add(executor.submit(new FilesSave("film.avi", 8)));
        futures.add(executor.submit(new FilesSave("file.pdf", 1)));

        for (Future<String> future : futures) {
            System.out.println(future.get());
        }
        executor.shutdown();
        System.out.println("All files Saved Done!");


    }
}
