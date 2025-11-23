FROM mysql:8.0

# Root password
ENV MYSQL_ROOT_PASSWORD=root

# user for the inventory example
ENV MYSQL_DATABASE=inventory
ENV MYSQL_USER=mysqluser
ENV MYSQL_PASSWORD=mysqlpw

# Copy MySQL configuration (binlog, ROW format, etc.)
COPY mysql.cnf /etc/mysql/conf.d/mysql.cnf

# Auto-run SQL on first container start
COPY import-data.sql /docker-entrypoint-initdb.d/import-data.sql

EXPOSE 3306
