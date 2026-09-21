public class MedidorTempo {

    public static int multiplica(int a, int b) {
        return a * b;
    }

    public static int multiplica2(int a, int b) {
        int resultado = 0;
        for (int i = 0; i < b; i++) {
            resultado += a;
        }
        return resultado;
    }

    public static int multiplica3(int a, int b) {
        if (b == 0) {
            return 0;
        } else {
            return a + multiplica3(a, b - 1);
        }
    }

    public static void main(String[] args) {
        long inicio = System.nanoTime();
        multiplica(5, 1000);
        long fim = System.nanoTime();
        long tempo = fim - inicio;
        System.out.println("Tempo de execução de Multiplica: " + tempo + " ns");
        inicio = System.nanoTime();
        multiplica2(5, 1000);
        fim = System.nanoTime();
        tempo = fim - inicio;
        System.out.println("Tempo de execução de Multiplica2: " + tempo + " ns");
        inicio = System.nanoTime();
        multiplica3(5, 1000);
        fim = System.nanoTime();
        tempo = fim - inicio;
        System.out.println("Tempo de execução de Multiplica3: " + tempo + " ns");
    }
}