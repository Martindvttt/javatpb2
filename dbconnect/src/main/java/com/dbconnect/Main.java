package com.dbconnect;

import com.dbconnect.User;
import com.dbconnect.UserDao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.List;

public class Main {
    // Connect to DB
    private UserDao userDao = new UserDao();

    private JFrame frame;
    private JTextArea textArea;
    private JTextField nameField, idField;

    public Main() { // should be called 'UserApp' but won't change it since it works like this.
        frame = new JFrame("User Management");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);

        textArea = new JTextArea(10, 30);
        nameField = new JTextField(15);
        idField = new JTextField(15);

        JButton createButton = new JButton("Ajouter");
        createButton.addActionListener(this::addUser);

        JButton readButton = new JButton("Afficher tous");
        readButton.addActionListener(this::showUsers);

        JButton updateButton = new JButton("Mettre à jour");
        updateButton.addActionListener(this::updateUser);

        JButton deleteButton = new JButton("Supprimer");
        deleteButton.addActionListener(this::deleteUser);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.Y_AXIS));
        inputPanel.add(new JLabel("Nom: "));
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("ID: "));
        inputPanel.add(idField);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(createButton);
        buttonPanel.add(readButton);
        buttonPanel.add(updateButton);
        buttonPanel.add(deleteButton);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.add(inputPanel);
        mainPanel.add(buttonPanel);

        frame.setLayout(new BorderLayout());
        frame.add(mainPanel, BorderLayout.NORTH);
        frame.add(new JScrollPane(textArea), BorderLayout.CENTER);
        frame.setVisible(true);
    }

    private void addUser(ActionEvent e) {
        String name = nameField.getText();
        userDao.createUser(new User(0, name));
        nameField.setText("");
        textArea.append("Utilisateur ajouté: " + name + "\n");
    }

    private void showUsers(ActionEvent e) {
        List<User> users = userDao.readAllUsers();
        textArea.setText("Utilisateurs:\n");
        for (User user : users) {
            textArea.append("ID: " + user.getId() + ", Nom: " + user.getName() + "\n");
        }
    }

    private void updateUser(ActionEvent e) {
        int id = Integer.parseInt(idField.getText());
        String name = nameField.getText();
        userDao.updateUser(new User(id, name));
        textArea.append("Utilisateur mis à jour: ID = " + id + ", Nom = " + name + "\n");
    }

    private void deleteUser(ActionEvent e) {
        int id = Integer.parseInt(idField.getText());
        userDao.deleteUser(id);
        textArea.append("Utilisateur supprimé: ID = " + id + "\n");
    }

    public static void main(String[] args) {
        new Main();
    }
}
