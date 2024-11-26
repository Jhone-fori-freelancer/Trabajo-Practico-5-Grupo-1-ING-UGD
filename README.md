# Trabajo-Practico-5-Grupo-1-ING-UGD
PRACTICO 5 -FINAL-INGENIERIA DE SOFT-UG-2024


<!-- markdownlint-disable MD033 MD041 -->
<p align="center">
  <h3 align="center">⌨️ TP°5 </h3>
</p>

<p align="center">
  <img src="https://readme-typing-svg.demolab.com/?lines=Ingenieria+Del+Software!; Usando+JUnit+en NetBeans" alt="Example Usage - README Typing SVG">
</p>


</p>
<!-- markdownlint-enable MD033 -->



## ⚡Funcionalidades

1. **Clase Calculador**:  

   
   - Métodos: `sumar`, `restar`, `dividir`.

   
   - Maneja excepciones en caso de división entre cero.

2. **Pruebas con JUnit**:

  
   - **`CalculadorTest`**: Prueba las operaciones de suma y resta.

   
   - **`DivisionTest`**: Prueba la división entre cero utilizando `@Test(expected)`.
   - **`ParameterTest`**: Implementa pruebas parametrizadas con `@RunWith(Parameterized.class)`.

3. **Suite de Pruebas**:

  
   - **`MiSweetSuite`**: Ejecuta en orden todas las pruebas unitarias creadas.

## Uso de Anotaciones en JUnit

- **@Test**: Para definir métodos de prueba.
- **@BeforeClass**: Inicializa el objeto `Calculador` y muestra un mensaje de bienvenida.
- **@Before**: Muestra el nombre del método antes de cada prueba.
- **@After**: Muestra un mensaje después de cada prueba.
- **@AfterClass**: Indica que las pruebas han finalizado.
- **@RunWith y @Parameters**: Para implementar pruebas parametrizadas.
- **@Suite.SuiteClasses**: Para agrupar todas las pruebas en una suite.

## Ejecución

1. Clona este repositorio en NetBeans.
2. Ejecuta las pruebas:
   - Haz clic derecho en el proyecto y selecciona **Test Files > Run Tests**.
3. Observa los mensajes en la consola para cada etapa de la prueba.

## Estructura del Proyecto
# 🧮 **Calculador - Proyecto Java**

Este repositorio contiene una implementación de una calculadora básica con funcionalidades de **suma**, **resta** y **división**, acompañada de pruebas unitarias y parametrizadas para garantizar su funcionamiento y calidad.

---

## 📂 **Estructura del Proyecto**

```plaintext
📦 src/
├── 📁 main/
│   ├── 📁 java/
│   │   └── 📄 Calculador.java       # Clase principal con métodos de suma, resta y división
├── 📁 test/
│   ├── 📁 java/
│   │   ├── 📄 CalculadorTest.java   # Pruebas unitarias para suma y resta
│   │   ├── 📄 DivisionTest.java     # Pruebas para manejo de excepciones en división por cero
│   │   ├── 📄 ParameterTest.java    # Pruebas parametrizadas con múltiples casos de prueba
│   │   └── 📄 MiSweetSuite.java     # Suite para ejecutar todas las pruebas juntas
│   └── 📁 resources/                # Archivos adicionales (configuraciones o datos externos)


