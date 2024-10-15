FROM  nginx 
RUN sudo apt update -y 
WORKDIR /app
COPY ./ /usr/share/nginx/html/
EXPOSE 80
CMD ["nginx","g","daemon off";]

