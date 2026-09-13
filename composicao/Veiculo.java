package composicao;

public class Veiculo {
    private String modelo;
    private String marca;

    public Veiculo(String marca, String modelo){
        this.marca=marca;
        this.modelo=modelo;
    }
    public String descrever(){
        return "Marca: "+ marca +" Modelo: "+ modelo;
    }
}
