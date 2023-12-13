package org.example.hw;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        File file1 = new File("src/main/resources/test.bin");
        File file2 = new File("src/main/resources/test.json");
        File file3 = new File("src/main/resources/test.xml");

        Student student1 = new Student("Ivan", 18, 5);

        serialization(student1, file3);
        Student student2 = deserialization(file3);

        System.out.println(student2);


    }

    private static void serialization(Student student, File file) throws IOException {
        if (file.getName().endsWith(".bin")) {
            try (FileOutputStream fileOutputStream = new FileOutputStream(file);
                 ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
                objectOutputStream.writeObject(student);
                System.err.println("Объект сериализован в файл .bin");
            }
        } else if (file.getName().endsWith(".json")) {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writeValue(file, student);
            System.err.println("Объект сериализован в файл .json");
        } else if (file.getName().endsWith(".xml")) {
            XmlMapper xmlMapper = new XmlMapper();
            xmlMapper.writeValue(file, student);
        }
    }

    private static Student deserialization(File file) throws IOException, ClassNotFoundException {
        Student student = null;
        if (file.getName().endsWith(".bin")) {
            try (FileInputStream fileInputStream = new FileInputStream(file);
                 ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
                student = (Student) objectInputStream.readObject();
                System.err.println("Объект десериализован из файла .bin");
            }
        } else if (file.getName().endsWith(".json")) {
            ObjectMapper objectMapper = new ObjectMapper();
            student = objectMapper.readValue(file, Student.class);
            System.err.println("Объект десериализован из файла .json");
        } else if (file.getName().endsWith(".xml")) {
            XmlMapper xmlMapper = new XmlMapper();
            student = xmlMapper.readValue(file, Student.class);
        }
        return student;
    }

}
