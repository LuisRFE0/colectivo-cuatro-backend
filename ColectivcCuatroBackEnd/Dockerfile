# Entorno de ejecución para aplicaciones java basado en OpenJDK 17
FROM azul/zulu-openjdk:17-latest
# copia el archivo .jar de la aplicación al directorio raíz del contenedor
# y le cambie el nombre a app.jar
COPY build/libs/ColectivcCuatroBackEnd-0.0.1-SNAPSHOT.jar app.jar
# Cuando se inicia el contenedor ejecutará el comando java -jar app.jar
# para iniciar la aplicación
ENTRYPOINT ["java","-jar","/app.jar"]
#indica que el contenedor escuchara el puerto 8080
EXPOSE 8080