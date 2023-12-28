public class Carro {
    String cor;
    String marca;
    String modelo;
    int qtd_portas;
    double potencia;
    boolean aberta;
    boolean carro_ligado;
    void status(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Quantidade de Portas: " + this.qtd_portas);
        System.out.println("Potência: " + this.potencia);
    }

    void abrir(){
        aberta = true;
        if (aberta == true){
            System.out.println("\nPorta aberta. Pode entrar!");
        }
        carro_ligado = false;
    };

    void fechar(){
        aberta = false;
        if (aberta == false){
            System.out.println("\nPorta fechada. Autorizado a ligar o carro.");
        }
        carro_ligado = false;
    };

    void ligar_carro(){
        int i = 0;
        if (aberta == false){
            while (i < 3){
                System.out.println(i+1 + "...");
                i+=1;
            }
            System.out.println("Carro ligado!");
        }
        carro_ligado = true;
    }

    void acelerar(){
        int velocidade = 0;

        if (carro_ligado == true){
            while (velocidade < 100){
                velocidade+=5;
                System.out.println("Você está a " + velocidade + " Km por hora.");
            }
        }

        if (velocidade == 100){
            System.out.println("\nLimite de velocidade atingido.");
        }
    };

}
