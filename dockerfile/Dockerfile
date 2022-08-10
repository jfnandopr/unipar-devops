FROM ubuntu

RUN apt-get update -y; \
    apt-get install -y nginx curl; \
    rm -rf /var/lib/apt/lists/*

VOLUME ["/var/www/html", "/var/log/nginx"]

EXPOSE 80/tcp

WORKDIR /var/www/

COPY entrypoint.sh /entrypoint.sh
RUN chmod +x /entrypoint.sh

#ADD index.tar.gz /var/www/html/

ENTRYPOINT ["/entrypoint.sh"]
CMD ["/usr/sbin/nginx", "-g", "daemon off;"]
