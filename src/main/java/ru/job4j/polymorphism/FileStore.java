package ru.job4j.polymorphism;

public class FileStore implements Store {
    private String path;

    public FileStore() {

    }

    public FileStore(String path) {
        this.path = path;
    }

    public void save(String data) {
        System.out.println("Тут реализация хранения данных в файле");
    }

    public String read() {
        System.out.println("Тут чтение файла");
        return null;
    }
}
