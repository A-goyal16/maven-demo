# Maven Demo Project

A sample Java Maven project with GitHub Actions CI/CD pipeline.

## Project Structure

```
maven-demo/
├── .github/
│   └── workflows/
│       └── maven-ci.yml       # GitHub Actions pipeline
├── src/
│   ├── main/java/com/example/demo/
│   │   ├── App.java            # Main entry point
│   │   ├── GreetingService.java
│   │   └── MathUtils.java
│   └── test/java/com/example/demo/
│       ├── GreetingServiceTest.java
│       └── MathUtilsTest.java
├── pom.xml
├── .gitignore
└── README.md
```

## Prerequisites

- Java 17+
- Maven 3.8+
- Git

## Build & Run Locally

```bash
# Clone the repo
git clone https://github.com/<your-username>/maven-demo.git
cd maven-demo

# Compile
mvn clean compile

# Run tests
mvn test

# Package JAR
mvn clean package

# Run the JAR
java -jar target/maven-demo-1.0.0-jar-with-dependencies.jar
```

## GitHub Actions CI/CD

The pipeline at `.github/workflows/maven-ci.yml` runs automatically:

| Trigger | Jobs |
|---|---|
| Push / PR to `main` or `develop` | Build + Test |
| Push to `main` | Build + Test + Package JAR |
| Push a version tag (`v1.0.0`) | Build + Test + Package + GitHub Release |

### Creating a Release

```bash
git tag v1.0.0
git push origin v1.0.0
```

This triggers the release job and creates a GitHub Release with the JAR attached.

## Deploying to GitHub

### First-time setup

```bash
cd maven-demo
git init
git add .
git commit -m "Initial commit: Maven project setup"
git branch -M main
git remote add origin https://github.com/<your-username>/maven-demo.git
git push -u origin main
```
