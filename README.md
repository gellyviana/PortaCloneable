# PortaCloneable

Exercício 03: (60%)
O Java possui uma interface chamada Cloneable, que pode ser implementada por classes que são capazes
de gerar cópias de objetos. Esta interface não possui métodos, mas as classes que a implementam devem
sobrescrever o método clone(), definido na classe Object. Dentro deste método é implementada a lógica
para criar um novo objeto com base no objeto original.
Com base nisto, crie uma classe Porta, que suporta a criação de novos objetos (cópia). Ela deve ter os
atributos altura (double), largura (double) e aberta (boolean). Também deve possuir os métodos abrir(),
fechar() e os métodos getters e setters correspondentes aos atributos. A classe deve ter um construtor,
que recebe a altura e largura da porta. Inicialmente a porta está fechada. Como uma porta pode criar 
outras cópias dela mesma, você deve sobrescrever o método clone(), o qual deve criar um novo objeto com
os valores dos atributos copiados e retorná-lo.
Dica01: o método clone() lança uma exceção (CloneNotSupportedException). Não é preciso se preocupar com
ela neste momento, então declare o método main() da sua aplicação da seguinte forma:
public static void main(String [] args) throws Exception {
}
Crie uma aplicação que cria um objeto porta, executa o método para abrir a porta. Crie um clone dessa 
porta e escreva no terminal os estados dos dois objetos comparando-os.
Dica02: faça uma busca por "Clonagem de objetos em Java usando a interface Cloneable".
