# Inspection test task

![Build](https://github.com/Soarex16/intellij-idea-inspection-demo/workflows/Build/badge.svg)

<!-- Plugin description -->
This Fancy IntelliJ Platform Plugin is going to be your implementation of the brilliant ideas that you have.

This specific section is a source for the [plugin.xml](/src/main/resources/META-INF/plugin.xml) file which will be extracted by the [Gradle](/build.gradle.kts) during the build process.

To keep everything working, do not remove `<!-- ... -->` sections.
<!-- Plugin description end -->

## Build
You can use prebuilt binaries [here](https://github.com/Soarex16/intellij-idea-inspection-demo/releases/latest).

For building and developing this project you should install Intellij IDEA 2021.3.2

The project is built with Gradle. Run Gradle to build the project and to
run the tests using the following command on Unix/macOS or execute `jar` task:

```shell
./gradlew :jar
```

or the following command on Windows:

```shell
gradlew :jar
```

As a result, the jar file with the plugin is located in `build/libs/intellij-idea-inspection-demo-<VERSION>.jar`

## Installation

For using this plugin you should install IntelliJ IDEA 2021.3.2

Download the [latest release](https://github.com/Soarex16/intellij-idea-inspection-demo/releases/latest) and install it manually using
<kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from disk...</kbd>
