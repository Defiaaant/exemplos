package composicao;

public class Moto implements Descritor{
    private Veiculo informacao;
    int cilindrada;
    
    public Moto(String marca, String modelo, int cilindrada){
        this.informacao = new Veiculo(marca, modelo);
        this.cilindrada=cilindrada;
    }

    @Override
    public String descrever(){
        return "Moto - " + informacao.descrever() + " , Cilindrada: " + cilindrada + "cc";
    }
}
