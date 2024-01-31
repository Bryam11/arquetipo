# Arquetipo para Desarrollo con Java 17 y Spring Cloud

Este arquetipo sirve como una plantilla para mantener un estándar en el desarrollo de aplicaciones utilizando Java 17 y Spring Cloud. La plantilla incluye configuraciones básicas para levantar una aplicación que se conecta a una base de datos PostgreSQL.

## Requisitos Previos
- Java 17 instalado en tu sistema.
- Maven instalado en tu sistema.
- PostgreSQL instalado y configurado.

## Instalación del Arquetipo

Antes de utilizar el arquetipo, necesitas instalarlo en tu repositorio local de Maven. Sigue estos pasos:

1. Clona este repositorio en tu máquina local.
2. Abre una terminal y navega hasta la carpeta del proyecto clonado.
3. Ejecuta el siguiente comando para compilar y empaquetar el arquetipo:

    ```
    mvn clean package
    ```

4. Luego, ejecuta el siguiente comando para instalar el arquetipo en tu repositorio local de Maven:

    ```
    mvn install:install-file -Dfile=archetype-1.0.0-SNAPSHOT.jar -DgroupId=org.brhyant -DartifactId=archetype -Dversion=1.0.0-SNAPSHOT -Dpackaging=jar
    ```

## Uso del Arquetipo

Una vez que el arquetipo está instalado en tu repositorio local, puedes utilizarlo para crear nuevos proyectos de la siguiente manera:

1. Abre una terminal y navega hasta la carpeta donde deseas crear tu nuevo proyecto.    
2. Ejecuta el siguiente comando para crear un nuevo proyecto utilizando el arquetipo:

    ```
    mvn archetype:generate -B -DarchetypeGroupId=org.brhyant -DarchetypeArtifactId=archetype -DarchetypeVersion=1.0.0-SNAPSHOT -DartifactId=userService -DserviceName=User -DserviceNameFolder=user/gestion -Dtype=DELETE
    ```

Este comando generará un nuevo proyecto llamado "userService" con la estructura y configuración definidas en el arquetipo. Asegúrate de personalizar los valores de "serviceName", "serviceNameFolder" y otros según tus necesidades.

## Contribución

Si encuentras algún problema o deseas contribuir con mejoras, por favor, abre un issue o envía un pull request en GitHub.

## Licencia

Este proyecto está bajo la Licencia MIT - consulta el archivo [LICENSE](LICENSE) para más detalles.
