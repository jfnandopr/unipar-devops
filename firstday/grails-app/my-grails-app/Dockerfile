FROM openjdk:8 as builder
COPY . /app
WORKDIR /app
RUN ./grailsw prod war

FROM tomcat:9.0.65-jre8
COPY --from=builder /app/build/libs/*.war /usr/local/tomcat/webapps/ROOT.war
