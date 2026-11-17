
FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY PrimeNumber.java .

RUN javac PrimeNumber.java

CMD ["java", "PrimeNumber"]
