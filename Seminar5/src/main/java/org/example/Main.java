package org.example;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String,ArrayList<String>> hashMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String key = "";
        String value = "";
        String answer = "";
        String yesOrNo = "";
        ArrayList<String> answers = new ArrayList<>();
        answers.add("EXIT");
        answers.add("ADD");
        answers.add("GET");
        answers.add("REMOVE");
        answers.add("LIST");
        ArrayList<String> answersYesOrNo = new ArrayList<>();
        answersYesOrNo.add("y");
        answersYesOrNo.add("n");

        while (!answer.equals("EXIT")){
            System.out.println("\nВведите команду(ADD/GET/REMOVE/LIST/EXIT):");
            answer = scanner.nextLine();

            if(answer.equals("EXIT")){
                System.out.println("Программа завершила свою работу.");
                break;
            }
            if(answer.equals("ADD")){
                System.out.println("Создать новый контакт?(y/n)");
                yesOrNo = scanner.nextLine();
                if (yesOrNo.equals("y")) {
                    System.out.print("Введите имя: ");
                    key = scanner.nextLine();
                    System.out.printf("Введите номер телефона для %s: ", key);
                    value = scanner.nextLine();
                    hashMap.put(key, new ArrayList<String>());
                    hashMap.get(key).add(value);
                }
                if (yesOrNo.equals("n")){
                    System.out.println("Добавить к существующему контакту?");
                    yesOrNo = scanner.nextLine();
                    if (yesOrNo.equals("y")){
                        System.out.print("Введите имя абонента: ");
                        key = scanner.nextLine();
                        if (hashMap.containsKey(key)) {
                            System.out.println("Найден абонент " + key);
                            System.out.print("Введите дополнительный номер: ");
                            value = scanner.nextLine();
                            hashMap.get(key).add(value);
                        }
                        if (!hashMap.containsKey(key)){
                            System.out.println("Абонента с именем " + key + " не найдено.");
                        }
                    }
                    if (yesOrNo.equals("n")){
                        continue;
                    }
                    if (!answersYesOrNo.contains(yesOrNo)){
                        System.out.println("Команда не распознана.");
                        continue;
                    }
                }
                if (!answersYesOrNo.contains(yesOrNo)){
                    System.out.println("Команда не распознана.");
                    continue;
                }
            }
            if(answer.equals("GET")){
                System.out.print("Введите имя абонента: ");
                key = scanner.nextLine();
                if (hashMap.containsKey(key)) {
                    System.out.println("Абонента: " + key + " - номер телефона: " + hashMap.get(key));
                }
                else {
                    System.out.println("Абонента с именем " + key.toUpperCase() + " не найдено.");
                }
            }
            if(answer.equals("REMOVE")){
                System.out.print("Введите имя абонента для удаления: ");
                key = scanner.nextLine();
                if (!hashMap.containsKey(key)){
                    System.out.println("Абонента с именем " + key + " не найдено.");
                }
                if(hashMap.containsKey(key)){
                    hashMap.remove(key);
                    System.out.println("Из телефонной книги удален абонент " + key);
                }
            }
            if(answer.equals("LIST")){
                System.out.println("В телефонной книге содержатся: ");
                Collections.sort(hashMap);
                for (String var : hashMap.keySet()){
                    System.out.println("Имя: " + var + ", номер телефона - " + hashMap.get(var));
                }
            }
            if(!answers.contains(answer)){
                System.out.println("Команда не распознана.");
            }
        }
    }
}
