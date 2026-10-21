public class ComputadorGamer {

    public Computador criar() {
        return new Computador.Builder()
                .processador("AMD Ryzen 7 7800X3D")
                .placaDeVideo("NVIDIA GeForce RTX 4070 12GB")
                .SSD("Kingston KC3000 NVMe 1TB")
                .memoriaRam(32)
                .build();
    }
}

