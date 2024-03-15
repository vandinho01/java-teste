
public class app1 {

  // int INDICE = 13, SOMA = 0, K = 0;
  // enquanto K < INDICE faça
  // {
  // K = K + 1;
  // SOMA = SOMA + K;
  // }
  // imprimir(SOMA);

  public static void main(String[] args) {

    int indice = 13;
    int soma = 0;
    int k = 0;

    for (k = 0; k < indice; k++) {
      soma = soma + k;
    }

    System.out.println("A soma é " + soma);

  }
}