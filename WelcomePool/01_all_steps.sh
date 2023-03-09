rm -rf out/ wildfly-26.1.3.Final/
unzip wildfly-26.1.3.Final.zip
./100_compile.sh
./110_configure.sh
./120_deploy.sh
./200_start.sh
