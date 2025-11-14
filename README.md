# Controle de Concorrencia

## Concorrente

### A versão Concorrente demonstra o comportamento típico de um sistema sem sincronização de threads:

- O acesso simultâneo ao saldo não é controlado.
- Não há exclusão mútua.
- A execução é intercalada de maneira imprevisível.
- O fluxo não é determinístico, mas o resultado é consistente devido ao saldo inicial zero.
- A falta de sincronização impede qualquer operação crítica segura (como saque e depósito).

## Lock

### A implementação com Lock resolve completamente os problemas observados na pasta Concorrente. Ao proteger as operações críticas, o Lock garante:

- Exclusão mútua real: apenas uma thread por vez altera o saldo.
- Consistência dos valores: saldos nunca ficam negativos ou incorretos.
- Ausência de race conditions.
- Execuções seguras e previsíveis, ainda que não determinísticas na ordem das threads.

## RwLock

### A implementação com RWLock apresenta um comportamento seguro e eficiente:

- Leituras paralelas são permitidas, aumentando o desempenho.
- Escritas são exclusivas, garantindo consistência no saldo.
- Nenhuma condição de corrida ocorre durante as operações de consulta e saque.
- O resultado final é sempre correto, mesmo com threads executando em ordem imprevisível.

## Synk

### A implementação Sync demonstra o funcionamento adequado do mecanismo de exclusão mútua baseado em synchronized.
Os resultados mostram que:

- O acesso ao saldo é protegido.
- As threads nunca modificam dados simultaneamente.
- Todas as verificações e operações são feitas de forma segura.
- O programa não apresenta qualquer tipo de condição de corrida.
- Os resultados se mantêm consistentes em todas as execuções.
