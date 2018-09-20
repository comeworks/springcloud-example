# 定制镜像,以一个镜像为基础，在其上进行定制,基础镜像是必须指定的.FROM就是指定基础镜像
# FROM 是必备的指令，并 且必须是第一条指令。
FROM openjdk:8-jdk
VOLUME /tmp
ADD comeworks-nano-eureka-server.jar comeworks-nano-eureka-server.jar
# RUN 指令是用来执行命令行命令的。
RUN sh -c 'touch /comeworks-nano-eureka-server.jar'
ENV LANG en_US.UTF-8  
ENV LANGUAGE en_US:en  
ENV LC_ALL en_US.UTF-8  
ENV JAVA_OPTS="-Djava.net.preferIPv4Stack=true -server -Xms1024m -Xmx1024m -Xmn256m -XX:PermSize=64m -XX:MaxPermSize=128m -Xss512k -XX:+PrintGCDetails -Xloggc:/home/centos/applogs/gc/comeworks-nano-eureka-server.gc -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/home/centos/applogs/gc/comeworks-nano-eureka-server.dump"
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /comeworks-nano-eureka-server.jar" ]
# * Dockerfile 中每一个指令都会建立一层


# 运行命令: docker run -d -p 10000:10000 -e "spring_profiles_active=dev" --name sample-app comeworks-nano-eureka-server
# spring_profiles_active=dev为改变运行环境的参数

# 手动创建images: docker build -t comeworks-nano-eureka-server .

