FROM eclipse-temurin
LABEL authors="xianyue"

# 暴露8080端口
EXPOSE 8080

# 添加变量，如果使用dockerfile-maven-plugin，则会自动替换这里的变量内容
ARG JAR_FILE=target/RuleNumberGenerator.jar

# 往容器中添加jar包
ADD ${JAR_FILE} app.jar

# 启动镜像自动运行程序
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/urandom","-jar","/app.jar"]
