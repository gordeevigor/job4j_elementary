package ru.job4j.record;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("Ivan", 30);
        System.out.println("Имя: " + person.getName() + ", Возраст: " + person.getAge());
        System.out.println(person);
        PersonRecord personRecord = new PersonRecord("Ivan", 30);
        System.out.println("Имя: " + personRecord.name()  + ", Возраст: " + personRecord.age());
        System.out.println(personRecord);
        PersonRecord personRecordNew = new PersonRecord("Ivan", 30);
        System.out.println(personRecordNew.equals(personRecord));
    }
}
