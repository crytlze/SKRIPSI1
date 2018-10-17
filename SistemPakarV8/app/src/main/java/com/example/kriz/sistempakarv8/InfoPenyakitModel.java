package com.example.kriz.sistempakarv8;

public class InfoPenyakitModel {

    String namapenyakit, deskripsi, solution;

    public InfoPenyakitModel(String namapenyakit, String deskripsi, String solution){
        this.namapenyakit = namapenyakit;
        this.deskripsi = deskripsi;
        this.solution = solution;
    }

    public String getNamapenyakit()
    {
        return namapenyakit;
    }
    public String getDeskripsi()
    {
        return deskripsi;
    }
    public String getSolution() {
        return solution;
    }
}
