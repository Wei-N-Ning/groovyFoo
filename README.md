# Groovy Scripting/Programing FooBar

## How to Create A New Groovy Project in Intellij

Because their official guide is a joke: <https://www.jetbrains.com/help/idea/getting-started-with-groovy.html>

### Prerequisites

```text
Intellij version: 2019.3.3 Ultimate
Java 1.8.0_242
Installed groovy the executable via brew 3.0.2
Downloaded apache-groovy-binary-3.0.2.zip, the binary-only groovy sdk
Unzip the sdk
```

sdk download page: <http://groovy-lang.org/download.html>

### Create Project 

choose groovy type; just make sure the java version is correct, I can't change other settings; give it
a proper location and name;

once done, RMB on the project root and choose `Add Framework Support`, choose the sdk directory.
if done correctly intellij will recognise the version (3.0.2).
this Q/A helped me: <https://intellij-support.jetbrains.com/hc/en-us/community/posts/206224119-How-to-configure-new-Groovy-SDK>

after this I can add new groovy class file via the `New` context menu;

this is a test:

```groovy
class com.groovyfoo.main.Main {
    static void main(String[] args) {
        println "asd"
    }
}
```

### Test Drive

just click the play button in the line number column