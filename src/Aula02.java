public class Aula02 {
    public static void main(String[] args){
//    Caneta c1 = new Caneta();
//    c1.modelo = "Bic";
//    c1.cor = "Azul";
//    c1.ponta = 0.5f;
//    c1.carga = 90;
//    c1.tampar();
//    c1.status();
//    c1.rabiscar();
//
//    Caneta c2 = new Caneta();
//    c2.modelo = "Qualquer";
//    c2.cor = "Vermelha";
//    c2.ponta = 0.7f;
//    c2.carga = 60;
//    c2.destampar();
//    c2.status();
//    c2.rabiscar();

    Carro ca = new Carro();
    ca.marca = "Chevrolet";
    ca.modelo = "Cruze";
    ca.cor = "Mid Night";
    ca.qtd_portas = 4;
    ca.potencia = 1.6;
    ca.status();
    ca.abrir();
    ca.fechar();
    ca.ligar_carro();
    ca.acelerar();
    }
}
