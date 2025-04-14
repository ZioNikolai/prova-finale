package model;

public class ToDo {
    private String descrizione;
    private String data;

    public ToDo(String descrizione, String data) {
        this.descrizione = descrizione;
        this.data = data;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public String getData() {
        return data;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return descrizione + " (entro: " + data + ")";
    }
}