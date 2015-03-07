rm -rf $HOME/.m2/repository/ch/ethz
rm service-impl/dblp-test
#Compile everything
mvn clean package
