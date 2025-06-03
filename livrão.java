//nome da pasta + declaração das variáveis
public class livrão {
    private String título;
    private int anoPublicação;
    private int nmrPág;
    private int preço;
//get => pega o valor da variável
    public String getTítulo() {
        return título;
    }
    public int getanoPublicação() {
        return anoPublicação;
    }
    public int getnmrPág() {
        return nmrPág;
    }
    public int getpreço() {
        return preço;
    }
    
//Set => retorna o valor null
    public void setTítulo(String título) {
        this.título = título;
    }
    public void setanoPublicação(int anoPublicação) {
        this.anoPublicação = anoPublicação;
    }
    public void setnmrPág(int nmrPág) {
        this.nmrPág = nmrPág;
    }
    public void setpreço(int preço) {
        this.preço = preço;
    }
    
}
