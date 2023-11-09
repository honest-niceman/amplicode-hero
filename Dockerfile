FROM ubuntu:latest
LABEL authors="georgii"

ENTRYPOINT ["top", "-b"]