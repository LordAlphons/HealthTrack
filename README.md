# HealthTrack 🩺📊

[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=LordAlphons_HealthTrack&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=LordAlphons_HealthTrack)

**HealthTrack** es una aplicación Java orientada al seguimiento de salud personal, diseñada con principios de calidad de software, automatización y cobertura de código continua.

---

## 🚀 Características principales

- 🧪 Pruebas automatizadas con Maven y JUnit
- ✅ Cobertura de código con JaCoCo
- 🧠 Análisis estático con SonarCloud y CI/CD
- 📦 Gestión de dependencias con Maven
- ⚙️ Cacheo inteligente para builds eficientes

---

## 🔧 Tecnologías

- Java 17 (Temurin)
- Maven
- JUnit 5
- JaCoCo
- GitHub Actions
- SonarCloud

---

## ⚙️ Cómo ejecutar el proyecto

```bash
mvn clean install
```

Para generar los reportes de cobertura:

```bash
mvn jacoco:report
```

Y para ejecutar manualmente el análisis estático (opcional):

```bash
mvn verify sonar:sonar \
  -Dsonar.projectKey=LordAlphons_HealthTrack \
  -Dsonar.organization=lordalphons \
  -Dsonar.host.url=https://sonarcloud.io \
  -Dsonar.token=TU_TOKEN_AQUI
```

---

## 🧪 Pruebas y cobertura

Los tests se ejecutan automáticamente al compilar el proyecto, y generan:

- Reportes en: `target/surefire-reports`
- Cobertura HTML en: `target/site/jacoco/index.html`

---

## 📊 Análisis estático

El análisis de calidad se realiza automáticamente en cada push a `master`, gracias al pipeline configurado en GitHub Actions. SonarCloud analiza:

- Code Smells 😷
- Bugs 🐞
- Cobertura de código 📈
- Seguridad 🔐

Accedé al tablero 👉 [SonarCloud: HealthTrack](https://sonarcloud.io/dashboard?id=LordAlphons_HealthTrack)

---

## 📂 CI/CD

El workflow se ejecuta desde `.github/workflows/ci.yml` y realiza:

1. Checkout del repositorio (`fetch-depth: 0`)
2. Configuración de JDK 17
3. Cacheo de dependencias
4. Ejecución de pruebas
5. Generación del reporte de cobertura
6. Análisis en SonarCloud
7. Publicación de artefactos del reporte

---

## 👤 Autor

Desarrollado por [Alfonso Garrido]
Full Stack Developer apasionado por la automatización, la eficiencia y los videojuegos 🎮

---

## 📄 Licencia

MIT License — libre para que aprendas, compartas y expandas 🚀