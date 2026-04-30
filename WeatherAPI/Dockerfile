FROM eclipse-temurin:24-jdk AS build
WORKDIR /app

# Install Maven
RUN apt-get update && apt-get install -y maven

# Copy source
COPY . .

# Build the JAR
RUN mvn clean package -DskipTests

# ---- Runtime image ----
FROM eclipse-temurin:24-jdk
WORKDIR /app
COPY --from=build /app/target/WeatherAPI-0.0.1-SNAPSHOT.jar app.jar
CMD ["java","-jar","app.jar"]
