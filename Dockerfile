FROM tomcat
COPY /target/dac-docker.war ${CATALINA_HOME}/webapps