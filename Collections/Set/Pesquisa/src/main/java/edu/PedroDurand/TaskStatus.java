package edu.PedroDurand;

public enum TaskStatus {

    CONCLUIDA("Concluída"), PENDENTE("Pendente");

    private String status;

    TaskStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }


}
