
# Setup Guide for Java, NetBeans, and Maven

## Installation on Windows

### 1. Java (JDK) Installation
1. **Download the JDK**: 
   - https://www.oracle.com/il-en/java/technologies/downloads/#jdk22-windows
   - Download the installer for your version of Windows (e.g., Windows x64).

2. **Install the JDK**:
   - Run the downloaded installer.
   - Follow the on-screen instructions to install the JDK.
   - Set the `JAVA_HOME` environment variable:
     - Go to `Control Panel > System and Security > System > Advanced system settings`.
     - Click on "Environment Variables."
     - Under "System variables," click "New," and enter `JAVA_HOME` as the variable name and the path to your JDK installation (e.g., `C:\Program Files\Java\jdk-17`).
     - Add `%JAVA_HOME%\bin` to the `Path` variable under "System variables."

3. **Verify Installation**:
   - Open Command Prompt and type `java -version` to check the installed version.

### 2. NetBeans Installation
1. **Download NetBeans**:
   - https://www.apache.org/dyn/closer.lua/netbeans/netbeans-installers/22/Apache-NetBeans-22-bin-windows-x64.exe
   - Download the installer for Windows.

2. **Install NetBeans**:
   - Run the downloaded installer.
   - Follow the installation wizard to complete the setup.

### 3. Maven Installation
1. **Download Maven**:
   - https://dlcdn.apache.org/maven/maven-3/3.9.8/binaries/apache-maven-3.9.8-bin.zip .
   - Download the "Binary zip archive" for Windows.

2. **Install Maven**:
   - Extract the downloaded ZIP file to a directory (e.g., `C:\Program Files\Apache\maven`).
   - Set the `MAVEN_HOME` environment variable:
     - Follow the same steps as setting `JAVA_HOME`, but name it `MAVEN_HOME` and point to the extracted Maven directory.
     - Add `%MAVEN_HOME%\bin` to the `Path` variable.

3. **Verify Installation**:
   - Open Command Prompt and type `mvn -v` to check the Maven version.

---

## Installation on Linux (Ubuntu/Debian-based)

### 1. Java (JDK) Installation
1. **Update the package index**:
   ```bash
   sudo apt update
   ```

2. **Install the JDK**:
   - To install OpenJDK (e.g., version 17):
     ```bash
     sudo apt install openjdk-17-jdk
     ```

3. **Set `JAVA_HOME`**:
   - Find the installation path:
     ```bash
     sudo update-alternatives --config java
     ```
   - Add `JAVA_HOME` to your `.bashrc` or `.zshrc`:
     ```bash
     echo "export JAVA_HOME=$(dirname $(dirname $(readlink -f $(which java))))" >> ~/.bashrc
     source ~/.bashrc
     ```

4. **Verify Installation**:
   ```bash
   java -version
   ```

### 2. NetBeans Installation
1. **Download NetBeans**:
   - Visit the [NetBeans download page](https://netbeans.apache.org/download/index.html).
   - Download the Linux version.

2. **Install NetBeans**:
   - Make the installer executable:
     ```bash
     chmod +x Apache-NetBeans-*.sh
     ```
   - Run the installer:
     ```bash
     ./Apache-NetBeans-*.sh
     ```

3. **Follow the installation wizard**.

### 3. Maven Installation
1. **Install Maven**:
   ```bash
   sudo apt install maven
   ```

2. **Verify Installation**:
   ```bash
   mvn -v
   ```

## Installation of Zoom

### Installation on Windows

1. **Download Zoom**:
   - (https://zoom.us/download).
   - Under "Zoom Client for Meetings," click "Download."

2. **Install Zoom**:
   - Run the downloaded installer.
   - Follow the on-screen instructions to complete the installation.

3. **Launch Zoom**:
   - Once installed, you can launch Zoom from the Start menu.

### Installation on Ubuntu

1. **Download Zoom**:
   - (https://zoom.us/download).
   - Select "Linux Type" as Ubuntu and download the `.deb` package for your distribution.

2. **Install Zoom**:
   - Navigate to the directory where the `.deb` package was downloaded.
   - Install Zoom using the following command:
     ```bash
     sudo apt install ./zoom_amd64.deb
     ```

3. **Launch Zoom**:
   - You can start Zoom from the applications menu or by typing `zoom` in the terminal.

4. **Alternative Installation via Terminal**:
   - Add the Zoom repository and install directly from it:
     ```bash
     wget -O zoom_amd64.deb https://zoom.us/client/latest/zoom_amd64.deb
     sudo apt install ./zoom_amd64.deb
     ```



     ## Installation on macOS

### 1. Java (JDK) Installation
1. **Download the JDK**:
   - https://www.oracle.com/il-en/java/technologies/downloads
   - Download the installer for macOS.

2. **Install the JDK**:
   - Run the downloaded `.dmg` file.
   - Follow the on-screen instructions to install the JDK.
   - Set the `JAVA_HOME` environment variable:
     - Open Terminal and edit your shell profile (`.bash_profile`, `.zshrc`, or `.bashrc`):
       ```bash
       nano ~/.zshrc
       ```
     - Add the following line:
       ```bash
       export JAVA_HOME=$(/usr/libexec/java_home)
       ```
     - Save and close the file, then reload your profile:
       ```bash
       source ~/.zshrc
       ```

3. **Verify Installation**:
   - Open Terminal and type `java -version` to check the installed version.

### 2. NetBeans Installation
1. **Download NetBeans**:
   - Visit the [NetBeans download page](https://netbeans.apache.org/download/index.html).
   - Download the installer for macOS.

2. **Install NetBeans**:
   - Run the downloaded `.dmg` file and drag the NetBeans icon to your Applications folder.

3. **Launch NetBeans**:
   - Open NetBeans from the Applications folder.

### 3. Maven Installation
1. **Install Homebrew (if not already installed)**:
   - Open Terminal and run:
     ```bash
     /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
     ```

2. **Install Maven**:
   - Use Homebrew to install Maven:
     ```bash
     brew install maven
     ```

3. **Verify Installation**:
   - Open Terminal and type `mvn -v` to check the Maven version.

### 4. Zoom Installation
1. **Download Zoom**:
   - Visit the [Zoom Download Center](https://zoom.us/download).
   - Under "Zoom Client for Meetings," click "Download" for macOS.

2. **Install Zoom**:
   - Run the downloaded `.pkg` file.
   - Follow the on-screen instructions to complete the installation.

3. **Launch Zoom**:
   - Once installed, you can launch Zoom from the Applications folder.

---