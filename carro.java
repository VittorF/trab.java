class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private double vAtual;

    public Carro(String marca, String modelo, int ano, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.vAtual = 0.0;
    }

    public void acelerar(double aumentarVelo) {
        if (aumentarVelo > 0) {
            vAtual += aumentarVelo;
            System.out.println("O carro está acelerando. Nova velocidade: " + vAtual + " km/h");
        } else {
            System.out.println("Aumento de velocidade inválido.");
        }
    }

    public void freio(double freio) {
        if (freio > 0 && freio <= vAtual) {
            vAtual -= freio;
            System.out.println("O carro está freando. Nova velocidade: " + vAtual + " km/h");
        } else {
            System.out.println("Redução de velocidade inválida.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Placa: " + placa);
        System.out.println("Velocidade Atual: " + vAtual + " km/h");
    }
}
