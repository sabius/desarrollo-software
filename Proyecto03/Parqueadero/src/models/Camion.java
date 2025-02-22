package models;

public class Camion {
       
        private String placa;
        private String marca;
        private String modelo;
        private java.time.LocalDate horaEntrada;
        private String tipoConbustible;
        private int valorTarifa;
    

    // COSTRUCTOR 

    public Camion (String placa, String marca, String modelo, java.time.LocalDate horaEntrada,String tipoConbustible, int valorTarifa ) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.horaEntrada = horaEntrada;
        this.tipoConbustible = tipoConbustible;
        this.valorTarifa = valorTarifa;
    }

    // Getters and setters
    public String getPlaca() {
        return placa;} public void setPlaca(String placa) {
        this.placa = placa;}

    public String getMarca() {
        return marca;}  public void setMarca(String marca) {
        this.marca = marca;}

    public String getModelo() {
        return modelo;}   public void setModelo(String modelo) {
        this.modelo = modelo; }

    public java.time.LocalDate getHoraEntrada() {
        return horaEntrada;} public void setHoraEntrada(java.time.LocalDate horaEntrada) {
        this.horaEntrada = horaEntrada;}

    public String  getTipoConbustible() {
            return tipoConbustible;} public void setTipoConbustible(String  tipoConbustible) {
            this.tipoConbustible = tipoConbustible;}
    
    public int  getValorTarifa() {
                return valorTarifa;} public void setValorTarifa(int valorTarifa) {
                this.valorTarifa = valorTarifa;}



}
