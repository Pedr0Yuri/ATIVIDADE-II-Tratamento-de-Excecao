//9. Escreva um programa em Java que mostra que a ordem dos tratadores de exceções é importante. Se você tentar capturar um tipo de exceção de superclasse antes de um tipo de subclasse, o compilador deve gerar erros. Explique por que ocorrem esse erros.

class OrdemdeExcecao {
  public static void main(String[] args) {
        try{
            int[] array = new int[5];
            int valor = array[10];
} catch(Exception e){
    System.out.println("Exceção capturada: " + e);
    } catch(ArrayIndexOutOfBoundsException e){
        System.out.println("ArrayIndex capturada" + e);
        }

}
  }   

// Resposta: Porque a superclasse Exception captura todas as exceções, incluindo ArrayIndexOutOfBoundsException. E por tentar captura um superclasse e logo em seguida uma outra subclasse, o compilador irá gerar erros.