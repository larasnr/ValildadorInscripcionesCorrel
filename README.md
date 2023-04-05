<h1>Validador de Inscripciones según Correlatividades</h1>

<h2>Contexto</h2>
<p>Nos han solicitado el diseño y el desarrollo de un Validador de Inscripciones según materias correlativas.
En las carreras terciarias y universitarias, para ordenar el plan de estudios y asegurar que cuando se inicia
una materia se tienen todos los conocimientos necesarios para entenderla, se establece lo que se llama
comúnmente “materias correlativas”.</p>
<p>Básicamente, son materias que hay que tener aprobadas antes de
cursar la materia en cuestión. Por ejemplo, antes de cursar Diseño de Sistemas hay que cursar Paradigmas
de Programación y antes de ésta hay que cursar Algoritmos y Estructuras de Datos, donde esta última no
tiene correlativas.</p>

<h2>Consigna</h2>
<p>Teniendo en cuenta que el método principal del presente módulo debe ser el método “boolean
aprobada()” de la clase Inscripción, y teniendo como restricción que solamente se podrán utilizar,
además de la clase Inscripción, la clase Materia y Alumno; se pide:
<ol>
  <li>Diseñar una solución en el Paradigma Orientado a Objetos y comunicar la solución mediante un Diagrama de Clases.</li>
  <li>Codificar la solución (lenguaje a elección o pseudo-código)</li>
</ol>
</p>
<h2>Resolucion</h2>
<ol>
  <li><img src="https://user-images.githubusercontent.com/48871266/230237168-9e29a6f2-119f-4179-a201-d4e40b902ec1.png"></li>
  <p>Se modeló una relación de composición de inscripción a materia ya que la primera no tendría sentido en existir si no contiene materias. Por otro lado, Alumno está asociado a Materia mediante una relación de asociación simple ya que se modelan listas de materias en las clases Alumnos. Con respecto a Inscripción y Alumno, ambas clases se conocen así que se modeló la relación con asociación bidireccional, ya que Inscripción necesita usar a Alumno para sus métodos y modificarlo y viceversa.</p>
  <li>Commiteado :)</li>
</ol>
</p>

 
