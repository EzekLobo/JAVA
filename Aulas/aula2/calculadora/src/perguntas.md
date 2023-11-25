# Notas sobre Exceções em Java

## 1. O que é uma exceção em Java e qual é o propósito de usá-las em programas?
Em Java, uma exceção é um evento anormal que ocorre durante a execução do programa, perturbando o fluxo normal de instruções. O propósito é lidar com erros e situações inesperadas de forma controlada, permitindo que o programa trate essas condições de maneira apropriada, em vez de encerrar abruptamente.

## 2. Diferença entre exceções verificadas e não verificadas em Java
- **Exceções Verificadas (Checked Exceptions):** Obriga o tratamento ou lançamento. Exemplo: `IOException` ao trabalhar com arquivos.
- **Exceções Não Verificadas (Unchecked Exceptions):** Não requer tratamento explícito. Exemplo: `NullPointerException` ao acessar um objeto nulo.

## 3. Lidando com exceções em Java
- **Palavras-chave:** `try`, `catch`, `finally`, `throw`, `throws`.
- **Práticas comuns:** Usar `try-catch` para envolver código propenso a exceções, utilizar `finally` para garantir a execução, e `throw` para lançar exceções explicitamente.

## 4. Bloco "try-catch" em Java
O bloco `try-catch` é usado para envolver um código onde exceções podem ocorrer. Funciona tentando o código no bloco `try` e, se uma exceção ocorrer, o controle é transferido para o bloco `catch` correspondente. É importante usar `try-catch` para evitar encerramento abrupto e tratar exceções de maneira controlada.

## 5. Criando exceções personalizadas em Java
É apropriado criar exceções personalizadas para situações específicas não cobertas pelas exceções existentes. Exemplo: Criar uma exceção `DivisionByZeroException` para lidar com tentativas de divisão por zero.
