public class livro{
public static void main(String[] args) {
    livrão l = new livrão();

    l.setTítulo("harry");
    l.setanoPublicação(1892);
    l.setpreço(150);
    l.setnmrPág(300);

    livrão l2= new livrão();
    l2.setTítulo("A branca de neve");
    l2.setanoPublicação(1520);
    l2.setnmrPág(350);
    l2.setpreço(203);

    livrão l3= new livrão();
    l3.setTítulo("Frozen");
    l3.setanoPublicação(2010);
    l3.setnmrPág(120);
    l3.setpreço(23);

    System.out.println("Titulo: " + l.getTítulo());
    System.out.println("Ano de publicação: " + l.getanoPublicação());
    System.out.println("Preço: " + l.getpreço());
    System.out.println("Páginas: " + l.getnmrPág());
}
}