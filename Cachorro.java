public class Cachorro {
    String raca, cor, sexo, comportamento;
    double peso;


    public Cachorro(){

    }
    
    public Cachorro(String raca, String cor, String sexo, String comportamento, double peso) {
        this.raca = raca;
        this.cor = cor;
        this.sexo = sexo;
        this.comportamento = comportamento;
        this.peso = peso;
       
        
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getComportamento() {
        return comportamento;
    }

    public void setComportamento(String comportamento) {
        this.comportamento = comportamento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    
}
