public class Main {
    public static void main(String[] args) {
        ComputadorGamer cg = new ComputadorGamer();
        ComputadorNormal cn = new ComputadorNormal();

        Computador gamer = cg.criar();
        Computador normal = cn.criar();

        System.out.println("=== Gamer ===");
        gamer.exibirInformacoes();

        System.out.println("\n=== Normal ===");
        normal.exibirInformacoes();
    }
}