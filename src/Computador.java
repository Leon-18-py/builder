import java.security.InvalidParameterException;

public class Computador {
    private String placaDeVideo;
    private String processador;
    private String SSD;
    private int memoriaRam;

    public Computador(Builder builder){
        this.placaDeVideo = builder.placaDeVideo;
        this.processador = builder.processador;
        this.SSD = builder.SSD;
        this.memoriaRam = builder.memoriaRam;
    }

    public static class Builder{
        private String placaDeVideo;
        private String processador;
        private String SSD;
        private int memoriaRam;


        public Builder placaDeVideo(String placaDeVideo){
            this.placaDeVideo = placaDeVideo;
            return this;
        }

        public Builder processador(String processador){
            this.processador = processador;
            return this;
        }

        public Builder SSD(String SSD){
            this.SSD = SSD;
            return this;
        }

        public Builder memoriaRam(int memoriaRam) {
            if (memoriaRam <= 0) {
                throw new InvalidParameterException("A memória RAM deve ser maior que 0");
            }
            this.memoriaRam = memoriaRam;
            return this;
        }

        public Computador build() {
            if (processador == null || processador.isEmpty()) {
                throw new InvalidParameterException("O processador é obrigatório");
            }
            if (memoriaRam <= 0) {
                throw new InvalidParameterException("A memória RAM é obrigatória");
            }
            return new Computador(this);
        }
    }

    public void exibirInformacoes() {
        System.out.println("Processador: " + processador);
        System.out.println("Placa de vídeo: " + placaDeVideo);
        System.out.println("SSD: " + SSD);
        System.out.println("Memória RAM: " + memoriaRam + " GB");
    }
    
}
