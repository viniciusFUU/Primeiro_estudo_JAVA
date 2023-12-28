public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga + "%");
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Está tampada?");

        if (this.tampada == true) {
            System.out.println("Está tampada");
        } else {
            System.out.println("Está destampada");
        }
    };

    void rabiscar(){
        if (this.tampada == true){
            System.out.println("Ocorreu um erro, impossivel rabiscar com a caneta tampada.");
        } else {
            System.out.println("Rabiscando...");
        }
    }

    void tampar(){
        this.tampada = true;
    }

    void destampar(){
        this.tampada = false;
    }
}
