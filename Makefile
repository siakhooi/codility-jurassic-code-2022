clean:
	mvn clean
compile:
	mvn compile
jar:
	mvn package -Dmaven.test.skip=true
test:
	mvn test

run1:
	java -cp target/classes nsh.codility.JurassicCode2022A
test1:
	mvn test -Dtest=nsh.codility.JurassicCode2022A*
