# 🐱 CatStore API – Backend  
### API REST desarrollada con Spring Boot + JWT

Este repositorio contiene el backend de CatStore.

📌 Repositorio: https://github.com/PaulinaCampusano/CatStore-api.git  
La API provee autenticación, gestión de productos y lectura de órdenes.  
Debe ejecutarse **antes** de levantar el frontend.

---

# 🚀 Requisitos previos

Instalar:

- **Java 17 o superior**  
- **Maven 3+**  
- **XAMPP o MySQL Server**  
- **Postman o Swagger (opcional)**

---

# 🧰 1. Configurar MySQL usando XAMPP

1. Abrir XAMPP  
2. Encender **Apache** (opcional) y **MySQL** (obligatorio)  
3. Abrir **phpMyAdmin**  
4. Crear una base de datos llamada:

catstore_db

*(Sin tablas; Hibernate las crea automáticamente).*

---

#🛠 2. Configurar application.properties

En src/main/resources/application.properties ajustar:

properties
spring.datasource.url=jdbc:mysql://localhost:3306/catstore

spring.datasource.username=root
spring.datasource.password=TU_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

📥 3. Clonar el repositorio

git clone https://github.com/PaulinaCampusano/CatStore-api.git
cd CatStore-api

▶ 4. Ejecutar el backend

mvn spring-boot:run
Si funciona correctamente verás:


Started CatStoreApplication in X seconds
La API quedará disponible en:
👉 http://localhost:8080

Swagger UI disponible en:
👉 http://localhost:8080/swagger-ui/index.html

📡 5. Endpoints principales

🔹 Autenticación

POST /api/v1/auth/login

🔹 Productos

GET /api/v1/products

POST /api/v1/products

PUT /api/v1/products/{id}

DELETE /api/v1/products/{id}

🔹 Órdenes

GET /api/v1/orders

🛂 Roles permitidos

Rol	Permisos

-ADMIN	CRUD completo de productos + ver órdenes

-VENDEDOR	Ver productos + ver órdenes

-CLIENTE	Navegación pública (sin backend protegido)

🔗 6. Integración con el frontend

El backend debe ejecutarse primero.

Luego, iniciar el frontend en:

👉 http://localhost:5173

El frontend consumirá automáticamente los endpoints del backend.

🔧 7. Solución de problemas

❌ Error “Cannot connect to database”

Verificar:

XAMPP → MySQL encendido

Credenciales correctas

Puerto 3306 disponible

❌ Swagger no carga

Verificar que el puerto 8080 no esté ocupado.

❌ El frontend no puede acceder a la API

Confirmar que:

Backend → encendido

URL correcta → http://localhost:8080

No haya errores de CORS

📄 Observación importante

Sin la base de datos funcionando en MySQL/XAMPP, el backend no iniciará.

¡Backend listo! 🐾
