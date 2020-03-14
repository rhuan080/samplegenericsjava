#Generics com Java

Neste projeto temos alguns exemplos de como funciona as propriedades de variância (covariância, contravariância 
e invariancia) no Java e como elas impactam o nosso código. Este projeto está dividido em pacotes de acordo com os temas
e cada tema tem uma classe com um metodo main para testar. Abaixo temos os pacotes com os respectivos termas:

 - **org.soujava.generics.covariancia**: Testa a proprieda de covariância no retorno do método. Também temos uma 
 simulação de erro preparada na classe Socio, que tem a instrução nos comentários da própria classe.
 
 - **org.soujava.generics.contravariancia**: À desenvolver.
 
 - **org.soujava.generics.invariancia**: Testa a proprieda de invariancia nos parametros dos método. Também temos uma 
  simulação de erro preparada na classe Socio, que tem a instrução nos comentários da própria classe.
  
 OBS.: Para entender o cenário leia os comentários nas classes testadas e observe bem o que está sendo feito nelas.
  
### Testando os cenários
 
#### Covariância:
   
    mvn clean package -Dmainclass=org.soujava.generics.covariancia.Test 

    java -jar target/generics-1.0-SNAPSHOT.jar
    

#### Contravariância:
   
    mvn clean package -Dmainclass=org.soujava.generics.contravariancia.Test 

    java -jar target/generics-1.0-SNAPSHOT.jar

#### Invariância:
   
    mvn clean package -Dmainclass=org.soujava.generics.invariancia.Test 

    java -jar target/generics-1.0-SNAPSHOT.jar
    
