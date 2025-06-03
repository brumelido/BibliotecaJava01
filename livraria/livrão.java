package livraria;
//nome da pasta + declaração das variáveis
public class livrão {
    private String título;
    private int anoPublicação;
    private int nmrPág;
    private int preço;
    private int avaliações;
//get => pega o valor da variável
    public int getanoPublicação() {
        return anoPublicação;
    }
    public int getavaliações() {
        return avaliações;
    }
    public int getnmrPág() {
        return nmrPág;
    }
    public int getpreço() {
        return preço;
    }
    public String getTítulo() {
        return título;
    }
//Set => retorna o valor null
    public void setanoPublicação(int anoPublicação) {
        this.anoPublicação = anoPublicação;
    }
    public void setavaliações(int avaliações) {
        this.avaliações = avaliações;
    }
    public void setnmrPág(int nmrPág) {
        this.nmrPág = nmrPág;
    }
    public void setpreço(int preço) {
        this.preço = preço;
    }
    public void setTítulo(String título) {
        this.título = título;
    }
}
