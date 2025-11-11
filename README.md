# S3.01.Patterns 1
:memo:
Software pattenrs exercises

## Level :one:
#### Exercici 1
**Builder** 
Desenvolupa un sistema de gestió de comandes de pizzes utilitzant el patró de disseny Builder en Java. El sistema ha de permetre la creació de diferents tipus de pizzes amb configuracions de mida, massa i ingredients diferents.

Defineix una classe Pizza amb els següents atributs:
size (mida)
dough (tipus de massa)
toppings (ingredients)
Crea una interfície PizzaBuilder amb els mètodes necessaris per configurar la mida, la massa i els ingredients d'una pizza.
Implementa una o més classes que actuïn com a constructors concrets (PizzaBuilder) per a diferents tipus de pizzes. Per exemple, podries tenir un constructor per a la pizza hawaiana, un altre per a la pizza vegetariana, etc.
Desenvolupa una classe MestrePizzer que rebi un PizzaBuilder i que permeti construir pizzes de manera específica.
En el programa principal (Main), crea instàncies de PizzaBuilder i de MestrePizzer, i utilitza'ls per construir pizzes amb diferents configuracions.

## Level :two:
#### Exercici 1
**Observer**
Dissenya un sistema en el qual un Agent de Borsa (Observable) notifica a diverses agències de Borsa (Observers) canvis quan la Borsa puja o baixa.
És necessari que l'objecte Observable mantingui referències als Observers.

## Level :three:
#### Exercici 1
**Callback**
Simula una passarel·la de pagament que rebi un objecte encapsulador del mètode de pagament a efectuar: targeta de crèdit, Paypal o deute en compte bancari.

La passarel·la invocarà el pagament sense conèixer la forma i retornant el control a la classe d'origen.
La classe que invoca la passarel·la de pagament serà una botiga de sabates.

## Installation :rocket:

Clone the repository (https://github.com/EstherBlacksmith/S3.02.Patterns2.git) in order to obtain the code and execute de
Main file in each package.

```bash
git clone https://github.com/EstherBlacksmith/S3.02.Patterns2.git
```
## Technology :computer:
* Java
* Gradle
* Unit5

## Usage 

>Each exercise/level is in it's own package. 
>
>You can run the exercises in diferent ways
>* Using your favorite IDE sofware by executing the main class or executing the tests.

## Contributing

Pull requests are welcome :purple_heart:. For major changes, please open an issue first to discuss what you would like to change 	:octocat:.

Please make sure to update tests as appropriate.

## License

[MIT](https://choosealicense.com/licenses/mit/)
