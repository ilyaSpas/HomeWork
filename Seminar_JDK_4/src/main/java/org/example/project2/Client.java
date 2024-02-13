package org.example.project2;

public class Client {
    private Server server;

    public Client(ClientGUIView clientGUI) {
        server = new Server();
    }

    public void saveEmployer(String phoneNumber, String name, String experience) {
        Employer employer = new Employer(phoneNumber, name, experience);
        server.saveEmployer(employer);
    }

    public String getAllEmployers() {
        return server.getAllEmployers();
    }

    public String findEmployerByName(String name) {
            return server.findByName(name);
    }

    public String findEmployerByPhoneNumber(String phoneNumber) {
        return server.findByPhoneNumber(phoneNumber);
    }

    public String findEmployerByExp(String exp) {
        return server.findByExp(exp);
    }
}
