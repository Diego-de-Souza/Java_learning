## Pilares da Programação Orientada a Objetos

Projeto com intuito de aprendizagem sobre os Pilares a programação aorientada a objetos, contendo seus pilares: Encapsulamento, Herança, Abstração, polimorfismo.

### Encapsulamento
    Nem tudo precisa estar visivel, grande parte do nosso algoritmo pode ser distribuido em métodos com finalidades especificas que complementa uma ação em nossa aplicação
    Exemplo: Ligar um veiculo exige muitas etapas para engenharia, mas o condutor só visualiza a ignição, dar a partida e a "magia" acontece.

### Herança
    Caracteristicas e comportamentos comuns podem ser elevados e compartilhados através de uma hierarquia de objetos.
    Exemplo: Um carro e uma motocicleta possuem propriedades como um chassi, ano de fabricação e metodos como acelerar, fear. Logo para não ser um processo de codificação redundante, podemos desfrutar da herança criando uma classe Veiculo para que seja herdada por Carro e Motocicleta.

### Abstração
    É a indisponibilidade para determinar a lógica de um ou vários comportamentos em um objeto.
    Exemplo: Veiculo determina duas ações como acelerar e frear,  logo estes comportamentos deverão ser abstratos, pois, existem mais de uma maneira de se realizar a mesma operação.

### Polimorfismo
    São as inúmeras maneiras de se realizar uma mesma ação.
    Exemplo: Veiculo determina duas ações como acelerar e frear, primeniramente precisamos identificar se estaremos nos referindo a Carro ou Motocicleta para determinar a lógica de aceleração e frenagem dos respectivos veiculos.