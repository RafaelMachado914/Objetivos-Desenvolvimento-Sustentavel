# Projeto de Desenvolvimento Sustentvel
<h2>Objetivo</h2>
Desenvolver, em grupo, um sistema desktop utilizando Java Swing, Hibernate e MySQL, a partir de uma demanda relacionada aos Objetivos de Desenvolvimento Sustentável, contemplando modelagem de banco de dados, CRUD de tabelas relacionadas, validação de informações, organização do código em camadas e apresentação funcional da solução.
<h2>ODS Relacionado</h2>
ODS 4 (Educação de Qualidade) *Possível Demanda de Sistema: Sistema de alunos, cursos e matrículas.
<h2>Proposta de Sistema </h2>
Plataforma de Cursos Complementares do IFSC: O cliente escolhido para o projeto é o IFSC. Identificou-se a necessidade de uma plataforma para oferta e gerenciamento de cursos complementares online durante os períodos de férias, permitindo que os alunos continuem seus estudos e obtenham horas complementares para sua formação acadêmica.Será desenvolvido um sistema desktop, capaz de cadastrar alunos, cursos e matrículas, além de gerenciar as inscrições realizadas. As principais entidades do sistema serão Aluno, Curso e Matrícula, sendo esta última responsável por relacionar os alunos aos cursos.O projeto está alinhado ao ODS 4 – Educação de Qualidade, pois busca ampliar as oportunidades de aprendizagem e ofertar um sistema com cursos de qualidade para os alunos durante as férias;
<h3>Estrutura das tabelas</h3>
<code>
Aluno: (id_aluno chave primária Int,
nome varchar,
matricula_ifsc varchar,
email varchar,
curso_academico varchar)
  
Exemplo:1 | Davi | 20241001 | davi@ifsc.edu.br |

Curso: 
(id_curso chave primária Int auto incrementa,
nome varchar,
descricao,
carga_horaria int)

Exemplo:1 | Java Básico | Introdução ao Java | 20h

Matrícula: 
(id_matricula int Chave Primária,
Chaves Estrangeiras int (FK):id_aluno,
id_curso, data_matricula date,
status varchar);

Ex do atributo Status: Matriculado Em andamento
</code>
<h3>Relacionamentos</h3>
Aluno (1) ---- (N) MatrículaUm aluno pode ter várias matrículas.Curso (1) ---- (N) MatrículaUm curso pode possuir vários alunos matriculados.
