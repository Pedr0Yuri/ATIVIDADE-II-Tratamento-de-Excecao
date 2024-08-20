//Alunos: Pedro Yuri de Oliveira Goes e Geovani Machado Cardeal


//1. Lista cinco exemplos de exceções comuns.
// Resposta IoExcepition, NullPointerException, ArrayIndexOutOfBoundsException, ClassCastException, ArithmeticException

//2. Por que as técnicas de tratamento de exceções não devem ser utilizadas para controle convencional de programação?
// Resposta: As técnicas de tratamento de exceções são projetadas para lidar com condições excepcionais e erros inesperados. Usar exceções para controle convencional de programação é ineficiente porque o processamento de exceções é mais custoso em termos de recursos do que as estruturas de controle normais.

//3. Se nenhuma exceção for disparada em um bloco try, para onde segue o controle quando o bloco try completa a execução?
// Resposta: O controle segue para o próximo bloco imediatamente após o bloco try, que pode ser um bloco finally ou para a próxima linha de código após o bloco try-catch-finally.

//4. O que acontece se ocorrer uma exceção e um tratador de exceções apropriado não puder ser localizado?
// Resposta: A exceção é propagada para o método chamador. Se a exceção continuar sem ser tratada, ela eventualmente atinge o método principal, fazendo com que o programa seja encerrado abruptamente e exceção seja impressa no console.

//5. O que acontece se vários tratadores correspondem ao tipo de objeto disparado?
// Resposta: Se vários catch blocks puderem tratar a exceção lançada, o primeiro bloco catch correspondente ao tipo da exceção é executado. Os blocos catch subsequentes são ignorados.

//6. Qual é a razão fundamental para utilizar blocos finally?
// Resposta  :A razão dos blocos finally é garantir que código específico seja executado, independentemente de uma exceção ter sido lançada ou não.

//7. O que acontece quando um tratador catch dispara uma Exception?
// Resposta: O tratador catch é executado e o fluxo de execução é interrompido.

//8. O que acontece com uma referência local em um bloco try quando esse bloco dispara uma Exception?
// Resposta: A referência local é destruída e não pode ser usada.