<h1>Spring Data JPA na Prática</h1>
<p>Projeto desenvolvido para o <a href="https://dio.me/"><strong> Cloud Fullstack Bootcamp - Warburg Pincus - Digital Innovation One</strong></a>.<br>

<h2>Objetivo do Projeto</h2>
<p>Conhecer os conceitos de ORM usando o <strong>Spring Data JPA</strong> para criar uma <strong>API RESTful</strong> simulando um sistema de academia com alunos e suas avaliações físicas.</p>


<h2>Tecnologias Utilizadas</h2>

<ul>
    <li>IDE IntelliJ</li>
    <li>Java 17</li>
    <li>Maven</li>
    <li><strong>Spring Web</strong></li>
    <li><strong>Spring Data JPA</strong></li>
    <li><strong>PostgreSQL Driver</strong></li>
    <li><strong>Hibernate Validator</strong></li>
    <li>Lombok</li>
    <li>Postman</li>
</ul>


<h2><a href="https://strn.com.br/artigos/2018/12/11/todas-as-anota%C3%A7%C3%B5es-do-jpa-anota%C3%A7%C3%B5es-de-mapeamento/"> Anotações de Mapeamento </a></h2>
<details>
<summary>Anotações</summary>
<br>
<strong>@Entity</strong>
 Especifica que a classe anotada atualmente representa um tipo de entidade.

<strong>@Table</strong>
Especifica a tabela principal da entidade atualmente anotada.

<strong>@Id</strong>
Especifica o identificador da entidade. Uma entidade deve sempre ter um atributo identificado.

<strong>@GeneratedValue</strong>
Especifica que o valor do identificador de entidade é gerado automaticamente.

<strong>@Column</strong>
Usada para especificar o mapeamento entre um atributo de entidade básico e a coluna da tabela de banco de dados.

<strong>@JoinColumn</strong>
Usada para especificar a coluna FOREIGN KEY. Indica que a entidade é a responsável pelo relacionamento.

<strong>@OneToMany</strong>
Usada para especificar um relacionamento de banco de dados um-para-muitos.

<strong>@OneToOne</strong>
Usada para especificar um relacionamento de banco de dados um-para-um.

<strong>@ManyToOne</strong>
Usada para especificar um relacionamento de banco de dados muitos-para-um.

<strong>cascade</strong>
Realizar operações em cascata só faz sentido em relacionamentos Pai - Filho.

<strong>mappedBy</strong>
Indica qual é o lado inverso ou não dominante da relação.

<strong>@NotEmpty</strong>
Indica que o valor do campo precisa ser preenchido.

<strong>@NotNull</strong>
Indica que o valor do campo não pode ser nulo.

<strong>@Size</strong>
Define os tamanhos minimos e máximos para o atributo a ser definido.

<strong>@Past</strong>
Testa se a data está no passado.

<strong>@Positive</strong>
Especifica que o valor do atributo definido precisa ser positivo.

</details>

<h2>Links Úteis</h2>

<ul>
    <li><a href="https://start.spring.io/#!type=maven-project&language=java&platformVersion=2.6.1&packaging=jar&jvmVersion=11&groupId=me.dio.academia&artifactId=academia-digital&name=academia-digital&description=Tutorial%20API%20RESTful%20modelando%20sistema%20de%20academia%20de%20gin%C3%A1stica&packageName=me.dio.academia.digital&dependencies=web,data-jpa,postgresql,validation,lombok">Spring Initializr</a></li>
    <li><a href="https://docs.spring.io/spring-boot/docs/2.0.x/reference/html/common-application-properties.html">Common application properties</a></li>
    <li><a href="https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.repositories">Spring Data JPA - Reference Documentation</a></li>
</ul>



---

Projeto base disponibilizado pela instrutora do curso "Conhecendo Spring Data JPA na prática com Java" [Camila Cavalcante](https://www.linkedin.com/in/cami-la/ "cami-la").




