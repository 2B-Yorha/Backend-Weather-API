FROM eclipse-temurin:24-jdk AS build
WORKDIR /app

# Copy Maven wrapper and source code
COPY . .

# Build the JAR
RUN ./mvnw clean package -DskipTests

# ---- Runtime image ----
FROM eclipse-temurin:24-jdk
WORKDIR /app

# Copy the built JAR from the build stage
COPY --from=build /app/target/WeatherAPI-0.0.1-SNAPSHOT.jar app.jar

CMD ["java","-jar","app.jar"]
