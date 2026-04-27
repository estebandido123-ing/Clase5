# deber2

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: <https://quarkus.io/>.

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:

```shell script
./mvnw quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at <http://localhost:8080/q/dev/>.

## Packaging and running the application

The application can be packaged using:

```shell script
./mvnw package
```

It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:

```shell script
./mvnw package -Dquarkus.package.jar.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using:

```shell script
./mvnw package -Dnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using:

```shell script
./mvnw package -Dnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/deber2-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult <https://quarkus.io/guides/maven-tooling>.

## Provided Code

### REST

Easily start your REST Web Services

[Related guide section...](https://quarkus.io/guides/getting-started-reactive#reactive-jax-rs-resources)



A. @ApplicationScoped
El bean se crea una sola vez para toda la aplicación y se accede a él a través de un proxy. Es la opción recomendada para la mayoría de los servicios en Quarkus porque permite la recarga en caliente (Hot Reload).

1_Servicio de Autenticación: Para validar tokens en toda la app.

2_Repositorio de Usuarios: Acceso a base de datos persistente.

3_Gestor de Configuración: Leer variables del application.properties.

4_Cliente REST Externo: Bean que consume una API de terceros.

5_Procesador de Pagos: Lógica de negocio centralizada.

6_Servicio de Email: Bean encargado de encolar correos.

7_Validador de Reglas de Negocio: Lógica compartida por varios endpoints.

B. @Singleton
Similar a ApplicationScoped, pero no usa un proxy. El bean es la instancia directa. Es más eficiente en rendimiento pero menos flexible (no funciona bien con Mockito en tests o con Hot Reload en ciertos casos).

1_Caché de Solo Lectura: Almacenar datos estáticos que no cambian.

2_Contador Global de Visitas: Un simple AtomicInteger compartido.

3_Diccionario de Códigos de Error: Mapeo estático de excepciones.

4_Registro de Auditoría Simple: Logger personalizado de sistema.

5_Configuración de Hardware: Si el software interactúa con un sensor específico.

6_Pool de Conexiones Fijo: Gestión de recursos limitados.

7_Filtro de Seguridad Global: Interceptor único de peticiones.

C. @Dependent
Es el ámbito por defecto. Se crea una nueva instancia cada vez que se inyecta el bean y su vida depende del objeto que lo contiene.

1_Generador de Números Aleatorios: Para obtener una semilla nueva cada vez.

2_Helper de Formateo de Fechas: Utilidad que no necesita mantener estado.

3_Calculadora de Impuestos Temporal: Instancia creada para una operación única.

4_Mapper de DTO a Entidad: Conversor de datos de un solo uso.

5_Logger Específico por Clase: Para que cada clase tenga su propio rastro.

6_Validador de Formulario: Objeto creado para validar un request específico.

7_Generador de IDs Temporales: Para crear folios únicos en procesos aislados.

