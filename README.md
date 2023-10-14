Code from book named Algorithm in Java by Robert Sedgewick and Kevin Wayne 

Example: compile and run java file with option -classpath
javac -classpath /opt/work/java/algs4/algs4.jar /opt/work/java/projects/algorithms_in_java/page50_RandomSeq/RandomSeq.java
java -classpath /opt/work/java/algs4/algs4.jar:/opt/work/java/projects/algorithms_in_java/page50_RandomSeq RandomSeq 1000 100.0 200.0 > /opt/work/java/data.txt

Example: run one java program, get out arguments and use these arguments in other java program
java -classpath /opt/work/java/algs4/algs4.jar:/opt/work/java/projects/algorithms_in_java/page50_RandomSeq RandomSeq 1000 10.0 20.0 | java -classpath /opt/work/java/algs4/algs4.jar:/opt/work/java/projects/algorithms_in_java/page52 Average

