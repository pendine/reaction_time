FROM ubuntu:latest

ENTRYPOINT ["top", "-b"]


# PostgreSQL 이미지 사용
FROM postgres:latest

# 환경 변수 설정
ENV POSTGRES_USER=myuser
ENV POSTGRES_PASSWORD=mypassword
ENV POSTGRES_DB=mydatabase

# 초기화 스크립트 복사 (선택 사항)
# COPY init.sql /docker-entrypoint-initdb.d/