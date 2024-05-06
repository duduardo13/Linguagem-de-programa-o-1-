# CBTLPR1_TP_03 - Trabalho Prático III

Por: Eduardo Barbosa Rodrigues && Vinicius Pontes Oliva

## Exercício 01
Crie a classe Hora conforme especificado abaixo:
```
-----------------------------
|Hora                       |
|---------------------------|
|- hora: int                |
|- min: int                 |
|- seg: int                 |
|---------------------------|
|+ Hora()                   |
|+ Hora(int h, int m, int s)|
|+ setHor(int h)            |
|+ setMin(int m)            |
|+ setSeg(int s)            |
|+ setHor()                 |
|+ setMin()                 |
|+ setSeg()                 |
|+ getHor(): int            |
|+ getMin(): int            |
|+ getSeg(): int            |
|+ getHora1(): String       |
|+ getHora2(): String       |
|+ getSegundos(): int       |
-----------------------------
```
- O construtor Hora() deve permitir ao usuário digitar os valores de hora, minuto e
segundos e com eles inicializar os atributos da classe. Os valores digitados deverão ser
consistidos e só aceitos se válidos, caso contrário, exigir ao usuário redigitar;

- O construtor Hora(int h, int m, int s) deverá receber os valores de hora, minuto e
segundos e com eles inicializa as propriedades da classe;

- Os métodos setHor(int h), setMin(int m) e setSeg(int s) receberão um valor e
atribuí-lo ao respectivo atributo;

- Os métodos setHor(), setMin() e setSeg() irão permitir que o usuário forneça um
valor e atribuí-lo ao respectivo atributo. Os valores digitados deverão ser consistidos e
só aceitos se válidos, caso contrário, exigir ao usuário redigitar;

- Os métodos getHor(), getMin() e getSeg() devem devolver as respectivas
propriedades;
- O método getHora1() Retornará a hora no formato: hh:mm:ss;
- O método getHora2() Retornará a hora no formato: hh:mm:ss (AM/PM);
- O método getSegundos() Retornará a quantidade de segundos expressa na
hora em questão, (exemplo: 01:00:01 = 3601 segundos) .
- Conveniente colocar tratamento de exceção para as possíveis inconsistências na
entrada de dados.

## Exercício 02
Agora, desenvolva um programa capaz de testar a classe e os métodos desenvolvidos no exercício anterior.

### Teste: 
