# 自学light4j项目

## 建立light-rest-4j项目

### 参考文档
https://doc.networknt.com/tool/light-codegen/openapi-generator/

操作步骤
>* git clone https://github.com/networknt/light-codegen.git
>* cd light-codegen
>* mvn clean install
>* java -jar codegen-cli/target/codegen-cli.jar -f openapi -o ../define-rest-4j -m light-rest-4j/src/test/resources/openapi.json -c light-rest-4j/src/test/resources/config.json
>* cd ../define-rest-4j/
>* mvn clean install exec:exec
>* curl http://localhost:8080/server/info

GIT操作命令
>* git add *
>* git commit -m 'init project'
>* git push origin master
>* git pull