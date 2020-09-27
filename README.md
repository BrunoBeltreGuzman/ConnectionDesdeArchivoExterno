# ConnectionDesdeArchivoExterno

# Conexión a Base de Datos desde Archivo externo Java

Hard-code básicamente el Hard-code o código-duro es valor de datos o comportamiento que se escribe directamente en un código de un programa, posiblemente en lugares múltiples, y el cual no puede ser modificado con facilidad, es decir, parte de un programa que se ha declarado invariable.

Por ejemplo, una constante está codificada de forma rígida y permanece igual durante la ejecución del programa, como los atributos para realizar la conexión a base de datos, lo normal es que dichos atributos se declaren en las misma clase o en el mismo archivo, lo recomendable es declarar todos estos en un archivo externo como un xml, json, o config y extraer los atributos de dicho archivo.

![Image](https://github.com/BrunoBeltreGuzman/ConnectionDesdeArchivoExterno/blob/master/FileScreenshots.png)

# Aquí realizo una conexión a sql server desde el lenguaje de programación Java
En Java se utiliza la clase Properties la cual permite manejar el conjunto de propiedades de un programa, siendo estas persistentes.

Muy importante es siempre un guardar el archivo de propiedades lo con extensión. PROPERTIES o properties, con extensión de archivo .XML, .CONFIG, .json o un .TXT entre otros, ya que es la mejor forma de reconocerlos.


Ejemplo:

# configuracion. properties.xml 

Para acceder a los atributos desde java se utiliza un objeto de tipo Properties para acceder a los atributos con el método getProperty(String key)
