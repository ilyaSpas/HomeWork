package org.example.project2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientGUI extends JFrame implements ClientGUIView {
    private static final int WINDOW_POS_X = 700;
    private static final int WINDOW_POX_Y = 300;
    private static final int WINDOW_WIDTH = 600;
    private static final int WINDOW_HEIGHT = 400;
    JTextField nameField, phoneNumberField, experienceField, nameFindField, phoneNumberFindField, expFindField;
    JButton btnSaveEmployee, btnFindEmployerByName, btnFindEmployerByPhone, btnFindByExp, btnFindAll;
    JTextArea textArea;
    JLabel nameLabel, phoneNumberLabel, expLabel, nameFindLbl, phoneFindLbl, expFindLabel;
    private Client client;

    public ClientGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(WINDOW_POS_X, WINDOW_POX_Y);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("ClientGUI");
        setResizable(false);

        client = new Client(this);

        init();

        setVisible(true);
    }

    private void init() {
        add(createTop(), BorderLayout.NORTH);
        add(createCenter());
        add(createBottom(), BorderLayout.SOUTH);
    }

    private Component createCenter() {
        JPanel panelCenter = new JPanel();

        textArea = new JTextArea(15, 52);
        panelCenter.add(textArea);

        return panelCenter;
    }

    private Component createTop() {
        JPanel panelTop = new JPanel(new GridLayout(4, 3));

        expFindLabel = new JLabel("Поиск по стажу:");
        panelTop.add(expFindLabel);
        expFindField = new JTextField();
        panelTop.add(expFindField);
        btnFindByExp = new JButton("Поиск");
        panelTop.add(btnFindByExp);

        nameFindLbl = new JLabel("Поиск по имени:");
        panelTop.add(nameFindLbl);
        nameFindField = new JTextField();
        panelTop.add(nameFindField);
        btnFindEmployerByName = new JButton("Поиск");
        panelTop.add(btnFindEmployerByName);

        phoneFindLbl = new JLabel("Поиск по номеру:");
        panelTop.add(phoneFindLbl);
        phoneNumberFindField = new JTextField();
        panelTop.add(phoneNumberFindField);
        btnFindEmployerByPhone = new JButton("Поиск");
        panelTop.add(btnFindEmployerByPhone);

        panelTop.add(new JPanel());
        panelTop.add(new JPanel());
        btnFindAll = new JButton("Все контакты");
        panelTop.add(btnFindAll);

        btnFindAll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showAll();
            }
        });

        btnFindEmployerByName.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                findByName();
            }
        });

        btnFindEmployerByPhone.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                findByPhoneNumber();
            }
        });

        btnFindByExp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                findByExp();
            }
        });

        return panelTop;
    }

    private Component createBottom() {
        JPanel panelBottom = new JPanel(new GridLayout(2, 4));

        nameLabel = new JLabel("Имя:");
        panelBottom.add(nameLabel);
        phoneNumberLabel = new JLabel("Номер телефона:");
        panelBottom.add(phoneNumberLabel);
        expLabel = new JLabel("Стаж:");
        panelBottom.add(expLabel);
        panelBottom.add(new JPanel());

        nameField = new JTextField();
        panelBottom.add(nameField);
        phoneNumberField = new JTextField();
        panelBottom.add(phoneNumberField);
        experienceField = new JTextField();
        panelBottom.add(experienceField);
        btnSaveEmployee = new JButton("Сохранить");
        panelBottom.add(btnSaveEmployee);

        btnSaveEmployee.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveEmployer();
            }
        });

        return panelBottom;
    }

    @Override
    public void saveEmployer() {
        if (nameField.getText().isEmpty() || phoneNumberField.getText().isEmpty()
                || experienceField.getText().isEmpty()){
            showMessage("Ошибка ввода!");
            refresh();
            return;
        }
            client.saveEmployer(nameField.getText(), phoneNumberField.getText(), experienceField.getText());
            showMessage("Сохранен новый контакт.");
            refresh();
    }

    @Override
    public void showAll() {
        showMessage(client.getAllEmployers());
        refresh();
    }

    @Override
    public void showMessage(String message) {
        textArea.setText(message);
    }

    @Override
    public void findByName() {
        if (nameFindField.getText().equals("")){
            showMessage("Ошибка ввода!");
            return;
        }
        showMessage(client.findEmployerByName(nameFindField.getText()));
        refresh();
    }

    @Override
    public void findByPhoneNumber() {
        if (phoneNumberFindField.getText().equals("")){
            showMessage("Ошибка ввода!");
            return;
        }
        showMessage(client.findEmployerByPhoneNumber(phoneNumberFindField.getText()));
        refresh();
    }

    @Override
    public void findByExp() {
        if (expFindField.getText().equals("")){
            showMessage("Ошибка ввода!");
            return;
        }
        showMessage(client.findEmployerByExp(expFindField.getText()));
        refresh();
    }

    @Override
    public void refresh() {
        experienceField.setText("");
        expFindField.setText("");
        nameFindField.setText("");
        nameField.setText("");
        phoneNumberFindField.setText("");
        phoneNumberField.setText("");
    }
}
