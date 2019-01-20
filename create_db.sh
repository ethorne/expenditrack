#! /bin/sh

-echo "enter mysql user name"
-read -r USR

mysql -u$USR -p < "CREATE DATABASE etdb CHARACTER SET = 'utf8';"

exit 0
