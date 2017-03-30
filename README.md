# Build Processing library using Gradle
This template allows you to create a processing library which can be packaged using gradle.

## Prerequisites 
Good knowledge of processing library structure. See the [Official Documentation](https://github.com/processing/processing/wiki/Library-Overview).

## How to setup
### Step 1: Download
Download the zipped repository and exctract it in a folder in `<your processing sketch folder>/libraries`
> ex .../Processing/libraries/my-lib

### Step 2: Configure
- Setup **libraries.properties**. 

  This file contains processing library infos (such as name, author, repo, ecc.).

- Setup **build.gradle**.

  If you want to run library examples from gradle, you must setup in the following closures the processing install location
  > ex. D:/Programs/Processing/processing-3.2.1
  
  ```groovy
  processing {
    directory: '<your/processing/directory>'
  }
  ```
### Step 3: Write your library
- Code

  Write library java code inside the `<root>/src` folder. A default package is provided containing a basic library class.
  
  You can replace this package with your own.
  
  The package will be available for `import` .pde files in the editor.
  
- Examples

  Create examples in the `<root>/examples`, using a similar structure:
  
  ```
  root
  ∟ examples
  |   ∟ FirstExample
  |      ∟ FirstExample.pde
  |   ∟ SecondExample
  |      ∟ SecondExample.pde
  ∟ src
  ∟ library
  ∟ build.gradle
  ```
### Step 4: Compile the library
- Run `gradle packJar`in the terminal in the same directory of `build.gradle` and `processing-lib.gradle`.
  
  This task compile the source code into a jar placed in `<root>/library`.
  
  
### Step 5: Add the library to your .pde project
You can use the library once compiled in a standard project or in a example project (placed in `<root>/examples`)
directly from processing: `Sketch > Import Library > YourLibrary`. 

The library name in `Import Library` dropdown is the one defined in library.properties.


