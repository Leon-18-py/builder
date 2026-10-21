public class ComputadorNormal {

    public Computador criar() {
        return new Computador.Builder()
                .processador("Intel Core i3-12100")
                .placaDeVideo("Intel UHD Graphics 730 (integrada)")
                .SSD("Kingston NV2 256GB")
                .memoriaRam(8)
                .build();
    }
}