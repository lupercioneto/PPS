- **Intenção**: Fornecer interface para a criação de famílias de objetos relacionados ou dependentes sem especificar suas classes completas.

- **Motivação**: Em muitas situações uma aplicação cliente precisa criar determinados objetos cuja construção só é definida em tempo de execução. A aplicação cliente **NÃO** deve se preocupar com a criação dos objetos.


- Ex: Família 1 e 2 de produtos para SO's diferentes
		- 1: Componentes do Windows;
		- 2: Componentes do Linux;
		- Componente Abstrato; Componentes concretos;
		
	- Cliente deve trabalhar independente das famílias; 
			- Uma **==Classe Abstrata/Interface==** que instancie o tipo do produto em tempo de execução.
			-  Para cada tipo de produto haverá um método de fabricação;
			- Fábrica Abstrata e Fábricas concretas (Não-abstratas);
	- Aplicabilidade: 
			- Sistema deve ser **independente** de como seus produtos são criados, compostos ou representados;
			- Sistema deve ser configurado como um produto de uma **família de múltiplos produtos**; 
			- Família de '**objetos-produto**' é projetada para ser usada em **conjunto**;
			- Deseja-se revelar apenas a interface da biblioteca de classes-produto e não a sua implementação;
# **Solução**

1. Inicie criando uma Interface (ou Classe Abstrata) para cada tipo de produto;
	- Levantamento de Requisitos; 
2. Criação da Fábrica Abstrata para os produtos;
	- Cada produto possuirá um método dentro da Fábrica Abstrata;
	- Cada família de produtos deve implementar sua própria forma de instanciar cada tipo de produto (Classe Concreta). 