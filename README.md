# HealthTrack 🩺📊

**HealthTrack** es una aplicación Java orientada al seguimiento de salud personal, diseñada con principios de calidad de software, automatización y cobertura de código continua.

---

## 🚀 Características principales

- 🧪 Pruebas automatizadas con Maven y JUnit
- 📦 Gestión de dependencias con Maven
- ✅ Integración continua con GitHub Actions
- 🎯 Cobertura de código con JaCoCo
- 🧠 Análisis estático de código con SonarQube
- ♻️ Uso de caché para mejorar tiempos de build

---

## 🔧 Tecnologías

- Java 17 (Temurin)
- Maven
- JUnit
- JaCoCo
- GitHub Actions
- SonarQube (instancia local vía Docker)

---

## ⚙️ Cómo ejecutar el proyecto

```bash
mvn clean install

O bien, para ver reportes y cobertura:

mvn verify jacoco:report

🧪 Pruebas unitarias
Los tests se ejecutan automáticamente al compilar el proyecto y generan reportes en:
target/surefire-reports

La cobertura de código está disponible en:
target/site/jacoco/index.html


📊 Análisis de código
El análisis de calidad y cobertura se realiza con SonarQube:
- URL local: http://localhost:9000
- Proyecto: HealthTrack
- Integrado vía GitHub Actions


📂 Estructura del pipeline CI/CD
El flujo automatizado realiza:
- Checkout del repositorio
- Configuración de JDK 17
- Caché de dependencias Maven
- Ejecución de pruebas con cobertura
- Reporte HTML de JaCoCo como artefacto
- Análisis en SonarQube
Todo desde .github/workflows/ci.yml

📥 Instalación de SonarQube (opcional)
docker run -d --name sonarqube \
  -p 9000:9000 \
  -e SONAR_ES_BOOTSTRAP_CHECKS_DISABLE=true \
  sonarqube:lts


🧑‍💻 Autor
Desarrollado por Alfonso Garrido
Apasionado por la eficiencia, la automatización y los videojuegos 🎮

📄 Licencia
MIT License