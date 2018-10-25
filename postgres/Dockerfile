FROM postgres
ENV POSTGRES_DB dac
ENV POSTGRES_USER job
ENV POSTGRES_PASSWORD 123
COPY create.sql /docker-entrypoint-initdb.d/
COPY insert.sql /docker-entrypoint-initdb.d/
#docker-entrypoint-initdb.d
